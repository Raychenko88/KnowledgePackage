package org.example.service;

import org.example.model.KPac;
import org.example.model.KPacSet;

public interface KPacService {

    KPac save(KPac kPac) throws Exception;
    KPac update(KPac kPac) throws Exception;
    KPac findById(Integer id) throws Exception;
    KPac findAll() throws Exception;
    void delete(KPac kPac);
}
