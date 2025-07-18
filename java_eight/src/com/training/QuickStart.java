package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface MyInterface {
	
	public void add();
	//public void subtract();

}
public class QuickStart {

	
	// Lambda is returned
	
	public static Comparator<Book> createComparator(ComparatorType choice){
		
		 Comparator<Book> comp =(o1,o2) -> Integer.compare(o1.getBookNumber(), o2.getBookNumber());

		if(choice.equals(ComparatorType.BOOKNAME)) {
		   comp = 	(o1,o2) -> o1.getBookName().compareTo(o2.getBookName());
		} 
		
		return comp;
	}
	
	// Lambda is passed - the second argument
	public static void orderBooks(List<Book> bookList ,Comparator<Book> comparator) {
		
		 Collections.sort(bookList,comparator);

		for (Book book : bookList) {
			System.out.println(book);
		}
	}
	public static void main(String[] args) {
		
		Runnable task  =() -> {
			for(int i =0;i<5;i++) {
				System.out.println(i);
			}
		};
		
		Thread threadOne = new Thread(task);
		threadOne.start();
		
		
		List<Book> bookList = new ArrayList<>();
		
		 bookList.add(new Book(102, "Head First Java"));
		 bookList.add(new Book(202, "Thinking Java"));
		 bookList.add(new Book(100, "Effetive Java"));
		 
		 bookList.add(new Book(99, "Professional Java"));


		 System.out.println("Order By Book Name");
		 
		 orderBooks(bookList,createComparator(ComparatorType.BOOKNAME));
		 
		 System.out.println("Order By Book Number");
		 orderBooks(bookList, createComparator(ComparatorType.BOOKNUMBER));
		 
	}

	
}
