package day07;

public class Method02 {
	
	public static int sum (int a, int b) {
		return a+b;
	}
	
	public static int sub (int a, int b) {
		return a-b;
	}
	
	public static int nul (int a, int b) {
		return a*b;
	}
	
	public static double div (int a, int b) {
		return a/(double)b;
	}
	
	public static double mod (double a, double b) {
		return a%b;
	}
	
	public static void main(String[] args) {
		/* + , -, *, /, % 결과를 알려주는 메서드 5개 생성
		 * main에서 실행 
		 * */
		
		System.out.println("+ : " + sum(10,2));
		System.out.println("- : " + sub(9,4));
		System.out.println("* : " + nul(5,7));
		System.out.println("/ : " + div(37,5));
		System.out.println("% : " + mod(40,6));

	}

}
