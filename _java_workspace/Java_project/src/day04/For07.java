package day04;

import java.util.Scanner;

public class For07 { 

	public static void main(String[] args) {
		/* 이중 for문 */
		// 별찍기
		
		/* for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				실행문;
			}
		}
		*/
		
		for(int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");

		/*
		 *      i=1, j=1
		 **     i=2, j=2
		 ***    i=3, j=3
		 ****   i=4, j=4
		 *****  i=5, j=5
		 */
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");

		for (int i=1;i<=5;i++) {
			for(int j=1;j<=6-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for (int i=1;i<=5;i++) {
			for (int a=1;a<=5-i;a++) { //공백
				System.out.print(" ");
			}
			for (int j=1;j<=i;j++) { // 별
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		
		for (int i=1;i<=5;i++) {
			for (int j=1;j<=5;j++) {
				System.out.print(j+i+" ");
			}
			System.out.println();
		}
		
		System.out.println("---------------");

		/* 
		 *      *     i=1 j=1 k=4
		 *     ***	  i=2 j=3 k=3
		 *    *****   i=3 j=5 k=2
		 *   *******  i=4 j=7 k=1
		 *  ********* i=5 j=9 k=0
		 *  */
		
		for (int i=1;i<=5;i++) {
			for (int k=1;k<=5-i;k++) { //공백
				System.out.print(" ");
			}
			for (int j=1;j<=(i*2)-1;j++) { // 별
				System.out.print("*");
			}
			System.out.println();
		} 
		
		System.out.println("---------------");
		
		/* 1 2 3      
		 * 4 5 6	  
		 * 7 8 9
		 * 3줄씩 3개 출력
		 * */
		
		int cnt=0; //값의 대한 변수 추가
		for (int i=1;i<=3;i++) {
			for (int j=1;j<=3;j++) {
				cnt++;
				System.out.print(cnt+" ");
			}
			System.out.println();
		}
	
		System.out.println("---------------");
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("열과 행을 입력하여 숫자를 1부터 나열하시오.");
		int a = sc.nextInt(); // 열
		int b = sc.nextInt(); // 행
		
		int cnt2 = 0;
		for (int i=1;i<=a;i++) {
			for (int j=1;j<=b+i;j++) {
				cnt2++;
				System.out.print(cnt2+" ");
			}
			System.out.println();
		}
		
		sc.close();
	
	}

}
