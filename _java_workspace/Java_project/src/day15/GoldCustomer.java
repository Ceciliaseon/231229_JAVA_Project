package day15;

import java.util.Scanner;

public class GoldCustomer extends Customer {
	
	// goid / VIP 할인율 존재 
	private double saleRatio;
	
	public GoldCustomer() {}
	
	public GoldCustomer(int id, String name) {
		super(id, name);
		customerGrade = "Gold";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		
		bonusPoint += (int)(price*bonusRatio);
		// 세일가격
		price = price -(int)(price*saleRatio);
		return price;
	}

	
	public double getSaleRatio() {
		return saleRatio;
	}

	public void setSaleRatio(double saleRatio) {
		this.saleRatio = saleRatio;
	}
	
	
	
	

}
