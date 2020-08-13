package org.example.service;

import org.example.model.KPac;

import java.util.List;

public interface KPacService {

    KPac save(KPac kPac) throws Exception;

    KPac update(KPac kPac) throws Exception;

    KPac findById(Integer id) throws Exception;

    List<KPac> findAll() throws Exception;

    List<KPac> findAllByIdKPacSet(Integer id) throws Exception;

    void delete(KPac kPac);
}
