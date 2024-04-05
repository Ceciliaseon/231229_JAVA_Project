package day08;

public class Method05 {

	public static void main(String[] args) {
		

//		System.out.println("소수 인가요? " + sosu(5));
		
		// 2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
		int sum = 0;
		System.out.print("소수 = ");
		for (int i=2;i<=100;i++) {
			if (sosu(i)) { // 결과 = true
				System.out.print(i+" ");
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("소수의 합 = "+sum);

	}
	
	// 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별
	// 소수라면 true 리턴 / 아니라면 false 리턴 
	public static boolean sosu (int num1) {
		int count = 0;
		boolean a = true;
		for (int i=1;i<=num1;i++) {
			if (num1%i==0) {
				count ++;
			}
		}
		
		if (count == 2 ) {
			return a;
		} 
		return !a;
		
		
	}
}
