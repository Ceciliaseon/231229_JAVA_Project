package day01;

public class 자료형변환 {

	public static void main(String[] args) {
		//casting
		/*
		 a=b : a의 자료형과 b의 자료형이 맞지 않다면 오류
		 형변환을 통해 자로형을 맞춰주는 역할 
		 
		 자동 자료형 변환 : 생략해도 문제가 되지 않는 상황
		 같은 형의 크기가 큰 자료형 = 크기가 작은 자료형
		 
		 명시적 자료형 변환 : 리터럴 값 앞에 (타입)
		 */
		
		byte a = 10;
		int num = a; // 자동 자료형 변환 케이스
		
		double d = 3.5;
		int i = 5;
		
		i=(int)d; // 소수점 날라감
		System.out.println(i); 
		
		double dou = 1/(double)2;
		System.out.println(dou);
		
		
		
	}

}
