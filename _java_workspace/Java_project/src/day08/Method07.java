package day08;

public class Method07 {

	public static void main(String[] args) {
		/* 로또 번호 생성
		 * */
		
		int lotto [] = new int [7] ; //당첨번호
		int user [] = new int [6]; // 사용자 로또번호
		
		System.out.print("당첨번호 : ");
		printLotto(lotto);
		System.out.println();
		System.out.print("사용자 로또번호 : ");
		printLotto(user);
	}
	
	/* 배열을 매개변수로 받아 1~45까지 랜덤수를 채워서 생성 (둘다)
	 * 같은 수가 나오지 않도록 
	 * */

	/* 배열을 매개변수로 받아 배열을 출력하는 메서드
	 * */
	public static int[] printLotto (int random[]) { // 받은 배열의 값을 출력
		randomLotto(random);
		for (int i=0;i<random.length;i++) {
			System.out.print(random[i]+" ");
		}
		return random;
	}
	
	/* 중복확인메서드
	 * 매개변수 : 배열, 값
	 * 있으면 true, 없으면 false
	 * */
	
	public static void randomLotto (int random[]) {

		for (int i=0;i<random.length;i++) {
			random[i] =(int)(Math.random()*45)+1;
			for(int j=0; j<i;j++) {
				if (random[i]==random[j]) {
					i--;
				}
			}
		}
		

//		int i = 0;
//		while (true) {
//			int tmp = (int)(Math.random()*45)+1;
//			random[i] = (int)(Math.random()*45)+1;
//			if (tmp!=random[i]) {
//				tmp = random[i];
//			}
//			i++;
//		}
		
	}
		
}
