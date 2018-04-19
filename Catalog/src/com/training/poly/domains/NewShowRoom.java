package com.training.poly.domains;

import com.training.poly.ifaces.Automobile;

public class NewShowRoom extends ShowRoom {

	@Override
	public Automobile getProduct(int key) {
		
		if(key == 3)
		{
			return new TafeTractor();
		}
		else
		{
		    return super.getProduct(key);
		}
	}

	
}
