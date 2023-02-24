package com.klef.jfsd.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.BranchManager;
import com.klef.jfsd.springboot.repository.BranchManagerRepository;

@Service
public class BranchManagerServiceImpl implements BranchManagerService {

	@Autowired
	private BranchManagerRepository branchManagerRepository;
	
	@Override
	public BranchManager addcustomer(BranchManager bmanager) {
		
		return branchManagerRepository.save(bmanager);
	}

	@Override
	public BranchManager checkbmlogin(String uname, String pwd) {
		
		return branchManagerRepository.checkbmlogin(uname, pwd);
	}

}
