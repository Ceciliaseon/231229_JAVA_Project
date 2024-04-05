package day03;

import java.util.Scanner;

public class For03 { 

	public static void main(String[] args) {
		
		/*
		 약수 : 나누어서 떨어지는 수의 집합 
		 6의 약수 : 6/1, 6/2, 6/3 --- 값이 0되는 경우
		 	    : 1,2,3,6
		 */
		
//		int num = 100;
//		System.out.print(num+"의 약수는 ");
//		for (int i=1;i<=num;i++) {
//			if (num%i==0) {
//				System.out.print(i+" ");
//			}
//		}
		
		Scanner sc = new Scanner(System.in);		
		System.out.println("정수를 입력해주세요.");
		int num1 = sc.nextInt();
		System.out.print(num1+"의 약수는 ");
		for (int i=1;i<=num1;i++) {
			if (num1%i==0) {
				System.out.print(i+" ");
			}
		}
		sc.close();
		
	}

}
