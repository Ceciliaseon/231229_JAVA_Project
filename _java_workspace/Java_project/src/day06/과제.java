package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력 받아서 받은 숫자를 거꾸로 출력
		 * ex) 1 1 4 5 6 => 6 5 4 1 1로 출력 > 결과값 출력
		 * */
		Scanner sc = new Scanner (System.in);
		
		// 배열 
//		int arr [ ] = new int[5];
//		int sum = 0;
//		System.out.println("5개의 숫자를 입력하시오.");
//		
//		for (int i=0;i<arr.length;i++) {
//			arr[i] = sc.nextInt();
//			sum+=arr[i];
////			System.out.print(arr[i]+" ");
////			System.out.println(arr.length);
//		}
//		
//		for (int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+" ");
//		}
//		
//		System.out.println();
//		System.out.println("숫자의 합 = " + sum);
		
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		int sum = 0;
		
		// num%10 = 나머지값을 저장 > 마지막 자리 (출력)
		// num/10 = 몫 (int)다시 나누는 값으로 사용
		
		while (num>0) {
			int b = num%10;// 마지막 자리
			System.out.print(b+" ");
			
			sum += b;
			num = num/10; // 정수/정수 > 정수 (소수점 버림)
		}
		System.out.println("합계 = "+sum);
		
//		int num1 = num/10000;
//		int x = num%10000;
//		int num2 = x/1000;
//		x = x%1000;
//		int num3 = x/100;
//		x = x%100;
//		int num4 = x/10;
//		x = x%10;
//
//		System.out.println("거꾸로 출력 = "+ x + num4 + num3 + num2 + num1);
//		System.out.println("숫자의 합 = "+(x + num4 + num3 + num2 + num1));
		
		
		

	}

}
