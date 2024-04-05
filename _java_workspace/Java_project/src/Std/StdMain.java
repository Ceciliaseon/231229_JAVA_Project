package Std;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		// 메뉴구성
		/* 1. 학생추가 | 2. 학생리스트 | 3. 학생검색 | 4. 학생수정 
		 * 5. 학생삭제 | 6. 점수추가 | 7. 점수수정 | 8. 점수삭제 | 9.종료
		 * */
		
		Scanner sc = new Scanner (System.in);
		StdManager sm = new StdManager();
//		sm.add();
		int menu = 0;
		
		do {
			System.out.println("menu");
			System.out.println("1. 학생추가 | 2. 학생리스트 | 3. 학생검색 | 4. 학생수정 \r\n"
					+ "5. 학생삭제 | 6. 점수추가 | 7. 점수수정 | 8. 점수삭제 | 9.종료");
			System.out.println("menu 선택 >");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : sm.addStd(sc); break;
			case 2 : sm.printStd(); break;
			case 3 : sm.searchStd(sc); break;
			case 4 : sm.modStd(sc); break;
			case 5 : sm.delStd(sc); break;
			case 6 : sm.addSub(sc); break;
			case 7 : sm.modSub(sc); break;
			case 8 : sm.delSub(sc); break;
			case 9 : break;
			default : System.out.println("잘못된 메뉴입니다. 다시 입력 >"); break;
			}
			
		} while (menu!=9);
		System.out.println("시스템 종료");

	}

}
