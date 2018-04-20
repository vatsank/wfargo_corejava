package com.training.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerManager implements DAO {

	private List<Customer> customerList = null;
	
	
	public CustomerManager() {
		super();
		
		customerList = new ArrayList<Customer>();
		
	}

	@Override
	public long add(Customer cust) {
		
		 customerList.add(cust);
		 
		return cust.getCustomerId();
	}

	@Override
	public List<Customer> findAll() {
	
		 Collections.sort(customerList);
		 
		return this.customerList;
	}

	@Override
	public List<Customer> getSortedList() {

		 Collections.sort(customerList, new CustomerNameComparator());

		return this.customerList;
	}

	
}
