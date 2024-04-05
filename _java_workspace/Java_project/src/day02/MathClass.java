package day02;

public class MathClass {

	public static void main(String[] args) {
		
		/*
		 MathClass : Math.method 
		 
		 Math.round (반올림) : 소수 자리수는 무조건 0
		 Math.ceil (올림)	 / Math.floor(버림) 
		 */
		
		double num = 3.14123435;
		// 반올림 3 , 올림 4, 버림 3

		int roundNum = (int) Math.round(num); // return > long
		System.out.println(roundNum);
		
		int ceilNum = (int) Math.ceil(num); // return > double
		System.out.println(ceilNum);
		
		int floorNum = (int) Math.floor(num); // return > double
		System.out.println(floorNum);
		
		System.out.println("----------------");
		
		// Math.max(최대값) , Math.min(최소값) 
		System.out.println(Math.max(5, 3));
		System.out.println(Math.min(5, 3));
		
		
		System.out.println("----------------");

		
		// Math.random : 0과 1 사이의 아무값을 출력
		// 0 <= Math.random() < 1
		// Start부터 시작하는 n개의 정수 중 임의의 정수 하나 랜덤 추출
		// int num = (int) (Math.random() * n) + start;

		System.out.println((int)(Math.random()*10)+1); // 0은 포함 & 1은 미포함
		
		

	}

}
