package com.training.domains;

import java.util.Comparator;

public class CustomerNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		
		return o1.getCustomerName().compareTo(o2.getCustomerName());
		
	}

}
