package org.example.service.impl;

import org.example.dao.KPacSetDAO;
import org.example.model.KPac;
import org.example.model.KPacSet;
import org.example.service.KPacService;
import org.example.service.KPacSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class KPacSetServiceImpl implements KPacSetService {

    @Autowired
    KPacSetDAO kPacSetDAO;

    @Autowired
    KPacService kPacService;


    @Override
    public KPacSet save(KPacSet kPacSet) throws Exception {
        if (kPacSet.getId() != null){
            throw new Exception("kPacSet already exists");
        }
        return kPacSetDAO.save(kPacSet);
    }

    @Override
    public KPacSet update(KPacSet kPacSet) throws Exception {
        if (kPacSet.getId() == null){
            throw new Exception("kPacSet id not found");
        }
        return kPacSetDAO.save(kPacSet);
    }

    @Override
    public KPacSet findById(Integer id) throws Exception {
        return kPacSetDAO.findById(id).orElseThrow(() -> new Exception("kPacSet not found"));
    }

    // находит все kPacSet и сортирует их по id
    @Override
    public List<KPacSet> findAll() throws Exception {
        List<KPacSet> list = kPacSetDAO.findAll();
        if (list.isEmpty()){
            throw new Exception("no kPacSets found");
        }
        list.sort(Comparator
                .comparing(KPacSet::getId));
        return list;
    }

    // ищет и фильтрует все kPacs по id PacSet и сортирует по kPacs id
    @Override
    public List<KPac> findAllByIdKPacSet(Integer id) throws Exception {
        return kPacService.findAllByIdKPacSet(id);
    }

    @Override
    public void delete(KPacSet kPacSet) {
        kPacSetDAO.delete(kPacSet);
    }
}
