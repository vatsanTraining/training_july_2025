package com.example.demo;

import java.sql.PreparedStatement;

public class ModuleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		PreparedStatement pstmt = null;
		
		
		Product sonytv = new Product(101, "sony tv", 8900);

		Product motitv = new Product(101, "sony tv", 8900);

		System.out.println(sonytv.toString());
		
		System.out.println(sonytv.price());
		
		System.out.println(sonytv.equals(motitv));
		
		
		String json = """
				
				 {"id":101,"name":'ramesh' },
				 {"id":102,"name":'rajesh' },
				
				""";
		
		
		System.out.println(json);
		
		Fruit key = Fruit.KIWI;
		
		 String choice = switch (key) {
		case KIWI: {
			
			yield "FROM NEW ZELAND";
		}
		case APPLE:{
			yield "From Kahsmir";
		}
		case DURIAN:{
			yield "From Malyasia";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		 };

		 System.out.println(choice);
	
	}
	}


