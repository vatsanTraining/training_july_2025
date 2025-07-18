package com.training;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Predicate;

import com.training.repo.BookRepository;
import com.training.services.*;
public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BookServiceImpl service = new BookServiceImpl();
		
		
		service.findBookByPriceGreater(1000).forEach(System.out::println);
		
		
		   LinkedList<Book> list = service.findBookByPriceLess(1000);
				
				
		      ListIterator<Book> itr = list.listIterator();
		      
		      System.out.println("Forward - Iteration");
		      while(itr.hasNext()) {
		    	  
		    	  System.out.println(itr.next());
		      }
		      
		      System.out.println("Reverse - Iteration");
		      while(itr.hasPrevious()) {
		    	  
		    	  System.out.println(itr.previous());
		      }
				
			}

}
