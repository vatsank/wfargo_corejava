package com.training.poly.example2.ifaces;

import com.training.poly.example2.*;
import com.training.poly.example2.domains.Item;

/**
 *  @version 1.0
 * @author Srivatsan
 *
 */
public interface Billable {

	/**
	 * 
	 * @param item
	 * @param qty
	 * @return
	 * 
	 *  This Method calculates the Amount of Items
	 */
	public double calculateAmount(Item item, int qty);
	
}
