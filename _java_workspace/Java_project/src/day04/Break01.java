package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		/*
		 break문 : 반복문을 빠져나오게 하는 키워드 
		 - 반복문에서 조건문 (if)을 동반하여 조건에 맞을 때 반복문을 벗어나게 하는 역할 
		 */
		
		for (int i=1;;i++) {
			System.out.print(i+" ");
			if (i==10) {
				break;
			}
		}
		System.out.println();
		System.out.println("---------------");
		
		/*한글자를 입력받아 글자를 출력
		  y를 입력받으면 종료 
		 */
		Scanner sc = new Scanner(System.in);
		
		// for문
//		for (;;) {
//		    System.out.println("한글자 입력 > ");
//			char ch = sc.next().charAt(0);
//			System.out.println(ch);
//			if (ch =='y') {
//				System.out.println("종료");
//				break;
//			}
//		}
		
		// while문
		char ch = 0;
		while(ch!='y') {
			System.out.println("한글자 입력 > ");
			ch = sc.next().charAt(0);
			System.out.println(ch);
			if (ch=='y') {
				System.out.println("종료");
				break;
			}
		}
		sc.close();
		
	
		System.out.println();
		System.out.println("---------------");
		
	}

}
