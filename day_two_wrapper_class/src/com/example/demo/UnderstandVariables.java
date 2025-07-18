package com.example.demo;

public class UnderstandVariables {

	private int rollNumber;    // instance variable 
	private static String principalName;  //static variable also known as class variable
	
	// instance methods
	public int showRollNumber() {
		
		return this.rollNumber;
	}
	
	
	public static  String showPrincipalName() {
		
		//return this.principalName;  cannot call instance variable inside static method
		
		return principalName ;
	}
	
    public   String show() {
		
    	return this.rollNumber + principalName; 
    	//inside instance method we can call both instance and static variable
	}
	
    
    public void undestandLocalVariable() {
    	
    	int a ;
    	int b =10;
    	//public int c =5;  // local variable cannot have modifiers
    	//System.out.println(a);  local variable has to be assinged before use
    	
    	System.out.println(b);
    	
    }
    
    
    public Student getStudent(Student student) {
    	
    	 student.setMarkScored(student.getMarkScored()+55);
    	 
    	 return student;
    	
    }
    
    public boolean declareResult(Double mark) {
    	
    	 return mark>60.00;
    }
}
