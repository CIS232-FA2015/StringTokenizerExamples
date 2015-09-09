package cis232.example;

import java.math.BigDecimal;

public class Appetizer {
	private String name;
	private double price;
	
	public Appetizer(String name, String price){
		this.name = name;
		this.price = Double.parseDouble(price);
	}
	
	public String toString(){
		return String.format("%s ................ $%.2f", name,
				price);
	}
}
