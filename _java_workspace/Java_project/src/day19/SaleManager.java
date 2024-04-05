package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	// 제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
//	private ArrayList<Sale<String, String>> order = new ArrayList<>(); // 이것도 가능 
	
	public void add(Scanner sc) {
		// 제품 추가
		
		System.out.println("제품 추가 > ");
		String manuName = sc.next();
		System.out.println("가격 추가 > ");
		int menuPrice = sc.nextInt();
		
		// list에 객체 생성 후 추가 (항상)
		menu.add(new Sale<String, Integer>(manuName, menuPrice));
		
	}

	public void menuPrint() {
		// 제품 리스트 보기
		
		for (int i=0;i<menu.size();i++) {
			System.out.print("menu "+(i+1)+". ");
			System.out.println(menu.get(i));
		}
		
//		for (Sale<String, Integer> tmp : menu) {
//			System.out.println(tmp);
//		}

	}

	public void orderPick(Scanner sc) {
		// 입력받는 값은 제품명과 수량
		// 제품명에 가격을 찾아서 * 수량 (지불금액) 을 oder에 추가
		// 햄버거 5개 > 햄버거 25000
		
		System.out.println("제품명 > ");
		String orderMenu = sc.next();
		
		int totalPrice = 0;
		for (int i=0;i<menu.size();i++) {
			if (menu.get(i).getMenu().equals(orderMenu)) {
				System.out.println("수량 > ");
				int orderAdd = sc.nextInt();
				totalPrice = (menu.get(i).getPrice())*orderAdd;
				int index = orderSearch(orderMenu);
				if (index !=-1) { // order에 같은 제품이 있다면...
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+totalPrice);
					return;
				}
				// 주문한적이 없는 메뉴일 경우
				order.add(new Sale<String, Integer>(orderMenu, totalPrice));
				return;
			}
		}
		System.out.println("입력한 메뉴가 없습니다.");
	}
	
//	public void orderPick2(String name, int count) {
//		// 매개변수로 받는 방법도 생각하기
//	}

	public int orderSearch(String name) {
		
		int index = -1;
		for (int i=0;i<order.size();i++) {
			if (order.get(i).getMenu().equals(name)) {
				index =i;
				return index;
			}
		}
		return index;
	}
	
	public void orderPirnt() {
		// 주문내역 출력(전체)
		// 총지불금액 출력
	
		System.out.println("--- 전체 주문 내역 ---");
		
		int sum = 0;
		
		for (int i=0;i<order.size();i++) {
			System.out.println(order.get(i));
			sum += order.get(i).getPrice();
		}
		System.out.println("총 지불금액 : " + sum);
		
	}	
}
