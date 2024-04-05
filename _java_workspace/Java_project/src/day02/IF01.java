package day02;

public class IF01 {

	public static void main(String[] args) {
		
		/*
		 조건문 : if문 / switch문
		 조건이 참일때 실행해주는 조건문 
		 
		 실행문이 한 줄일 경우 { } 생략가능
		 but, 실행문이 2줄 이상일 경우 { } 생략 x
		 조건식은 반드시 boolean의 형태로만 작성
		 */
		
		int num = -1;
		if (num>0) {
			System.out.println("양수입니다.");
		}
		
		if (num>0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		
		if (num>0) {
			System.out.println("양수입니다.");
		} else if (num==0) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		System.out.println("----------------");
		
		num = 11;
		if (num>0) {
			System.out.println("양수입니다.");
			if(num>10) {
				System.out.println("10보다 큽니다.");
			}
		} else if (num==0) {
			System.out.println("0 입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		System.out.println("----------------");

		// 문제		
		int num2 = 5;
		if (num2%2==0) {
			System.out.println(num2 + " : 짝수");
		} else {
			System.out.println(num2 + " : 홀수");
		}
		
	}

}
