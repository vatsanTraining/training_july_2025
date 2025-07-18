package com.training.iimpls;

import com.training.ifaces.MyFunction;

public class CurrencyConverter implements MyFunction {

	@Override
	public double convert(double inr) {
		// TODO Auto-generated method stub
		return inr*100;
	}

}
