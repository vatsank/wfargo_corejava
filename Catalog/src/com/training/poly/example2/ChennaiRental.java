package com.training.poly.example2;

import com.training.poly.example2.domains.Item;
import com.training.poly.example2.utils.QuoteManager;

public class ChennaiRental {

	public static void main(String[] args) {

		
	QuoteManager mgr = new QuoteManager();
	
	   
	   Item item = mgr.getItem(Integer.parseInt(args[0]));
	   
	   
	   mgr.showQuote(item, Integer.parseInt(args[1]));
	   
	   
	   
	}

}
