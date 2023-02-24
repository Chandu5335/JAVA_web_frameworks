package com.klef.jfsd.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>
{

}
