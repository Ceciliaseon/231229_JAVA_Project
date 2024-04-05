package day02;

import java.util.Scanner;

public class InputClass {

	public static void main(String[] args) {
		/*
		  콘솔 입력 : 콘솔에서 값을 입력바는 것을 의미
		  Scanner 클래스 : 콘솔에서 값을 입력받을 수 있게 해주는 클래스
		*/
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("숫자(정수)를 입력해주세요.");
//		int num = sc.nextInt();
//
//		System.out.println("내가 입력한 수 : "+num);
//		
//		if (num%2==0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//		
//		
//		System.out.println("-----------------------");
//		
//		System.out.println("실수입력 > ");
//		double num2 = sc.nextDouble();
//		System.out.println("내가 입력한 실수 : " +num2);
//		
//		System.out.println("-----------------------");
//		
//		
//		System.out.println("한글자 입력 > ");
//		// 문자열 입력 : next() / charAt(index) : 문자열중 index 번지의 한글자를 추출 
//		// index 의 번지는 0부터 시작 
//		
//		char ch = sc.next().charAt(2);
//		System.out.println("내가 입력한 글자 : "+ch);
//		
//		
		System.out.println("-----------------------");
		System.out.println("한 단어 입력 > ");
		
		String s = sc.next();
		System.out.println("내가 입력한 단어 : "+s);
		
		
		// 여러 단어 출력 : .nextLine() >> 공백포함
		System.out.println("-----------------------");
		sc.nextLine(); // 위에서 입력한 Enter 처리용 
		
		System.out.println("여러 단어 > ");
		String x = sc.nextLine();
		System.out.println("여러 단어 : "+ x);
		
		sc.close();
		
	}

}
