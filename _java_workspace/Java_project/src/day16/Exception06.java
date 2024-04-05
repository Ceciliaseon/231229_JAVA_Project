package day16;

public class Exception06 {

	public static void main(String[] args) {
		
		// 첫번째 메서드 오류 확인
		try {
			for (int tmp : Length(0,20,-1)) {
				System.out.println(tmp);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
		
		//두번째 메서드에 들어갈 배열
		
		int start = 3, count = 5, size = 4;
		
		try {
			int arr[] = null;
			Inabout(arr, start, count);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("종료");
		
	}
	
	// 메서드 생성
	/* 기능 : size를 매개변수로 입력받아 size 만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * 
	 * 예외처리
	 * - size가 0보다 작다면 예외발생 throw new
	 * - count 개수가 0보다 작다면 예외발생 throw new
	 * - 
	 * */
	
	public static int[] Length(int size, int start, int count) {
		

		if (size < 0) {
			throw new RuntimeException("size 길이 예외 발생");
		}
		
		if (count < 0) {
			throw new RuntimeException("count 개수 예외 발생");
		}
		
		
		int arr[] = new int[size];
		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*start)+count;
		}
		return arr;
		
	}
	
	//메서드 생성
	/* 기능 : 매개변수로 배열을 받아서 랜던값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * 
	 * 예외처리
	 * - 배열이 null 이면 예외발생
	 * - 배열의 길이가 -보다 작다면 예외 발생
	 * */
	
	public static void Inabout (int arr[], int start, int count) {
		
		if (arr == null) {
			throw new RuntimeException("배열의 null값이 발생");
		} 
		
		if (arr.length < 0) {
			throw new RuntimeException("배열의 길이 오류");
		}

		for (int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*start)+count;
		}
	}

}
