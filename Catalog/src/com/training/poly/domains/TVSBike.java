package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class TVSBike implements Automobile {

	@Override
	public String getModel() {
	
		return "Scooty Pep";
	}

	@Override
	public double getPrice() {
		return 52000;
	}

	@Override
	public String getColor() {
		return "Orange";
	}

}
