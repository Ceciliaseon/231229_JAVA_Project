package day02;

import java.util.Scanner;

public class day02_과제 {

	public static void main(String[] args) {
		/*
		 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 ex) 2 3 + > 2+3 > 5
		 ex) 5 1 - > 5-1 > 4
		 연산자는 + - * / %
		 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력		 
		 
		 연산자 = char(기본자료형) == 비교가능 / String(객체) == 비교불가능
		 */
		
		Scanner sc = new Scanner (System.in); 
		
		System.out.println("첫번째 숫자를 입력하시오");
		int a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하시오");
		int b = sc.nextInt();
		System.out.println("연산자를 입력하시오");
		char st = sc.next().charAt(0); // 한글자 받기
		// /, % 일 경우 정수가 0이 되면 안내문구 띄우기
		if ((st=='/'|| st=='%') && (b==0)) {
				System.out.println("두번째 입력 숫자가 잘못되었습니다(0). 다시 입력해주십시오.");
		} else {
			switch (st) {
			case '+' : System.out.println(a+b); break;
			case '-' : System.out.println(a-b); break;
			case '*' : System.out.println(a*b); break;
			case '/' : System.out.println(a/b); break;
			case '%' : System.out.println(a%b); break;
			default : System.out.println("잘못된 연산자입니다.");
			}
		}

		
		// switch 문
//		switch (st) {
//		case '+' : System.out.println(a+b); break;
//		case '-' : System.out.println(a-b); break;
//		case '*' : System.out.println(a*b); break;
//		case '/' : System.out.println(a/b); break;
//		case '%' : System.out.println(a%b); break;
//		default : System.out.println("잘못된 연산자입니다.");
//		}
		
//		// 수업 풀이 내용 
//		int x = a+b;
//		int y = a*b;
//		double z = a/(double)b;
//		int e = a%b;
//		
//		switch (st) {
//		case '+' :
//			System.out.println(""+a+st+b+"="+(a+b));
//			break;
//		case '-' :
//			System.out.println(""+a+st+b+"="+x);
//			break;
//		case '*' :
//			System.out.println(""+a+st+b+"="+y);
//			break;
//		case '/' :
//			System.out.println(""+a+st+b+"="+z);
//			break;
//		case '%' :
//			System.out.println(""+a+st+b+"="+e);
//			break;
//		}
		// if 문
//		if (st=='+') {
//			System.out.println(a+b);
//		} else if (st=='-') {
//			System.out.println(a-b);
//		} else if (st=='*') {
//			System.out.println(a*b);
//		} else if (st=='/') {
//			System.out.println(a/b);
//		} else if (st=='%') {
//			System.out.println(a%b);
//		} else {
//			System.out.println("잘못된 연산자입니다.");
//		}
		
		sc.close();

	}

}
