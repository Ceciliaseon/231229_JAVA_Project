package day19;

import java.util.Scanner;

public class Generics01 {

	public static void main(String[] args) {
		/* 제네릭(Generics) : 데이터의 타입을 나중에 확정하는 기법
		 * <E> 미지수 키워드 
		 * 클래스나 메서드를 선언할 때 어떤 데이터가 들어올지 확시닝 없다면,
		 * 제네릭 타입으로 구현 > 나중에 객체를 생성할 때 타입을 확정해서 구현할 수 있음
		 * 
		 * JVM 입장에서는 객체의 타입을 생성해서 컴파일 할 때, 체크할 수 있어서
		 * 타입의 안정성을 해치지 않는 선에서 적당히 형변화이 가능한 기법
		 * 안정성이란, 의도하지 않은 타입의 객체가 저장되는 것을 막아주는 역할을 한다.
		 */
		
//		List<String> list = new ArrayList<E>();
//		HashMap <String, Integer> map = new HashMap<K, V>(); // key, value의 약자
		
		/* Sale 클래스 생성
		 * 1. 제품 추가 | 2. 제품 list 보기 | 3. 제품주문 | 4. 주문내역보기 | 5. 종료
		 * 제품을 등록한 리스트...? / 내가 주문을 한 리스트..?
		 * */

		
		Scanner sc = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		
		int menu = -1;
		
		do {
			System.out.println("1. 제품 추가 | 2. 제품 list 보기 | 3. 제품주문 \r\n"
					+ "4. 주문 내역보기 | 5. 종료");
			System.out.println("menu 선택 >> ");
			menu = sc.nextInt();
			
			switch (menu) {
			case 1 : sm.add(sc); break;
			case 2 : sm.menuPrint(); break;
			case 3 : sm.orderPick(sc); break;
			case 4 : sm.orderPirnt(); break;
			case 5 : break;
			default : System.out.println("잘못된 메뉴"); break;
			}
		}while(menu !=5);
		System.out.println("프로그램 종료");
	}

}
