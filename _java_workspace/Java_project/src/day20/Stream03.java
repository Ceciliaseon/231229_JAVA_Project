package day20;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream03 {

	public static void main(String[] args) {
		
		// Student  클래스로 리스트 구성
		// add로 5명 추가
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("홍길동", 98));
		list.add(new Student("박철수", 50));
		list.add(new Student("김영희", 73));
		list.add(new Student("홍영길", 45));
		list.add(new Student("김말순", 77));
		
//		System.out.println(list);
		
		// 스트림을 이용하여 콜솔에 출력 
		list.stream()
		.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		list.stream()
		.forEach(n-> { // n > student 객체
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name +" : " + score);
		});
		System.out.println();
		
		// list 점수 함계 / 전체 인원수 출력
		int sum = list.stream()
				  .mapToInt(n-> n.getScore())
				  .sum();
		System.out.println("전체 점수 합계 : " + sum);
		
		long cnt = list.stream()
				   .count();
		System.out.println("전체 인원수 : " + cnt + "명");
		
		
	}

}
