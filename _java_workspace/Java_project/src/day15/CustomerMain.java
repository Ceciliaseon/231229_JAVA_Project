package day15;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		
		Customer [] customersList = new Customer[10];
		
		Customer cLee = new Customer(1001, "별2");
		Customer c = new GoldCustomer(1002, "별1");
		Customer ct = new VipCoustomer(1003,"홍길동", 1111);
		
		int cnt = 0;
		customersList[cnt]=cLee;
		cnt++;
		customersList[cnt]=c;
		cnt++;
		customersList[cnt]=ct;
		cnt++;
		customersList[cnt]= new Customer(1004, "영이");
		cnt++;
		customersList[cnt]= new GoldCustomer(1005, "순이");
		cnt++;
		customersList[cnt]= new VipCoustomer(1006, "영철", 2222);
		cnt++;
		customersList[cnt]= new VipCoustomer(1007, "영수", 1111);
		cnt++;
		
		//다운케스팅 : 부모의 공유되는 멤버변수나 메서드가 아닌
		// 자식 고유의 멤버변수나 메서드를 호출하고자 할 때 사용
		// 다운케스팅 > 반드시 명시적으로 형변환 해야함 // instanceof : 객체의 형이 맞는지 체크하는 명령어 true / false
		
		System.out.println("-- 할인률과 포인트 계산 --");
		
		int price = 100000;
		for (int i=0;i<cnt;i++) {
			int salePrice = customersList[i].calcPrice(price);
			System.out.println(customersList[i].getCustomerName()+"님의 지불금액은 \r\n"
					+ salePrice + " / 보너스 포인트는 "+customersList[i].getBonusPoint() );
			System.out.println("--------------------");
		}
		
		System.out.println("-- 고객 정보 출력 --");
		for (int i=0;i<cnt;i++) {
			customersList[i].customerInfo();
		}
		
		
		//agentID = 1111 퇴사 > 3333 변경
		/*	Tiger testTiger = (Tiger)downCastingTest;
			testTiger.hunting();
		 * */
		System.out.println("-------------------");
		

		for (int i=0;i<cnt;i++) {
			Customer c1 = customersList[i];
			if(customersList[i] instanceof VipCoustomer) {
				VipCoustomer vip = (VipCoustomer) c1;
				if (vip.getAgentID() == 1111) {
					vip.setAgentID(3333);
				}
			}
		}
		
		System.out.println("-- 고객 정보 출력 --");
		for (int i=0;i<cnt;i++) {
			customersList[i].customerInfo();
		}
	}
}
