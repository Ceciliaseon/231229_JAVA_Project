package StdManager_class;

import java.util.Scanner;

public class StdMain {

	public static void main(String[] args) {
		// 메뉴 처리
		/* - menu : 1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보, 수강정보) 
		   4. 수강신청 | 5. 수강철회 | 6. 종료 */
		
		// 객체를 생성하는 것은 미리 해놓고 메서드 호출
		Scanner sc = new Scanner(System.in);
		//manager를 호출하기 위한 객체
		StdManager sm = new StdManager();
		
		int menu = 0;
		do {
			//menu 넣기
			System.out.println("--menu--");
			System.out.println("1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보, 수강정보) \r\n"
								+ "4. 수강신청 | 5. 수강철회 | 6. 종료");
			System.out.println(">> 메뉴 선택 >>");
			
			menu = sc.nextInt();
			//메뉴에 따른 동기구현
			switch (menu) {
			case 1: 
				sm.insertStudent(sc);
				break;
			case 2 : 
				sm.printStudent();
				break;
			case 3 : 
				sm.serchStudent(sc);
				break;
			case 4: 
				sm.registerSubject(sc);
				break;
			case 5 : 
				sm.deleteSubject(sc);
				break;
			case 6 : break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
		} while(menu!=6);
		System.out.println("시스템 종료");
		
		
		sc.close();
		

	}

}
