package org.example.service.impl;

import org.example.dao.KPacSetDAO;
import org.example.model.KPacSet;
import org.example.service.KPacSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KPacSetServiceImpl implements KPacSetService {

    @Autowired
    KPacSetDAO kPacSetDAO;


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

    @Override
    public KPacSet findAll() throws Exception {
        if (kPacSetDAO.findAll().isEmpty()){
            throw new Exception("no kPacSets found");
        }
        return kPacSetDAO.findAll();
    }

    @Override
    public void delete(KPacSet kPacSet) {
        kPacSetDAO.delete(kPacSet);
    }
}
