package com.training.repo;

import java.util.List;

import com.training.Book;

public class BookRepository {

	
	
	public List<Book> init(){
		
		return List.of(
				new Book(101,"Java","Vani",500),
				new Book(201,"Spring","Rani",1500),
				new Book(10,"Sql","Ganga",2500),
				new Book(205,"Python","Yamuna",800),
				new Book(105,"Dotnet","Saraswathi",900));
		
	}
	
	
}
