package day18;

import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램 작성
		 * menu
		 * 1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어출력 | 5. 단어삭제 | 6. 종료
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map 을 이용해서 단어 등록
		 * 기본단어 등록 (5가지 등록)
		 * 
		 * main > do~while문으로 메뉴가 반복 실행되도록 설정
		 * 실제 구현은 메니저에서 작성
		 * */
		
		Scanner sc = new Scanner(System.in);
		WordManager wm = new WordManager();
		int num = 0;
		wm.addWord(); //기본값 추가
		do {
			
			System.out.println("menu");
			System.out.println("1. 단어 등록 | 2. 단어 검색 | 3. 단어 수정 | 4. 단어출력 | 5. 단어삭제 | 6. 단어파일출력 | 7. 종료");
			System.out.println(">> menu >");
			num = sc.nextInt();
			
			switch(num) {
			case 1 : wm.makeWord(sc); break;
			case 2 : wm.searchWord(sc); break;
			case 3 : wm.modifyWord(sc); break;
			case 4 : wm.printWord(); break;
			case 5 : wm.deletWord(sc); break;
			case 6 : wm.filePrint(); break;
			case 7 : break;
			default : 
				System.out.println("잘못 입력하였습니다.");
				break;
			}
		} while (num!=7);
		System.out.println("종료");
	}

}


