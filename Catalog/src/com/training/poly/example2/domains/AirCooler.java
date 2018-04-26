package com.training.poly.example2.domains;

import com.training.poly.example2.ifaces.Billable;
/**
 * 
 * @author Srivatsan
 *
 */
public class AirCooler extends Item implements Billable {

	public AirCooler(long itemNumber, String itemName) {
		super(itemNumber, itemName);
	}

	@Override
	public double estimate() {
		
		return 500;
	}

	@Override
	public double calculateAmount(Item item, int qty) {
		return item.estimate() * qty + 250;
	}


}
