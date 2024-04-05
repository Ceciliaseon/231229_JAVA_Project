package day04;

import java.util.Scanner;

public class DoWhile03 { 

	public static void main(String[] args) {
		/*문제
		 숫자 2개를 입력받고,
		 num1 = 5 / num2 = 3
		 menu
		 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 menu에 따라서 두 수의 연산 결과를 출력
		 1 > 5+3 = 8
		 2 > 5-3 = 2
		 ...
		 6 > 종료
		 다른 번호는 잘못된 메뉴로 출력
		 */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("첫번째 숫자를 입력하시오 > ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오 > ");
		int num2 = sc.nextInt();
		
		int menu = 0;
		do {
			System.out.println("연산을 선택하시오.");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. %");
			menu = sc.nextInt();
//			if ((menu=='/' && menu=='%')||(num2==0)) { // num2==0일 때 완전히 프로그램을 종료하는 코드
//				System.out.println("잘못 입력된 값입니다. 시스템을 종료합니다.");
//				break;
//			} else {
					switch(menu) {
					case 1 : 
						System.out.println(num1+"+"+num2+"="+(num1+num2));
						break;
					case 2 : 
						System.out.println(num1+"-"+num2+"="+(num1-num2));
						break;
					case 3 : 
						System.out.println(num1+"*"+num2+"="+(num1*num2));
						break;
					case 4 : 
						if (num2 == 0) {
							System.out.println("잘못된 입력값입니다. 두번째 숫자를 다시 입력해주세요");
							num2 = sc.nextInt();
						}
						System.out.println(num1+"/"+num2+"="+(num1/num2));
						break;
					case 5 : 
						if (num2==0) {
							System.out.println("잘못된 입력값입니다. 두번째 숫자를 다시 입력해주세요");
							num2 = sc.nextInt();
						}
						System.out.println(num1+"%"+num2+"="+(num1%num2));
						break;
					case 6 : 
						System.out.println("종료");
						break;
					default :
						System.out.println("잘못된 메뉴입니다.");
						break;	
					}
//			}
		} while (menu!=6);
		
		sc.close();

	}

}
