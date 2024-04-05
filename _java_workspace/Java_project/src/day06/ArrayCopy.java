package day06;

public class ArrayCopy {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1,2,3,4}; // new를 통해서 객체를 생성
		int [] arr1 = arr; // 복사
		
		// 두 객채의 주소 확인
//		System.out.println(arr);
//		System.out.println(arr1);

		int [] arr2 = new int[5]; // 객체가 새롭게 생성이 되어서 arr , arr1과 주소가 다르다
//		System.out.println(arr2);
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr의 값을 arr2로 복사
		for (int i=0;i<arr.length;i++) {
			arr2[i+1]=arr[i];
		}
		
		for (int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//arr를 arr3으로 복사
		//arr3은 10개의 데이터를 담을 수 있는 배열로 생성
		int [] arr3 = new int [10];

//		for (int i=0;i<arr.length;i++) {
//			arr3[i+3] = arr[i];
//		}
		System.out.println();
		
		//System.arraycopy 명령어 : 이전배열, 시작번지, 새배열, 새배열의 시작번지, 개수)
		
		System.arraycopy(arr, 0, arr3, 0, arr.length);
		
		for (int s : arr3) {
			System.out.print(s +" ");
		}
		
		// 배열은 한 번 지정하면 길이가 고정된다. 그렇기에 새로운 배열을 이용하여 기존 배열의 길이를 줄일지 늘일지를 copy를 통해 사용한다.

	}

}
