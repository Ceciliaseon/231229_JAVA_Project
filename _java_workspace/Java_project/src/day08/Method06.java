package day08;

public class Method06 {

	public static void main(String[] args) {
		/*
		 * */
		int arr [] = new int [] {1,5,7,3,10,8,15,11,20,21,26,24,43,23,69};

		printArray(arr);
		System.out.println();
		sortArray(arr);
		System.out.println("-----정렬후-----");
		printArray(arr);
		System.out.println();
		System.out.println("-----배열 리턴 후 출력-----");
//		int arr1[] = sortArray1(arr);
//		printArray(arr1);
		printArray(sortArray1(arr));
		
		System.out.println();
		System.out.println("---랜덤 배열 출력---");
		printArray(randomArray());
		System.out.println();
		System.out.println();
		printArray(sortArray1(randomArray()));
	}
	
	/* 주어진 정수 배열을 콘솔에 출력하는 메서드
	   매개변수 : 배열 
	   리턴타입 : 출력 > void
	   메서드명 : printArray
	   5개씩 한줄에 나열
	*/
	public static void printArray (int arr[]) {

		for (int i=0;i<arr.length;i++) {
			if (i%5==0 && i!=0) { //다시
				System.out.println();
			}	
			System.out.print(arr[i]+" ");
		}
	}
	
	/* 배열이 주어지면 배열을 오름차순 정렬하는 기능
	 * 매배견수 : 배열
	 * 리턴타임 : void
	 * 메서드명 : sortArray
	 * */
	public static void sortArray (int arr[]) {

		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}	
		}
	}
	
	// 정렬 후 배열을 리턴
	public static int[] sortArray1 (int arr[]) {

		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}	
		}
		return arr;
	}

	/* 메서드 안에서 배열 생성 randomArray (10개)
	 * 랜덤값을 채우고 (1~50까지) 해당 배열을 리턴
	 * 매개변수 x
	 * */
	public static int[] randomArray() {
		
		int random [] = new int [10];
		for (int i=0;i<random.length;i++) {
			random[i] = (int)(Math.random()*50)+1;
		}
		return random;
	}
}
