package com.training;

import com.training.iimpls.CurrencyConverter;
import com.training.ifaces.*;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MyFunction obj2 = new MyFunction();

		//CurrencyConverter obj3 = new CurrencyConverter();
		
		//supertype = subtype
		// when super type expected sub type can be passed		
		MyFunction  obj= new CurrencyConverter();
	
		//onetype = unrelatedtype
		//MyFunction obj2 = new String();
		
		System.out.println(obj.convert(50));
	}

}
