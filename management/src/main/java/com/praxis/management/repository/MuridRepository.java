package com.praxis.management.repository;

import com.praxis.management.model.Murid;
//import com.praxis.management.model.Kelas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MuridRepository extends JpaRepository<Murid, Long>{

}