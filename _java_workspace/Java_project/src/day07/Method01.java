package day07;

public class Method01 {
	
	public static void main(String[] args) {
		// Method
		/* 메서드 : 기능을 구현(함수), function
		   메서드 선언 및 구현
		   접근제한자(제어자) 리턴타입 매서드명(매개변수){
		   		구현;
		   }	
		   
		   - 접근제한자(제어자) : 접근할 수 있는 주체의 제한범위 
		   	 public / private / ---
		   - 리턴타입 : 반환해주는 값의 타입(메서드를 실행 한 후 결과를 알려주는 값의 자료형) > 없을 수도 있다
		   - 메서드명 : 메서드의 이름(소문자로 시작_원칙)
		   - 매개변수 : 기능을 수행하기 위해 필요로 하는 값 (외부에서 들어와야 하는 값) > 없을 수도 있다
		   - void : 리턴할 것이 없다는 것을 의미 
		   
		   메서드의 위치
		   - 클래스 안에 있으며 다른 메서드 밖에 있어야 한다.
		   
		   메서드의 선언 순서는 아무 상관이 없음
		   메서드는 순서대로 실행되지 않고, 호출이 되어야 실행이 됨
		 */
		
		int hap = sum(20, 10); // 메서드의 리턴 결과를 받는 변수 hap
		System.out.println(hap);
		
		sum1(1,2);
		
		int ch = cha(10, 20);
		System.out.println(ch);
		
		
		
	}
	// 리턴의 결과를 받아서 무언가 할 것이 있을 때는 return을 사용하고 그렇기 않을 경우에는 void로 작성을 한다.
	
	// 두 정수가 주어지며 두 정수의 합을 알려주는 메서드
	// 리턴타입 : int
	// 메서드명 : sum
	// 매개변수 : int num1, int num2
	public static int sum (int num1, int num2) {
		return num1+num2;
	}
	
	// 두 정수가 주어지며 두 정수의 합을 출력하는 메서드 > 리턴타입이 x >> void
	public static void sum1 (int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	// 두 정수가 주어지면 두 정수의 차를 알려주는 메서드(리턴)
	public static int cha (int num1, int num2) {
		//num1 num2 중 큰 수에서 작은수를 빼서 결과를 리턴
		if (num1<num2) {
			return num2-num1;
		} 
		return num1-num2;
	}
	
}
