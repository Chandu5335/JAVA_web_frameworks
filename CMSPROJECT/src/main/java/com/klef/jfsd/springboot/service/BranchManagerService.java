package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.BranchManager;
import com.klef.jfsd.springboot.model.Customer;

public interface BranchManagerService {
  
	public BranchManager addcustomer(BranchManager bmanager);
	public BranchManager checkbmlogin(String uname,String pwd);

	
}
