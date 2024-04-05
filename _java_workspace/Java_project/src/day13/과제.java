package day13;

import java.util.Scanner;

// Product 클래스 생성 : 상품을 등록하는 클래스
// 상품명, 가격 > 멤버변수 (생성자 알아서)
// 상품추가 메서드
// 추가한 상품 출력하는 메서드 (toString으로 생성가능)		

class Product{
	private String name;
	private	String pay;
	private int cnt;
	
	public Product () {}
	
	public Product (String name, String pay) {
		this.name = name;
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "상품명 : " + name + ", 금액 : " + pay;
	}
	
	public String productAdd(String name, String pay) {
		return ("상품:"+name+" / 금액 : "+pay+"원");
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}
	
	
}
public class 과제 {

	public static void main(String[] args) {
		// 상품을 10개 등록가능한 배열 생성
		// Scanner 를 통해 상품을 등록받기
		// 등록한 상품 출력
		
		Product p = new Product();
		
		String list [] = new String[10];
		Scanner sc = new Scanner (System.in);
		int cnt = 0;
		
		for (int i=0;i<list.length;i++) {
			System.out.println("상품을 등록하세요");
			list[i] = p.productAdd(sc.next(), sc.next());
			}
		for (String s : list) {
			System.out.println("상품 list");
			System.out.println(s.toString());
		}
	}

}
