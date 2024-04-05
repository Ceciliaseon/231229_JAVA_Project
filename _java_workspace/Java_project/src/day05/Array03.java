package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int [] arr = new int [] {45,35,70,30,20,46,22,78};
		/* arr 배열의 합계와 평균을 출력
		 * 최대값 / 최소값 출력
		 * Math.max / Math.min
		 * Math.max(최대값) , Math.min(최소값) 
			System.out.println(Math.max(5, 3));
			System.out.println(Math.min(5, 3));
		 * if문
		 */

		int sum = 0;
		//성적 데이터 (0~100)
		int max = arr[0]; // 가장 큰 값을 넣기 위한 변수
		int min = arr[0]; // 가장 작은 값을 넣기 위한 변수
		
//		int max = 0;
//		int min = 100; << 이렇게 작성해도 됨 (배열이 완성되어 있지 않다면) 

		for (int i=0; i<arr.length;i++) {
			sum+=arr[i];
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
			
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
			
		}
		
		
		System.out.println("합계 = " + sum);
		double avg = sum/(double)arr.length;
		System.out.println("평균 = " + avg);		
		System.out.println("최대값 = " + max);
		System.out.println("최소값 = " + min);

		
		
		
	}

}
