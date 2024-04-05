package day15;

import java.util.Scanner;

public class Customer {

	/* 일반고객(Customer) / Gold 고객 (할인) / VIP 고객 (할인)
	 * 
	 * 고객 ID : int customerID
	 * 고객 이름 : String customerName
	 * 고객 등급 : String customerGrade
	 * 보너스 적립금 : int bonusPoint
	 * 보너스 적립 비율 : double bonusRatio
	 * 
	 * */
	
	//멤버변수 선언
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	public Customer() {}

	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01; // 보너스 적립 비율
	}
	
	//메서드
	/* 1. 보너스를 적립 계산 메서드(이름 : calcPrice(int price))
	 * > 구매 금액을 주고 적립 보너스를 계산하는 값 > bonusPoint에 누적
	 * > 보너스 적립, 할인여부를 체크해서 구매 price를 리턴
	 * */
	public int calcPrice(int price) {
		
		bonusPoint += (int)(price*bonusRatio);
		return price; //실버등급
	}

	public void customerInfo() {
		System.out.println(customerName+"님 등급은 "+customerGrade + "이며, \r\n"
				+ "누적 보너스 포인트는 "+calcPrice(bonusPoint)+" 점 입니다.");
	}
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}

	public int getAgentID() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setAgentID(int i) {
		// TODO Auto-generated method stub
		
	}




	
	
	
	
	

}
