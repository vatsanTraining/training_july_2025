package com.training;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

interface BookService<T> {
	
	void add(Book obj);
}


interface Example{ 
    Hello display(String msg1,String msg2);    //display("Hello world")
} 

class Hello{ 
	             
public Hello(String msg1,String msg2){    
	System.out.print(msg1 + msg2); 
	} 
} 




public class UsingPredicate {

	
	
	public static void main(String[] args) {

		
		Predicate<String> testStartingChar = (arg) -> arg.startsWith("d");
		
				
		
		List<String> names = Arrays.asList("dj","dd","dsp","acp");
		
		names.forEach((eachName) ->{
			
			if(testStartingChar.test(eachName)) {
				System.out.println(eachName);
			}
			
		});
		
		
		names.forEach((eachName)->System.out.println(eachName));
		
		names.forEach(System.out::println);
		
		//  sSystem.out.println("abc");
		
		
		
		
		//BookService<Book> obj=(arg)->{ System.out.print()ln(arg.getBookName());};
		
		//obj.add(new Book());
		
		 
		 Example ex = Hello::new;   
		 
		 ex.display("Hello", "world");
		 
		  
		} 

	

}
