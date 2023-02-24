package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.springboot.model.BranchManager;
import com.klef.jfsd.springboot.model.Customer;

@Repository
public interface BranchManagerRepository extends CrudRepository<BranchManager, Integer> {
	@Query("select a from BranchManager a where username=?1 and password=?2")
	public BranchManager checkbmlogin(String uname,String pwd);

	@Query("select e from BranchManager e where username=?1")
	public BranchManager viewebm(String uname);

}
