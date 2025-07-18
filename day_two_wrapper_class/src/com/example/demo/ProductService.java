package com.example.demo;

public class ProductService {

	
	
	public Product createProduct(int productId,String productName) {
		
		return new Product(productId, productName, 10.00, false);
	}
	// createProduct is a overloaded method - argument change from 2 to three 
	// changing the modifier is not part of overloading
	
   protected Product createProduct(int productId,String productName,double ratePerUnit) {
		
		return new Product(productId, productName, ratePerUnit, false);
	}
	

    Product createProduct(int productId,String productName,double ratePerUnit,boolean status) {
		
		return new Product(productId, productName, ratePerUnit, status);
	}

   
    private Product createProduct(Product prod) {
    	
    	return prod;
    }
	
}
