package day03;

public class For05 {

	public static void main(String[] args) {
		
		/*
		 6, 12 수의 공약수 : 1 2 3 6
		 
		 그 공약수 중 가장 큰 값은 최대공약수 : 6
		 
		 */
		int num1 = 6; 
		int num2 = 12;
		
		int x = 0;
		for (int i=1; i<=num1;i++) {
			if(num1%i==0 && num2%i==0) {
				System.out.print(i+" ");
				x = i;
			}
		}
		System.out.println();
		System.out.println("최대 공약수 : " + x);
		
		// break;
		/*
		 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 
		 */
		
		for(int i=num1;;i--) {
			if (num1%i==0 && num2%i==0) {
				System.out.println(i);
				break;
			}
		}
		
		// 중첩 for문일 경우 break는 나를 감싸고 있는 가장 안쪽 for문을 벗어남. 
		int i = 0;
		
		a: for (;;) {
			for(;;) {
				for(;;) {
					i++;
					if(i==10) {
						System.out.println(i);
						break a; // < for문에 이름을 줄 수도 있음
					}
				}
			}
		}
		
		
		
	}

}
