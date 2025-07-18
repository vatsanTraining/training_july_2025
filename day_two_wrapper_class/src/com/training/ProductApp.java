package com.training;

import com.example.demo.ProductService;

public class ProductApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
    ProductService service = new ProductService();
		
		service.createProduct(0, null);
		
		// cannot access - since its default and we are in a different package
		//service.createProduct(0, null, 0);
		
		// cannot access - since its protected method and we are in a different package
		// and its not a subclass
		//service.createProduct(0, null, 0, false);
		
		// private method not accessible
		//service.createProduct(new Product());
		
	}

}
