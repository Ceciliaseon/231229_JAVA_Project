package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택
		 * (가위 = 0 / 바위 = 1 / 보 = 2)
		 * 내가 가위바위보 중 하나를 선택해서 입력
		 * 승 / 패 / 무승부의 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 > 무승부입니다.
		 * */
		
		Scanner sc = new Scanner (System.in);
		
		int com = (int)(Math.random()*2)+1;
		String user = sc.next();
		String str = null;
		if (com == 0) {
			str = "가위";
		} else if (com==1) {
			str = "바위";
		} else {
			str = "보";
		}
		
		if(user == str) {
			System.out.println("무승부입니다.");
		} else {
			
		}
		
	
 
		sc.close();

	}

}
