package com.training.poly.example2.domains;

import com.training.poly.example2.ifaces.Billable;

public class Television extends Item implements Billable{

	public Television(long itemNumber, String itemName) {
		super(itemNumber, itemName);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double estimate() {
		return 1000;
	}

	@Override
	public double calculateAmount(Item item, int qty) {

		return item.estimate() * qty;
	}

}
