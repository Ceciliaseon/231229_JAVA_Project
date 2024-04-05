package day06;

public class Array05 {

	public static void main(String[] args) {
		/* 문자열을 담는 배열을 생성 */
		
		String [] arr = new String [5];
		
		arr[0]="홍길동";
		arr[1]="김말순";
		arr[2]="유재석";
		arr[3]="최지혜";
		arr[4]="김영희";
		
		for (int i=0;i<arr.length;i++) { //일반for문
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		/*향상된 for문 / 탐색만 가능 */
		System.out.println("향상된 for문");
		for(String s:arr) {
			System.out.print(s+" ");
		}
		// arr값을 다시 넣을 수 없고 값을 수정할 수는 없음
		// 비교, 복사, 탐색할 때만 사용가능
			
			
	}

}
