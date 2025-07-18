/**
 * @author srivatsan
 * @version 1.0
 */
package com.example.demo;

/**
 *  Day Two Demo
 *  To Find Simple Interest
 */
public class LoanService {

	
	/**
	 * 
	 * @param principle
	 * @param years
	 * @param rateOfInterest  given as decimal like 0.10 ,0.05 
	 * @return computed value 
	 */
	public double findSimpleInterest(double principle , double years, double rateOfInterest) {
		
			return principle * years *rateOfInterest;
	}
}
