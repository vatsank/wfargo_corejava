package com.training.poly.example2.domains;

import com.training.poly.example2.ifaces.Billable;

public class Sofa extends Item implements Billable {

	public Sofa(long itemNumber, String itemName) {
		super(itemNumber, itemName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateAmount(Item item, int qty) {
	
		return item.estimate() * qty + 750;
	}

	@Override
	public double estimate() {

		 return 2500;
	}

}
