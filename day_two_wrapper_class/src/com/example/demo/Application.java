/**
 * 
 */
package com.example.demo;

/**
 * 
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LoanService service = new LoanService();
		
		
		double result =service.findSimpleInterest(Double.parseDouble(args[0]), 
				                                  Double.parseDouble(args[1]), 
				                                  Double.parseDouble(args[2]));
		
		
		
		//System.out.printf("%.2f%n",result);
		
		System.out.println(result);
		
		Student ram = new Student(100, "Ramesh", 78);

		System.out.println("BEFORE -->"+ ram.getMarkScored());
		
		UnderstandVariables obj = new UnderstandVariables();
		
		
		Student response = obj.getStudent(ram);
		 
		System.out.println("AFER --->"+ response.getMarkScored());
		
		
		obj.declareResult(ram.getMarkScored());  // Auto Boxing  when wrapper Double is expected we are passing a primitive Double
		
		obj.declareResult(Double.valueOf(56.00));
	}

}
