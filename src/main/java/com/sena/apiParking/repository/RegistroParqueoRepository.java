package com.sena.apiParking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.apiParking.model.RegistroParqueo;

public interface RegistroParqueoRepository extends JpaRepository<RegistroParqueo, Long> { 

}
