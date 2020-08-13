package org.example.dao;

import org.example.model.KPacSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KPacSetDAO extends JpaRepository<KPacSet, Integer> {

}
