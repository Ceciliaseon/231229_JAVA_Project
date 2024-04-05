package day06;

import java.util.Random;

public class Array04 {

	public static void main(String[] args) {
		/*10개의 값을 가지는 배열을 생성한 후
		  1~50랜덤수를 배열에 저장한 후 출력
		  10대 데이터의 합계, 평균, 최대, 최소 출력
		 */
		
		int [] arr = new int [10];
		
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 50;
		System.out.print("배열의 랜덤 수 = ");
		for (int i=0;i<arr.length;i++) {
			arr[i]= (int)(Math.random()*50)+1;
			System.out.print(arr[i]+" ");
			
		}
		
		for (int i=0;i<arr.length;i++) {
			sum+=arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		System.out.println();
		avg = sum/(double)arr.length;
		System.out.println("합계 = " + sum);
		System.out.println("평균 = " + avg);
		System.out.println("최대값 = " + max + " / 최소값 = " + min);
		
		

	}

}
