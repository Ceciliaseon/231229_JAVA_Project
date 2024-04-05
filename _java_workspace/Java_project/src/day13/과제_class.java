package day13;

import java.util.Scanner;

// Product 클래스 생성 : 상품을 등록하는 클래스
// 상품명, 가격 > 멤버변수 (생성자 알아서)
// 상품추가 메서드
// 추가한 상품 출력하는 메서드 (toString으로 생성가능)

class Product2{
	private String name;
	private int price;
	
	public Product2() {}
	
	public Product2 (String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void insertProduct(String name, int price) {
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + " : " + price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
public class 과제_class {
	public static void main(String[] args) {
		// 상품을 10개 등록가능한 배열 생성
		// Scanner 를 통해 상품을 등록받기
		// 등록한 상품 출력
		Scanner sc = new Scanner (System.in);
		// Product 클래스를 담을 수 있는 배열 10칸을 준비 
		Product2 [] menu = new Product2[10];
		
		// 상품을 등록하시겠습니다.(y/n) y > 등록 / n > 그만
		// n을 누르면 등록한 상품 출력
//		int cnt =0; 
//		menu[cnt] = p;
//		Product2 p = new Product2("pizza", 15000);
//		cnt++;
//		Product2 p1 = new Product2();
//		menu[cnt] = p1;
//		menu[cnt].insertProduct("음료", 2000);
//		cnt++;
//		
//		for (int i=0;i<cnt;i++) {
//			System.out.println(menu[i]);
//		}
		
		// 선생님 풀이
//		char c = 'y'; // 반복 키워드
//		int cnt = 0; // index 역할을 하는 변수
//		
//		while (c!='n') {
//			System.out.println("상품을 등록하시겠습니까? (y/n)");
//			c=sc.next().charAt(0);
//			if (c == 'y') {
//				System.out.println("상품명 :");
//				String name = sc.next();
//				System.out.println("가격:");
//				int price = sc.nextInt();
//				// 객체생성
//				Product2 p = new Product2(name,price); //** 중요
//				menu[cnt]=p;
//				cnt++;
//				if (cnt == menu.length) {
//					System.out.println("상품등록초과");
//					break;
//				}
//			} else {
//				if (c =='n') {
//					System.out.println("상품 등록 종료");
//				} else {
//					System.out.println("y/n만 가능합니다.");
//				}
//			}
//		}
//		
//		System.out.println("---등록된 상품 list---");
//		for (int i=0;i<cnt;i++) {
//			System.out.println((i+1)+" "+menu[i]);
//			// 출석 메서드가 있는 경우
//		}
		
		// my 풀이
		String input = "y";
				
		int cnt = 0;
		System.out.println("상품을 등록하시겠습니까 (y/n)");
		input = sc.next();
		while (!input.equals("n")) {
			System.out.println("상품을 등록해주세요 (상품/금액)");
			Product2 pd = new Product2();		
			menu[cnt] = pd;
			menu[cnt].insertProduct(sc.next(), sc.nextInt());	
			cnt++;
			System.out.println("상품을 등록하시겠습니까 (y/n)");
			input = sc.next();
			if (cnt == menu.length) {
				System.out.println("상품등록 초과하였습니다.");
				break;
			}
		}
		
		for (int i=0;i<cnt;i++) {
			System.out.println((i+1)+" "+menu[i]);
		}
		
	} 
}
