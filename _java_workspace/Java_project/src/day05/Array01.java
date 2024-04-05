package day05;

public class Array01 {

	public static void main(String[] args) {
		/* 배열
		 같은 타입, 의미를 가지는 변수들의 집합
		 객체를 생성하는 키워드 > new
		 
		 - 배열을 선언하는 방법
		 타입 [] 배열이름 ;
		 타입 배열이름 [];
		 
		 - 선언하고 생성(초기화) 방법 : 생성 시, 자동 초기화
		 타입 [] 배열이름 = new 타입 [길이];  > 가장 많이 사용하는 방식
		 타입 [] 배열이름 = new 타입 [] {값, 값, 값, 값};
		 
		 연습할때 사용하는 형태 ▽
		 타입 [] 배열이름 = {값, 값, 값, 값};
		 
		 배열의 길이는 0 이상이여야 한다.
		 
		 배열의 길이 .length(총길이)를 이용하면 배열의 길이를 알 수 있음
		 */
		
		int [] arr1;
		arr1 = new int[5];
		
		int [] arr2 = new int [5];
		int [] arr3 = new int [] {2,4,7,9,0};
		
		int [] arr4 = {2,5,8,9,1,3,6};
		
		/*배열을 사용하는 이유
		 - 관리하기가 편함 
		 - 반복문을 사용할 수 있음 > 많은 양의 데이트 쉽게 관리(사용)할 수 있음
		 배열의 index는 0부터 시작
		 길이자 5라면 > 0,1,2,3,4
		 마지막 번지는 항상 길이 -1로 설정이 된다 (규칙)
		 */
		
		System.out.println(arr1); // 배열의 주소를 출력
		
		System.out.println(arr2[0]); // 배열 안에 들어있는 값을 출력
		
		System.out.println();

		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]);
		System.out.println(arr3[3]);
		System.out.println(arr3[4]);
		
		System.out.println();
		
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");

		for (int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
		
		System.out.println();

		System.out.println(arr3[0]);
		arr3[0]=10;
		System.out.println(arr3[0]);
		arr3[1]=20;
		System.out.println();
		
		for (int i=0; i<arr3.length; i++) {
			System.out.print(arr3[i]+" ");
		}
		
		System.out.println();

		arr1[0]=5;
		arr1[1]=2;
		arr1[2]=1;
		arr1[3]=9;
		arr1[4]=6;
		
		for (int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();

		for (int i=0; i<arr2.length;i++) {
			arr2[i] = i+10;
			System.out.print(arr2[i]+" ");
		}
		
		System.out.println();
		System.out.println("-----------------");
		
		/*
		 arr5 배열 생성 후 1~5까지의 값을 저장하고 출력
		 */
		
		int [] arr5 = new int[5];
		for (int i=0;i<arr5.length;i++) {
			arr5[i] = i+1;
			System.out.print(arr5[i]+" ");
		}
		
		
		
	}

}
