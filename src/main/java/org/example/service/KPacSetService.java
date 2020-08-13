package org.example.service;

import org.example.model.KPac;
import org.example.model.KPacSet;

import java.util.List;

public interface KPacSetService {

    KPacSet save(KPacSet kPacSet) throws Exception;

    KPacSet update(KPacSet kPacSet) throws Exception;

    KPacSet findById(Integer id) throws Exception;

    List<KPacSet> findAll() throws Exception;

    List<KPac> findAllByIdKPacSet(Integer id) throws Exception;

    void delete(KPacSet kPacSet);
}
