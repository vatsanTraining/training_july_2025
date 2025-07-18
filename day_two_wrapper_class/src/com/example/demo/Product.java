package com.example.demo;

public class Product {

	
	  private int productId;
	   private String productName;
	   private double ratePerUnit;
	   private boolean stockStatus;
	   
	public Product() {
		super();
	}
	public Product(int productId, String productName, double ratePerUnit, boolean stockStatus) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
		this.stockStatus = stockStatus;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}
	public boolean isStockStatus() {
		return stockStatus;
	}
	public void setStockStatus(boolean stockStatus) {
		this.stockStatus = stockStatus;
	}
	   
	   
	   
	   
	   
}
