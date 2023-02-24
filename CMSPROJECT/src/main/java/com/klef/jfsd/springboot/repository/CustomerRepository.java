package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
	
@Query("select a from Customer a where username=?1 and password=?2")
public Customer checkcustomerlogin(String uname,String pwd);

@Query("select e from Customer e where username=?1")
public Customer viewemployee(String uname);


}
