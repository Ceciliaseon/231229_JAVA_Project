package day08;

public class Method03 {

	public static void main(String[] args) {
		/* 정수 (2~9 중 하나)에 해당하는 구구단이 출력되는 메서드
		 * 매개변수로 2 > 2단 
		 * 3 > 3단
		 * */
		
		gugudan (3);
		
	}
	
	public static void gugudan (int x) {
		
		System.out.println(x+"단");
		for (int i=1;i<=9;i++) {
				System.out.println(x+"x"+i+"="+(x*i));
		}
	}

}
