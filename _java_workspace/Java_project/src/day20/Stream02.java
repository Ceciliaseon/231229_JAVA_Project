package day20;

import java.util.Arrays;

public class Stream02 {

	public static void main(String[] args) {
		
		/* 배열에서 짝수만 출력(정렬) 중복되는 값 제거
		 * */
		int arr[] = {1,6,3,2,8,9,5,3,1,3,7,9,6,2,7,4};
		
		Arrays.stream(arr)
		.filter(n-> n%2==0) // 짝수 필터
		.distinct() // 중복제거
		.sorted() // 정렬
		.forEach(n-> System.out.print(n+" "));

		System.out.println();
		
		// 배열로 리턴
		int [] result = Arrays.stream(arr)
		.filter(n-> n%2==1) // 홀수 필터
		.distinct() // 중복제거
		.sorted() // 정렬
		.toArray();
		
		for (int tmp : result) {
			System.out.print(tmp+" ");
		}
	}
}
