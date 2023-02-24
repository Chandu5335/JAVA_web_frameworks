package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Customer;

public interface CustomerService {
	public Customer addcustomer(Customer employee);
	public Customer checkcustomerlogin(String uname,String pwd);
	public Customer addemployee(Customer customer);

}
