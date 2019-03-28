package com.dmantznr.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.dmantznr.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee,Integer>{

}
