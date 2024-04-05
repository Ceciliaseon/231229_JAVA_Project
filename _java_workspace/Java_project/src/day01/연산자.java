package day01;

public class 연산자 {

	public static void main(String[] args) {

		//대입연산자
		int a = 10;
		a +=10;
		System.out.println(a);
		a -=5;
		System.out.println(a);

		int x = 10;
		int b = 3;
		x=b;
		System.out.println(x);
		
		x+=10;
		System.out.println(x);
		
		// 증감연산자 (++ / --)
		int i = 30;
		++i;
		System.out.println(i);
		System.out.println(++i); // 1증가 후 출력  
		System.out.println(i++); // 출력 후 1 증가
		
		// 산술연산자 + - * / %
		/* 나누기(/)
		 정수 / 정수 => 정수 (소수점 버림)
		 정수 / 실수 => 실수
		 실수 / 정수 => 실수
		 실수 / 실수 => 실수
		 
		 값 / 0 => 예외 발생(Exception)
		 double / 0 => infinity 발생(무한대)
		 */
		System.out.println("3+2="+(3+2));
		System.out.println("3-2="+(3-2));
		System.out.println("3*2="+(3*2));
		System.out.println("3/2="+(3/2.0));
		System.out.println("3/2="+(3.0/0));
		System.out.println("3%2="+(3%2.4));
		
		// 비교연산자 : 결과는 반드시 true or false
		
		// 논리연산자 
		System.out.println("3>2 ? "+(3>2));
		System.out.println("3<2 ? "+(3<2));
		System.out.println("3==2 ? "+(3==2));
		System.out.println("3!=2 ? "+(3!=2));

		System.out.println("&& 연산자 : "+(3>2&&4<3));
		System.out.println("|| 연산자 : "+(3>2||4<3));
		
		// 삼항연산자(조건선택)
		int e = 3, f = 5;
		System.out.println((e>=f)?true:false);
		System.out.println((4>2)?true:false);
		
		// 문제
		int num = 3;
		num = 18;
		System.out.println((num%2==0)?"짝수입니다.":"홀수입니다.");
		
		String result = (num%2==0)?"짝수입니다.":"홀수입니다.";
		System.out.println(num+" 는 > "+result);
		
	}

}
