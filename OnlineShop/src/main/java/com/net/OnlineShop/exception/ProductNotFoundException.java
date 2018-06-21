package com.net.OnlineShop.exception;

public class ProductNotFoundException extends Exception{

	
	private String message;
	
	public ProductNotFoundException() {
		this("product is not avavible");
	}
	public ProductNotFoundException(String meesage) {
		this.message=System.currentTimeMillis() + ":"+message;
	}
	public String getMessage() {
		return message;
	}
}
