package day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Stream01 {

	public static void main(String[] args) {
		/* Stream(스트림)
		 * - 실제 입력 / 출력의 표현된 데이터의 이상화된 흐름
		 * - 스트림은 자료에 대한 스트림을 생성하여 연산
		 * - 그 연산을 다 수행하면 스트림은 소모됨
		 * - 스트림 연산은 기존 자료에 변경을 유발하지 앟음
		 * - 스트림은 기존 자료를 복사하여 복사본은 연산에 사용
		 * - 중간연산과 최종 연산으로 구분됨
		 * - 중간연산은 메서드를 이어서 사용할 수 있음
		 * 	ㄴ distinct() : 중복제거 , filter() : 조건에 맞는 값만 다음 스트림으로 넘김
		 *  ㄴ limit() : 스트림의 일부를 잘라냄, skip() : 스트림의 일부를 건너뜀
		 *  ㄴ peek() : 작업 수행, sorted() : 정렬 ... 	
		 * - 최종연산은 마지막에만 가능 (최종연산이 되는 즉시 끝)
		 *  ㄴ forEach(), count(), sum(), allMatch() : 스트림요소가 전부 일치하는지
		 *  ㄴ anyMath() : 하나라도 일치하는지 ,toArray() : 배열로 변환, Collect() : 스트림의 요소를 수집 ...
		 *  
		 *  allMatch(), anyMath() >> 스프링부트 진행 시 많이 사용
		 * */
		
		int arr [] = {1,2,3,4,5,6,7,8};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println(sum);
		System.out.println("---스트림을 이용한 합계---");
		
		int total = Arrays.stream(arr).sum();
		System.out.println(total);
		
		System.out.println("---스트림을 count()---");
		long cnt = Arrays.stream(arr).count();
		System.out.println(cnt);
		
		System.out.println("---스트림을 average()---");
		// 0으로 나눌 가능성이 있기 때문에 Exception을 처리해 줄 수 있는 패키리로 처리 > OptionalDouble
		OptionalDouble avg = Arrays.stream(arr).average();
		System.out.println(avg);
		
		// arr 값중 5이상의 값만 합계
		int s5 = Arrays.stream(arr).filter(n-> n>=5).sum();
		System.out.println(s5);
		
		System.out.println("----------------");
		//점수 배열을 생성한 후 70점 이상만 합계와 평균
		//가장 높은 점수 출력
		int num [] = {40,35,67,78,44,90,88,21};
		
		int s7 = Arrays.stream(num).filter(n-> n>=70).sum();
		OptionalDouble numavg = Arrays.stream(num).filter(n-> n>=70).average();
		long numcnt = Arrays.stream(num).filter(n-> n>=70).count();
		
		System.out.println("70점 이상 인원 : " + numcnt);
		System.out.println("70점 이상 합계 : "+ s7);
		System.out.println("70점 이상 평균 : " + numavg);
		System.out.println("최고 높은 점수 : " + Arrays.stream(num).max());
		System.out.println();
		
		ArrayList <Integer> list = new ArrayList<>();
		list.add(30);
		list.add(20);
		list.add(3);
		list.add(3);
		list.add(3);
		list.add(9);
		list.add(9);
		list.add(9);
		list.add(13);
		list.add(13);
		list.add(13);
		list.add(21);
		
		System.out.println("---list를 stream 구성---");
		list.stream()
		.forEach(n-> System.out.print(n+" ")); // sum이 안되는 이유 >> Integer이기 때문에
		System.out.println();
		System.out.println("---중복제거---");
//		System.out::println
		list.stream()
		.distinct()
		.forEach(n-> System.out.print(n+" "));
		System.out.println();
		System.out.println("---중복제거 후 정렬---");
		list.stream()
		.sorted()
		.distinct()
		.forEach(n-> System.out.print(n+" "));
		
		System.out.println();
		System.out.println("---스트림 객체 생성---");
		Stream<Integer> s1 = Stream.of(10,20,40,50,80,30);
		
		System.out.println("--Integer 스트림 합계--");
		//map : 스트림 형변환에 사용되는 중간연산
		//mapToInt : map의 값을 int로 변환
		//intValue : Integer 객체에서 int형 값을 추출하는 메서드
		int s = s1.mapToInt(n-> n.intValue()).sum();
		System.out.println(s);
		
		// s1.forEach(n-> System.out.print(n+" ")); // 이미 소모되었기 때문에 Exception 발생
		// IllegalStateException : 사용자가 값을 제대로 입력했지만, 개발자 코드가 값을 처리할 준비가 안된 경우 발생
		// ㄴ 즉, 한 번 사용한 스트림이기 때문에 현재 s1에는 값이 어서 생기는 Exception
		
		
	}

}
