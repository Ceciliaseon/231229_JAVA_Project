package day11;

public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업
		 * 두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수의 합을 리턴하는 메서드
		 * ex) a=3, b=5 > 3+4+5
		 * ex) a=5, b=1 > 1+2+3+4+5
		 * ex) a=3, b=3 > 3
		 * */
		
		과제 sum = new 과제();
		System.out.println(sum.Sum(3, 7));
		System.out.println(sum.Sum(5, 1));
		System.out.println(sum.Sum(5, 5));
	
		System.out.println(sum.sum2(3, 5));
		System.out.println(sum.sum2(4, 5));
		System.out.println(sum.sum2(5, 5));
		
	}
	
	/* 메서드를 작성할 때
	 * 1. 들어가는 값(매개변수), 나오는 값(리턴타입)
	 * 매개변수 int a , int b
	 * 리턴타입 : 합(int)
	 * */
	public int Sum (int a, int b) {
		
		int sum = 0;
		
		if (a>b) {
			int tmp = a;
			a=b;
			b=tmp;
		}
		for (int i=a;i<=b;i++) {
			sum+=i;
		}
//		if (a<b) {
//			for (int i=a;i<=b;i++) {
//				sum+=i;
//			}
//		}
//		if (a>b) {
//			for (int i=b;i<=a;i++) {
//				sum+=i;
//			}
//		}
//		if (a==b) {
//			return a;
//		}
		return sum;
	}
	
	public int sum2(int a, int b) {
		int sum = 0;
		
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for (int i=min; i<=max; i++) {
			sum+=i;
		}
		return sum;
	}
}
