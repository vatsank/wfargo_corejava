package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class TafeTractor implements Automobile {

	@Override
	public String getModel() {
	
		return "TAFE Z-456";
	}

	@Override
	public double getPrice() {

		return 1200000;
	}

	@Override
	public String getColor() {
	
		return "RED";
	}

}
