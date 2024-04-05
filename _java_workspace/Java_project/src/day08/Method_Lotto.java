package day08;

public class Method_Lotto {

	public static void main(String[] args) {
		
		int lotto [] = new int [7] ; //당첨번호
		int user [] = new int [6]; // 사용자 로또번호
		
		randomArray(lotto);
		randomArray(user);
		System.out.println("---당첨번호---");
		printArray(lotto); // 로또번호 채우기
		System.out.println("---사용자번호---");
		printArray(user); // 사용자 번호 채우기
		
//		printArray(lotto, user);
		
		int rank = lottorank(lotto, user);
		if(rank == -1) {
			System.out.println("꽝입니다.");
		} else {
			System.out.println(rank+"등 당첨");
		}
		
	}
	
	// 배열을 1~45까지 랜덤수로 채워서 생성 (중복 불가능) > 2
	/* 매개변수 : 배열 > int arr[]
	*/
	
	public static void randomArray(int arr[]) {
		
		int cnt = 0; //while 에서 i역할을 할 변수
		while (cnt < arr.length) {
			int r = (int)(Math.random()*10)+1;
			if (!isContain(arr,r)) {
				arr[cnt] = r;
				cnt ++;
			}
		}
	}
	
	/* 배열을 매개변수로 받아 배열을 출력하는 메서드 > 3 */
	/* ---당첨번호---
	   2 9 5 7 4 10 [6] 
	   ---사용자번호---
	   10 8 6 4 2 1 
	 * */
	public static void printArray (int arr[]) { // 받은 배열의 값을 출력

		if (arr.length==7) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+ " ");	
			} 
		System.out.print("["+arr[6]+"]");
		} 
		else {
			for(int i=0;i<arr.length;i++) {	
			System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		
	}
	
	/* 중복확인메서드 > 1
	 * 매개변수 : 배열, 값
	 * 있으면 true, 없으면 false
	 * return : boolean
	 * 메서드명 : isContain // 중복 or 등수 출력할 때도 사용
	 * */
	
	public static boolean isContain (int arr[], int random) {
		
		for(int i=0;i<arr.length;i++) {
			if (arr[i] == random) {
				return true;
			}
		}
		return false;		
	}
	
	/* 등수확인 메서드
	 * 매개변수 : lotto[] / user[]
	 * 리턴타입 : int
	 * 매서드명 : lottoRank
	 * 당첨기준 : 6개 일치 > 1등 / 5개 일치+보너스 번호 > 2등 / 5개 일치 > 3등 / 4개 일치 > 4등 / 3개 일치 > 5등 / 나머지는 꽝
	 * */
	public static void lottoRank (int lotto[], int user[]) {
		
		int bonus = 0;
		int cnt = 0;
		for (int i=0;i<user.length;i++) {
			if (isContain(user, lotto[i])) {
				cnt ++;
			}
			bonus ++;
		}
		switch (cnt) {
		case 6 :
			System.out.println("1등입니다.");
			break ;	
		case 5 : 
			if(isContain(user, lotto[lotto.length-1])) {
				System.out.println("2등입니다.");
			} else {
			System.out.println("3등입니다.");
			}
			break;
		case 4 : 
			System.out.println("4등입니다.");
			break;
		case 3 : 
			System.out.println("5등입니다.");
			break;
		default :
			System.out.println("꽝입니다. 다음기회에");
			break;
		}
	}
	
	public static int lottorank (int lotto[], int user[]) {
		//lotto = 7 / user = 6
		// 두 배열의 갯수가 다르기 때문에 배열이 바뀌어서 들어온다면 값이 잘못된다.
		
		if (lotto.length <= user.length) {
			return -1; // 잘못된 값
		}
		
		int cnt = 0; // 일치하는 개수를 세기위한 변수(보너스 제외)
		for (int i=0;i<user.length;i++) { // 보너스를 제외시키기 위해
			if(isContain(user,lotto[i])) {
				cnt ++;
			}
		}
		switch (cnt) {
		case 6 : 
			return 1;
		case 5 :
			if(isContain(user, lotto[lotto.length-1])) { // 보너스 점수
				return 2;
			} else {
				return 3;
			}
		case 4 :
			return 4;
		case 3 : 
			return 5;
		default :
			return -1;
		
		}	
	}
}
