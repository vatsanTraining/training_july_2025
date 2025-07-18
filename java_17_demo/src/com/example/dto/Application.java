package com.example.dto;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student jrram = new Student(101,"Ramesh", 67);
		
		Student srram = new Student(101,"Ramesh", 67);

		System.out.println(srram.toString());
		
		System.out.println(srram.firstName());
		
		System.out.println(jrram.equals(srram));
		
		
		
		String option = switch (Fruits.KIWI) {
		case APPLE: {
			
			yield "kashmiri fruit";
		}
			case KIWI:{
				yield "newzelan fruit";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		};
		
		System.out.println(option);
	}

}
