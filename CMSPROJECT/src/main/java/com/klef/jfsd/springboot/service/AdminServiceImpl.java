package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.repository.AdminRepository;
import com.klef.jfsd.springboot.repository.BranchManagerRepository;
import com.klef.jfsd.springboot.repository.CustomerRepository;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private BranchManagerRepository branchManagerRepository;
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Admin checkadminlogin(String uname, String pwd) {
				
		return adminRepository.checkadminlogin(uname, pwd);
	}

	@Override
	public List<Customer> viewallcustomers() {
		
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public Customer viewcustomerbyid(int id) {
		
		return customerRepository.findById(id).get();
	}

	@Override
	public void deletecustomer(int id) {
		
		customerRepository.deleteById(id);
		
	}

}
