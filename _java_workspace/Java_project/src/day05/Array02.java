package day05;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		/* 5명의 점수를 입력할 수 있는 배열을 생성
		 * 점수를 입력받아서 배열에 저장
		 * 점수를 출력 
		 */
		
		Scanner sc = new Scanner (System.in);
		
		int [] arr = new int [5];
		int sum = 0;
		for (int i=0;i<arr.length;i++) {
			System.out.println("점수를 입력해주세요.");
			arr[i] = sc.nextInt();
			sum += arr[i];
			//System.out.println(i+"번째 점수 = "+ arr[i]);
		}
		System.out.println();
		System.out.println("총합 점수 = " + sum);
		System.out.println("전체 평균 = " + (sum/(double)arr.length));
		
		sc.close();
	}

}
