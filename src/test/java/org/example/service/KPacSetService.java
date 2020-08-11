package org.example.service;

import org.example.model.KPac;
import org.example.model.KPacSet;

public interface KPacSetService {

    KPacSet save(KPacSet kPacSet) throws Exception;
    KPacSet update(KPacSet kPacSet) throws Exception;
    KPacSet findById(Integer id) throws Exception;
    KPacSet findAll() throws Exception;
    void delete(KPacSet kPacSet);
}
