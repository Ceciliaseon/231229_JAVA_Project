package day06;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		/*
		 10개의 배열을 담을 수 있는 arr 생성
		 1~10까지 값을 입력한 후 출력
		 */
		
		int arr [] = new int [10];
		
		for (int i=0;i<arr.length;i++) {
			arr[i] = i+1;
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		// 배열을 섞는 코드
		// 랜덤한 번지를 선택해서 순차적으로 하나씩 교환
		
		// (int)(Math.random)*10)+0 > 0부터 10개의 랜덤수를 출력
		// max = 최종번지, min = 첫번째 번지
		
		// 교환코드 (앞번지, 뒷번지) 형식
		// [i][i+1]		
//		int temp = arr[i]; / 앞번지의 값을 임시 변수에 넣고
//		arr[i] = arr[i+1]; / 뒷번지의 값을 앞번지에 넣고
//		arr[i+1] = temp; / 뒤번지에 변수의 값을 넣음
		
		int min = 0;
		int max = arr.length;
		
		for(int i=0;i<arr.length;i++) {
			int random = (int)(Math.random()*max)+min;
			int temp = arr[i];
			arr[i] = arr[random];
			arr[random] = temp;
		}
		
		System.out.println("----섞은 후 값보기----");
		for (int tmp : arr) {
			System.out.print(tmp+" ");
		}
		
		// 섞은 값을 원래대로 정리 (정렬)
		// 작은 수부터 정리 = 오른차순 정렬
		// 큰 수부터 정리 = 내림차순 정렬
		
		// 버블정렬? 앞에 수와 뒤의 수를 비교 
		// 9 8 6 7 3 2 10 1 4 5
		// 1 9 8 7 6 3 10 2 4 5 - pas1
		// 1 3 9 8 7 6 10 2 4 5 - pas2
		// 1 2 9 8 7 6 10 3 4 5 - pas3
		// 1 2 3 9 8 7 10 6 4 5 - pas4
		// 1 2 3 4 9 8 10 7 6 5 - pas5
		// 1 2 3 4 5 9 10 8 7 6 - pas6
		// 1 2 3 4 5 6 10 9 8 7 - pas7
		// 1 2 3 4 5 6 7 10 9 8 - pas8
		// 1 2 3 4 5 6 7 8 10 9 - pas9
		// 1 2 3 4 5 6 7 8 9 10 - pas10
		
		System.out.println();
		System.out.println("---정렬 후---");
		
		for (int i=0;i<arr.length-1;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[i] < arr[j]) { // > : 오름차순 / < : 내림차순
					//교환
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		for (int tmp:arr) {
			System.out.print(tmp+" ");
		}
		
	}

}
