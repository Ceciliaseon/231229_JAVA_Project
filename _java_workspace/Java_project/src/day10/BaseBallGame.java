package day10;

import java.util.Scanner;
import day08.Method_Lotto;

public class BaseBallGame {
	
	int apple = 0; // 멤버변수
	
	public static void main(String[] args) {
		
		/* 야구게임
		 * 사용자번호는 직업 입력
		 * 번호는 랜덤생성 (1~9, 중복x)
		 * 중복안되게 하는 메서드 isContain 호출하여 사용
		*/
		Scanner sc = new Scanner (System.in);
		
		int comNum [] = new int [3];
		int myNum [] = new int [3];
		int s = 0;
		int b = 0;
		// 사용자 번호 입력
		randomArray(comNum);
		
		while (true) {
			System.out.println("숫자를 3개 입력하시오");
			String mystr = sc.next(); // 숫자를 문자로 받음
			String[] myNumStr = mystr.split("");
			for (int i=0;i<myNumStr.length;i++) {
				myNum[i] = Integer.parseInt(myNumStr[i]);
			}
			
			// 결과 출력
			s = stkCount(comNum, myNum);
			b = ballCount(comNum, myNum);
			
			if (s==0 && b==0) {
				System.out.println("out");
			} 
//			else {
//				System.out.println("> " + s + "s"+ b + "b");
//			}
			if (s!=0) {
				System.out.println("> " + s + "s");
			}
			if (b!=0) {
				System.out.println("> " + b + "b");
			}
			if (s==3) {
				System.out.println("정답");
				break;
			}
		}
		sc.close();

	}
	
	// 랜덤으로 배열을 중복되지 않게 생성하는 메서드
	// Method07 > isContain 가져와서 사용
	
	public static void randomArray(int arr[]) {
		
		int cnt = 0;
		while (cnt < arr.length) {
			int r = (int)(Math.random()*9)+1;
			if (!Method_Lotto.isContain(arr,r)) {
				arr[cnt] = r;
				cnt ++;
			}
		}
	}
	
	// 랜덤 범위에 상관없이 랜덤수를 채우는 메서드
	// 범위 > 매개변수로 받아오면 됨 
	// (int)(Math.random()*개수)+시작값
	// start, count 매개변수로 받아 범위를 생성
	public static void randomArrayR(int arr[], int statr, int count) {
		
		int cnt = 0;
		while (cnt < arr.length) {
			int r = (int)(Math.random()*count)+statr;
			if (!Method_Lotto.isContain(arr,r)) {
				arr[cnt] = r;
				cnt ++;
			}
		}
	}
	
	
	// stk 갯수를 카운트 하는 메서드
	// 리턴 > stk 갯수 (int)
	// comNum, myNum 를 주고 번호와 위치가 일치하면 count하는 메서드
	
	public static int stkCount (int com[], int my[]) {
		
		int count = 0;
		for (int i=0;i<com.length;i++) {
				if (com[i] == my[i]) { // 같은 index에 같은 값
					count ++;
			}
		}
		return count;	
	}
	
	
	// ball 갯수를 카운트 하는 메서드
	// 리턴 > ball 갯수 (int)
	// comNum, myNum 를 주고 번호만 일치하면 count하는 메서드

	
	public static int ballCount (int com[], int my[]) {
		
		int count = 0;
		for (int i=0;i<com.length;i++) {
			if(Method_Lotto.isContain(my, com[i])) {
				count++; // ball+strike 같이 체크
			}
//			for(int j=0;j<my.length;j++) {
//				if (com[i]==my[j]&& i!=j) {
//					count++;
//				}
//			}
		}
		return count - stkCount(com, my);	
	}

}
