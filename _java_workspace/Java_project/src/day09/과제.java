package day09;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import day08.Method07;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임 >> 수업 풀이
		 * 컴퓨터가 3자리의 숫자 생성(각자리수는 1~9까지의 수) > 배열로 랜덤 저장(중복불가능)
		 * 유저는 3자리의 숫자를 맞추는 게임 > 직접 입력(중복되지 않게)
		 * 자리와 숫자가 strike (같은자리 같은숫자)
		 * 숫자만 맞으면 ball
		 * 아무것도 안맞으면 out
		 * 
		 * ex )
		 * 컴퓨터 번호 : 1 2 3
		 * 사용자 1 7 8 >> 1s
		 * 사용자 1 3 2 >> 1s 2b
		 * 사용자 7 8 9 >> out
		 * 사용자 1 2 3 >> 3s 정답
		 * */
		
		Scanner sc = new Scanner (System.in);
		
		int comNum [] = new int[3];
		int userNum [] = new int [3];
		
//		// 메서드는 다른 클래스에서도 불러올 수 있음.
//		// static 으로 생성했기 때문에 클래스명, 메서드명으로 호출가능
//		Method07.randomLotto(comNum); // conNum에서 랜덤수 주옥없이 생성
//		Method07.printLotto(comNum);
//		
//		// static 이 아닐경우 객체를 생성하여, 객체명으로 메서드명 호출
//		Method07 me = new Method07();
//		me.randomLotto(comNum);
//		me.printLotto(comNum);
		
		//컴퓨터 숫자
		for (int i=0;i<comNum.length;i++) {
			comNum[i] = (int)(Math.random()*9)+1;
			for (int j=0;j<i;j++) {
				if (comNum[i]==comNum[j]) {
					i--;
					break;
				}
			}
		}
		// 사용자 입력
		while (true) {
			int stk = 0;
			int ball = 0;
			System.out.println("숫자를 3개 입력하시오(중복불가)");
			String mystr = sc.next(); // 숫자를 문자로 받음
			String[] myNumStr = mystr.split("");
			for (int i=0;i<myNumStr.length;i++) {
				userNum[i] = Integer.parseInt(myNumStr[i]);
			}
			
			// 비교
			for (int i=0;i<comNum.length;i++) {
				for (int j=0;j<userNum.length;j++) {
					if (comNum[i] == userNum[j] && i==j) {
						// 값과 자리수 모두 같을 경우
						stk ++;
					} else if (comNum[i] == userNum[j] && i!=j) {
						// 값만 같을 경우
						ball++;
					}
				}
			}
			
			//결과 출력
			if(stk == 0 && ball ==0) {
				System.out.println("out");
			} else {
				System.out.println("> "+stk +"s"+ball+"b");
			}
			
			// 종료 조건
			if (stk ==3) {
				System.out.println("정답");
				break;
			}
		}
		
//		int com [] = new int [3];
//		int user [] = new int [3];
//		
//		// 컴퓨터 랜덤수 생성
//
//		for (int i=0;i<com.length;i++) {
//			com[i] = (int)(Math.random()*9)+1;
//			for(int j=0;j<i;j++) {
//				if (com[i]==com[j]) {
//					i--;
//				}
//			}
////			System.out.print(com[i]+" ");
//		}
//		
//		int strike = 0;
//		int ball = 0;
//		int out = 0;
//		int count = 0;
//		
//		// 사용자 숫자 입력
//		while (true) {
//			count ++;
//			System.out.println("숫자를 3개 입력하시오(중복불가)");
//			for (int i=0;i<user.length;i++) {
//				user[i] = sc.nextInt();
//			}
//			for (int i=0;i<user.length;i++) {
//				for (int j=0;j<user.length;j++) {
//					if ((com[i]==user[j])&&i==j) {
//						strike ++;
//					} else if ((com[i]==user[j])&&i!=j) {
//						ball++;
//					}
//				}
//			}
//
//			if (strike == 3) {
//				System.out.println("정답");
//				break;
//			} else if (strike ==0&&ball==0) {
//				System.out.println("out");
//			} else {
//				System.out.println(strike +"s"+ ball+"b");
//			}
//		
//		}
		
		
	

//	public static boolean arrContain (int arr[], int random) {
//		for (int i=0;i<arr.length;i++) {
//			if (arr[i]==random) {
//				return true;
//			}
//		}
//		return false;
//	}
//	
//	public static void randomArray(int arr[]) {
//		int cnt = 0;
//		while (cnt < arr.length) {
//			int r = (int)(Math.random()*9)+1;
//			if (!arrContain(arr, r)) {
//				arr[cnt] = r;
//				cnt++;
//			}
//		}
//	}
	
	}
}
