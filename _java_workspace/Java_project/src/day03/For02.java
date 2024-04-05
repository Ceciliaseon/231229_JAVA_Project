package day03;

public class For02 {

	public static void main(String[] args) {
		
		for (int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		// while 문
//		int i = 1;
//		while (i<=10) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		for (int i=1;i<=10;i++) { 
			if (i%2==0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
//		//while 문
//		int i = 1;
//		while(i<=10) {
//			if (i%2==0) {
//				System.out.print(i+" ");
//			}
//			i++;
//		}
		
		/* 1~10까지의 합계*/
		int sum = 0; // 지역변수는 반드시 초기화 해야함. 초기와 기본값 0 / null
		for (int i =1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		//while 문
//		int sum2 = 0;
//		int i = 1;
//		while (i<=10) {
//			sum2 = sum2+i;
//			i++;
//		}
//		System.out.println(sum);
		
		int sum2 = 0;
		int sum3 = 0;
		for (int i=1;i<=10;i++) {
			if (i%2==0) {
				sum2+=i;
			} else {
				sum3+=i;
			}
		}
		System.out.println("짝수의 합은 : " + sum2);
		System.out.println("홀수의 합은 : " + sum3);
		
		// while 문
//		int i = 1;
//		while(i<=10) {
//			if (i%2==0) {
//				sum2+=i;
//			}else {
//				sum3+=i;
//			}
//			i++;
//		}
//		System.out.println("짝수의 합은 : " + sum2);
//		System.out.println("홀수의 합은 : " + sum3);

	}

}
