package com.employe.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employe.model.EmployeEntity;

@Repository
public interface EmployeRepo extends CrudRepository<EmployeEntity, Long> {


    
}