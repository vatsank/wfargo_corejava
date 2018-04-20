package com.training.domains;

import java.util.List;

public interface DAO {

	public long add(Customer cust);
	public List<Customer> findAll();
	
	public List<Customer> getSortedList();
	
	
}
