package day02;

public class For01 {

	public static void main(String[] args) {
		/*
		 반복문 : 규칙적인 작업을 반복적으로 할 때 사용하는 문법
		 
		 for, while, do~while
		 - for, while 동작방식이 동일
		   ㄴ 조건에 맞지 않으면 한 번도 실행되지 않을 수 있음
		   
		 - do~while 
		   ㄴ 조건에 맞지 않아도 무조건 1번은 실행
		   
		   
		 for( 1 초기화; 2 5 8 조건식(boolean); 4 7 증감식){
		 	3 6 실행문;
		 }
		 - 초기화 : 조건식이나, 실행문에서 사용할 변수를 초기화 (생략가능) > 여러변수 초기화 가능 (처음 1번만)
		 - 조건식 : 반복의 반복을 결정하는 식 (boolean 형식) > true만 반복 (생략가능)
		 - 증감식 : 조건식에서 사용할 변수를 증가 / 감소시켜 반복 횟수를 조절 (생략가능)
		 */
		
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}

		System.out.println();
		
		for(int i=10;i>=1;i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("-------------");
		
		for (int i=2;i<=10;i++) {
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		for(int i=2;i<=10;i+=2) {
			System.out.print(i+" ");

		}
		
		System.out.println();
		for (int i=1;i<=5;i++) {
			System.out.print(i*2+" ");
		}
		
		System.out.println();
		int num = 0;
		for (int i=1;i<=5;i++) {
			num = num+2;
			System.out.print(num+" ");
		}
		
		System.out.println();
		for (int i =1;i<=10;i++) {
			System.out.print((i%2==0)?i+" ":" ");
		}
		
		System.out.println();
		// 1부터 10까지의 합
		int sum = 0;
		for (int i=1;i<=10;i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		
		
	}

}
