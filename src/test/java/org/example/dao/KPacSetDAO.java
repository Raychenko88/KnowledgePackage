package org.example.dao;

import org.example.model.KPac;
import org.example.model.KPacSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface KPacSetDAO extends JpaRepository<KPacSet, Integer> {

}
