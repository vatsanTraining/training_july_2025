package com.training.services;
import static  java.util.stream.Collectors.*;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.training.Book;
import com.training.repo.BookRepository;

public class BookServiceImpl {
	
	private List<Book> source;

	public BookServiceImpl() {
		super();
		

		this.source = new BookRepository().init();
	}
	
	
	public  List<Book> findBookByPriceGreater(double value){
		

		
		return source.stream().filter(e -> e.getPrice()>value).collect(toList());
		
		
	}

    public  Map<String,Double> findBookNameAndPrice(double value){
		
		
		return source.stream().filter(e -> e.getPrice()>value).collect(Collectors.toMap(Book::getBookName,Book::getPrice));
		
	}

    public List<String> getAuthors(double value){
    	
		return source.stream().filter(e -> e.getPrice()>value).map(e -> e.getAuthor()).collect(Collectors.toList());

    }

	
	public  List<Book> filterBooks(Predicate<Book> customFilter){

		return source.stream().filter(customFilter).collect(toList());
	}	
	
	
	public OptionalDouble averageBookPrice() {
		
		// source.stream().mapToDouble(e -> e.getPrice()).sum();

		// source.stream().mapToDouble(e -> e.getPrice()).count();

		return source.stream().mapToDouble(e -> e.getPrice()).average();
		
		

	}
public  LinkedList<Book> findBookByPriceLess(double value){
		
	
		return source.stream().filter(e -> e.getPrice()>value).collect(toCollection(LinkedList::new));
	}
	

  public List<Book> sortBooks() {
	  
	  
	  return source.stream().sorted(Comparator.comparing(Book::getPrice)).collect(toList());
	  
	  
  }
  
  public Optional<Double> getTheHighestPricedBook(){
	  return null;
  }

}

//TODO

// Test the methods from Main 

// Use the different Methods of Optional  at ifPresent, isPresent, orElseThrow   => Must know

//  Use the Predicate Interface  negate() and and() method 

// use Comparator reverseOrder() method and also thenComparing - compare One attribute and then another attribute

// Implement Greatest N element   - use limit

// Find Distinct Element from a Stream

// Create an application to show the Use of FlatMap



