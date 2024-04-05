package day01;

public class 변수 {

	public static void main(String[] args) {
		
		int num = 123; // 선언+초기화
		System.out.println(num);
		
		// int num = 456;  error (중복x)
		
		int num1 = 12, num2 = 34, num3 = 56;
		System.out.println(num1);
		
		num1 = 78;
		System.out.println(num1);
		
		// 8개의 기본 자료형은 지역변수 범위(scope) { }
		// 범위를 벗어나면 값이 사라지고 사용할 수 없게 된다
		
		{
			int num4 = 12;
			System.out.println(num4);
		}
		//System.out.println(num4); error
		
		char ch = 'a';
		System.out.println(ch);
		
		double dou = 3.1;
		System.out.println(dou);
		
		byte b = 1;
		System.out.println(b);
		
		boolean boo = false;
		System.out.println(boo);
		
		float f = 3.14f;
		System.out.println(f);
		
		long l = 200L;
		System.out.println(l);
		
		num1 = 010; // 0으로 시작하는 값이 오게 되면 8진수로 인식한다 (0~7까지 인식, 8 => 10)
		// 10진수 (0~9까지 인식 10 => 10/ 16진수 (0~9(ABCDEF) 10 => 16)
		System.out.println(num1);
		
		num2 = 0x10; // 16진수로 인식
		System.out.println(num2);
		
		System.out.println("-------------------");
		
		// %(나머지)
		
		num1 = 10;
		num2 = 20;
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.println("-------------------");
		
		// 문제		
		int kor = 100 , eng = 50, math = 78;
		int sum = kor+eng+math;
		
		System.out.println("합계 : " + (kor+eng+math));
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/3);
		System.out.println(sum/3.0);
		


	}

}
