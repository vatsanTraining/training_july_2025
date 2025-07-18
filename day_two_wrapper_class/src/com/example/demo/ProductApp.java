package com.example.demo;

import java.util.Scanner;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProductService service = new ProductService();
		
		Scanner sc = new Scanner(System.in);
		
		int productId = sc.nextInt();
				
		String productName = sc.next();
		
		Product prod=service.createProduct(productId,productName);
		
		System.out.println(prod.getProductId() + ","+ prod.getProductName());
		
		
		service.createProduct(0, null, 0);
		service.createProduct(0, null, 0, false);
		
		//service.createProduct(new Product());
		
		// private method cannot be accessed outside the class where it is defined
		
	
		sc.close();
	}

}
