package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getModel() {
		return "Celerio- Zxi";
	}

	@Override
	public double getPrice() {
		return 570000;
	}

	@Override
	public String getColor() {
		return "glistening grey";
	}

}
