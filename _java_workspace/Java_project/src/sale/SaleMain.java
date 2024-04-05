package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정) | 4. 메뉴보기(전체메뉴 출력) 
		 * 5. 주문 | 6. 주문내역출력 | 7. 영수증(부가세 포함, 마트 정보) | 8.종료
		 * */
		
		Scanner sc = new Scanner (System.in);
		ManagerProgrom mp = new ManagerProgrom();
		
		mp.add();
		int menu = -1;
		
		do {
			System.out.println("[menu]");
			System.out.println("1. 메뉴추가 | 2. 메뉴삭제 | 3. 메뉴수정(가격수정) | 4. 메뉴보기(전체메뉴 출력) \r\n"
					+ "5. 주문 | 6. 주문내역출력 | 7. 영수증 보기 | 8.종료");
			System.out.println("메뉴 선택 > ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 : mp.menuAdd(sc); break;
			case 2 : mp.menuDel(sc); break;
			case 3 : mp.menuModi(sc); break;
			case 4 : mp.menuPrint(); break;
			case 5 : mp.reTurn(sc); break;
			case 6 : mp.listPrint(); break;
			case 7 : mp.receipt(); break;
			case 8 :  break;
			default : System.out.println("잘못된 메뉴입니다."); break;
			}
		
		} while (menu!=8);
		System.out.println("시스템 종료");
		
	}

}
