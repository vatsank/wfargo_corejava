package com.training.domains;

import java.util.Comparator;

public class PhoneNumberComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
	
		if(o1.getPhoneNumber() < o2.getPhoneNumber()) return -1;
		if(o1.getPhoneNumber() > o2.getPhoneNumber()) return 1;
			return 0;
	}

}
