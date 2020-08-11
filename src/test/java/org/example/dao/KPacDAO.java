package org.example.dao;

import org.example.model.KPac;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KPacDAO extends JpaRepository<KPac, Integer> {

}
