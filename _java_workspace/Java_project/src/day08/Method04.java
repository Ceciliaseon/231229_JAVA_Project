package day08;

public class Method04 {
	public static void main(String[] args) {
		
		/* 최대공약수, 최소공배수 리턴*/
		// 리턴을 받은 값을 메인에서 출력
		
		int gcd = gcd (6, 12);
		System.out.println("최대 공약수 = "+gcd);
		
		int lcm = lcm(10,15);
		System.out.println("최소 공배수 = "+lcm);
		
		System.out.println("최소공배수2 = "+lcm2(10,15));

	}
	
	// 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
	public static int gcd (int a, int b) {	
		int x = 0; // 결과가 리턴될 변수 (최대공약수)
		for (int i=1; i<=a;i++) {
			if(a%i==0 && b%i==0) {
				x = i;
			}
		}
		return x ;
	}
	
	// 두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	public static int lcm (int a, int b) {
		for (int i=a; ;i+=a) {
			if (i%a==0 && i%b==0) {
				return i;
			}
		}
	}
	
	// 최소공배수 규칙 : 두 수를 곱한 후, 최대 공약수로 나누면 > 최소공배수
	public static int lcm2 (int num1, int num2) {
		return num1*num2/gcd(num1, num2);
	}
	
}
