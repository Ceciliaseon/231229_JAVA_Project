package day03;

public class While01 { 

	public static void main(String[] args) {
		/*
		 while문
		 반복해야 하는 범위, 횟수가 정해져 있지 않을 경우에 사용
		 
		 초기화
		 while (조건식){ // 조건식이 true 일때 반복
		 실행문;
		 증감식; 
		 }
		 
		 실행문 안에 조건식이 바뀔 수 있는 증감식이 있어야 가능
		 */
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		int i=1;
//		while (i<=10) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		// 1~10까지 짝수 출력
		while (i<=10) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
			i++;
		}
		
	}

}
