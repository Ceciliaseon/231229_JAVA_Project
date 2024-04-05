package day07;

import java.util.Scanner;

public class 과제 {

	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static int sub (int a, int b) {
		return a-b;
	}
	
	public static int nul (int a, int b) {
		return a*b;
	}
	
	public static double div (int a, int b) {
		return a/(double)b;
	}
	
	public static double mod (double a, double b) {
		return a%b;
	}


	public static void main(String[] args) {
		/* 계산기 만들기 
		 * --menu--
		 * 1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 나머지 | 6. 종료
		 * >> 메뉴선택 1
		 * >> 숫자 1 입력하세요. 5
		 * >> 숫자 2 입력하세요. 10
		 * 결과 : 5+10=15
		 * (더하기 메서드 호추하여 연산결과를 출력)
		 * */
		
		Scanner sc = new Scanner (System.in);
		
		int menu = 0;
		do {
			System.out.println("menu");
			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 나눗셈 | 5. 나머지 | 6. 종료");
			System.out.println(" >> menu > ");
			menu = sc.nextInt();
			if (menu < 6) {
				System.out.println(">> 첫번째 숫자 입력 ");
				int num1 = sc.nextInt();
				System.out.println(">> 두번째 숫자 입력");
				int num2 = sc.nextInt();
				// 실제 기능을 구현하는 처리문 
					switch (menu) {
					case 1 : 
						System.out.println("덧셈 결과");
						System.out.println(num1+"+"+num2+"="+sum(num1, num2));
						break;
					case 2 : 
						System.out.println("뺄셈 결과");
						System.out.println(num1+"-"+num2+"="+sub(num1, num2));
						break;
					case 3 : 
						System.out.println("곱셈 결과");
						System.out.println(num1+"*"+num2+"="+nul(num1, num2));
						break;
					case 4 : 
						System.out.println("나눗셈 결과");
						System.out.println(num1+"/"+num2+"="+div(num1, num2));
						break;
					case 5 : 
						System.out.println("나머지 결과");
						System.out.println(num1+"%"+num2+"="+mod(num1, num2));
						break;
					}
			} else {
				if (menu==6) {
					System.out.println("종료하였습니다.");
				} else {
					System.out.println("잘못된 메뉴입니다.");
					}
				}
			} while (menu !=6);
			System.out.println("시스템 종료");
		
		sc.close();
	}

}
