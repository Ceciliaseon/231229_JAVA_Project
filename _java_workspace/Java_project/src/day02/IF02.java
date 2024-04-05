package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		
		/*
		 국어, 영어, 수학 점수를 입력받아 
		 합계, 평균, 평가를 출력
		 평가는 평균이 90이상이면 A
		 80이상이면 B , 70이상이면 C, 나머지는 D
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력 하시오.");
		int kor = sc.nextInt();
		if (kor >100 || kor <0) {
			System.out.println("잘못된 값입니다. 다시 입력해주세요");
		}
		kor = sc.nextInt();
		
		System.out.println("영어 점수를 입력 하시오.");
		int eng = sc.nextInt();
		if (eng >100 || eng <0) {
			System.out.println("잘못된 값입니다. 다시 입력해주세요");
		}
		eng = sc.nextInt();
		
		System.out.println("수학 점수를 입력 하시오.");
		int mat = sc.nextInt();
		if (mat >100 || mat <0) {
			System.out.println("잘못된 값입니다. 다시 입력해주세요");
		}
		mat = sc.nextInt();
		
		int sum = kor+eng+mat;
		double avg = sum/3.0;
		
		System.out.println("총점 : "+sum + " 평균 : "+avg);
		
		char result = 'D';
		if (avg>100||avg<0) {
			System.out.println("잘못된 성적입니다.");
		} else if (avg >=90) {
			result = 'A';
		} else if (avg >=80) {
			result = 'B';
		} else if (avg >=70) {
			result = 'C';
		} else {
			result = 'D';
		}
		
		System.out.println("결과 : "+result);
		
//		if (avg >=90) {
//			System.out.println("평가 A");
//		} else if (avg >=80) {
//			System.out.println("평가 B");
//		} else if (avg >=70) {
//			System.out.println("평가 C");
//		} else {
//			System.out.println("평가 D");
//		}
		
		
		

	}

}
