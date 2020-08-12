package org.example.service.impl;

import org.example.dao.KPacDAO;
import org.example.model.KPac;
import org.example.model.KPacSet;
import org.example.service.KPacService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class KPacServiceImpl implements KPacService {

    @Autowired
    KPacDAO kPacDAO;

    @Override
    public KPac save(KPac kPac) throws Exception {
        if (kPac.getId() != null){
            throw new Exception("kPac already exists");
        }
        return kPacDAO.save(kPac);
    }

    @Override
    public KPac update(KPac kPac) throws Exception {
        if (kPac.getId() == null){
            throw new Exception("kPac id not found");
        }
        return kPacDAO.save(kPac);
    }

    @Override
    public KPac findById(Integer id) throws Exception {
        return kPacDAO.findById(id).orElseThrow(() -> new Exception("kPac not found"));
    }

    @Override
    public List<KPac> findAll() throws Exception {
        if (kPacDAO.findAll().isEmpty()){
            throw new Exception("no kPacs found");
        }
        return kPacDAO.findAll();
    }

    @Override
    public List<KPac> findAllByIdKPacSet(Integer id) throws Exception {
        List<KPac> list = kPacDAO.findAllByIdKPacSet(id);
        if (list.isEmpty()){
            throw new Exception("no kPacs found");
        }
        list.sort(Comparator
                .comparing(KPac::getId));
        return list;
    }

    @Override
    public void delete(KPac kPac) {
        kPacDAO.delete(kPac);
    }
}
