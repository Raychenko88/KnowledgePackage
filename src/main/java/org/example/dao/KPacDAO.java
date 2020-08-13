package org.example.dao;

import org.example.model.KPac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KPacDAO extends JpaRepository<KPac, Integer> {

    List<KPac> findAllByIdKPacSet(Integer id);
}
