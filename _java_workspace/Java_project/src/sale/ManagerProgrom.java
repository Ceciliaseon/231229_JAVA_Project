package sale;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import day19.Sale;

public class ManagerProgrom {

	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Order> order = new ArrayList<>();
	
	public void add () {
		menu.add(new Sale<String, Integer>("햄버거", 2000));
		menu.add(new Sale<String, Integer>("피자", 3000));
		menu.add(new Sale<String, Integer>("핫도그", 1500));
		menu.add(new Sale<String, Integer>("콜라", 1000));
	}
	
	public void menuAdd(Scanner sc) { //메뉴추가
		
		System.out.println("메뉴 추가 > ");
		String manuName = sc.next();
		System.out.println("가격 추가 > ");
		int menuPrice = sc.nextInt();

		menu.add(new Sale<String, Integer>(manuName, menuPrice));
		
	}

	public void menuDel(Scanner sc) { //메뉴삭제
		
		System.out.println("삭제할 메뉴 > ");
		String delMenu = sc.next();
		
		for (int i=0;i<menu.size();i++) {
			if (delMenu.equals(menu.get(i).getMenu())) {
				// list.remove(index) / list.remove(object)
//				menu.remove(i); // index ver.
				menu.remove(menu.get(i)); // object ver.
				System.out.println(delMenu+" 메뉴 삭제 완료");
				return;
			}
		}System.out.println("해당 메뉴는 없습니다.");
	}

	@SuppressWarnings("unlikely-arg-type")
	public void menuModi(Scanner sc) { //메뉴수정(가격수정)
		
		System.out.println("가격 수정할 메뉴 입력 > ");
		String modiMenu = sc.next();
		
		for (int i=0;i<menu.size();i++) {
			if (modiMenu.equals(menu.get(i).getMenu())) {
				menu.remove(menu.get(i).getPrice());
				System.out.println("가격 수정 > ");
				int setPrice = sc.nextInt();
				menu.get(i).setPrice(setPrice);
				System.out.println(modiMenu +"가격 수정 완료");
				return;
			}
		} System.out.println("해당 메뉴는 없습니다.");	
		
	}

	public void menuPrint() { //메뉴보기(전체메뉴 출력)
		
		for (int i=0;i<menu.size();i++) {
			System.out.print("menu "+(i+1)+". ");
			System.out.println(menu.get(i));
		}
	}

	public void pick(Scanner sc) { //주문
		
		System.out.println("주문할 메뉴 > ");
		String Menu = sc.next();
		
		for (int i=0;i<menu.size();i++) {
			if (menu.get(i).getMenu().equals(Menu)) {
				System.out.println("수량 > ");
				int count = sc.nextInt();
				// roder의 데이터가 없다면 비교차제가 불가
//				if(order.size()>0) {
//					for (int j=0;i<order.size();j++) {
//						if()
//					}
//				}
				int index = orderSearch(Menu);
				if (index != -1) { // 해당 메뉴가 있다면
					// 기존 값에서 count+ / total+
					int cnt = order.get(index).getCount(); //기존 주문 수량
					int tot = order.get(index).getTotla(); //기본 주문 금액
					order.get(index).setCount(count+cnt);
//					order.get(index).setTotla(tot+(price*count));
				}
				Order o = new Order();
				o.setMenu(Menu);
				o.setPrice((menu.get(i).getPrice()));
				o.setCount(count);
				o.setTotla((menu.get(i).getPrice())*count);
				order.add(o);
				System.out.println("메뉴를 추가하였습니다.");
				return;
			}
		}
		System.out.println("해당 메뉴가 없습니다.");
		
		
	}
		
	public void reTurn(Scanner sc) {
		
		while(true) {
			System.out.println("메뉴를 추가 하시겠습니까? 예(y) / 아니오(n)");
			char yesno = sc.next().charAt(0);
			
			if (yesno == 'y') { 
				pick(sc);
			} else if (yesno == 'n'){				
				System.out.println("메뉴 추가를 종료합니다.");
				return;
			} else {
				System.out.println("잘못입력하였습니다.");
			}
		}		
	}
	
	public int orderSearch(String name) {
		int index = -1;
		for (int i=0;i<order.size();i++) {
			if (order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void listPrint() { //주문내역출력

		System.out.println("------- 전체 주문 내역 -------");
		for (int i=0;i<order.size();i++) {
			order.get(i).orderListPrint();
		}
	}

	public void orderReceipt() {
		
		System.out.println("        [ezen Mart 영수증]        ");
		LocalDateTime today = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println("사업자번호 : 265-92-00112");
		System.out.println("주소 : 인천광역시 남동구 인주대로 593 엔타스빌딩 12층");
		System.out.println("전화번호 : 032-719-4074");
		System.out.println(dtf.format(today));
	}
	
	public void receipt() { // 영수증 보기
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i=0;i<order.size();i++) {
			sum += order.get(i).getTotla();
		}
		orderReceipt();
		System.out.println();
		listPrint();
		System.out.println();
		System.out.println("총 합산 금액 : "+ sum);
		System.out.println("결제 금액 : " +(int)(sum+(sum*0.1))+" (vat포함)");
		System.out.println();
	}

}
