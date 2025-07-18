package com.training.iimpls;

import com.training.ifaces.MyFunction;

public class DistanceConverter implements MyFunction {

	@Override
	public double convert(double mile) {
		// TODO Auto-generated method stub
		return mile*1.62;
	}

}
