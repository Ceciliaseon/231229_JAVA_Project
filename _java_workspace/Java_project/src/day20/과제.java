package day20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 
		 * 여행사 상품이 있습니다.
		 * 여행비용은 15세 이상은 100만원, 그 미만은 50만원으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용 계산 > 출력  / 2. 고객명단 검색 > 출력
		 * 2. 고객 클래스를 생성, ArrayList로 고객관리
		 * 
		 * 예시) 고객정보 > 고객명단
		 * 이름 : 이순신, 나이 40, 비용 : 100
		 * 이름 : 신사임당, 나이 35, 비용 : 100
		 * 이름 : 홍길동, 나이 10, 비용 : 50
		 * 총 여행경비 : 250
		 * 
		 * 
		 * 20대 이상 고객명단 > 이름순으로 정렬
		 * 이름 :신사임당, 나이 : 35, 비용 100
		 * 이름 : 이순신, 나이 : 40, 비용 100
		 * */
		ArrayList<Customer> list = new ArrayList<>();
		
		list.add(new Customer("김은별", 43));
		list.add(new Customer("강순자", 61));
		list.add(new Customer("이연두", 10));
		
		list.stream()
		.filter(n-> n.getAge()>15)
		.forEach(n-> {
			n.setPay(100);
		});
		
		list.stream()
		.filter(n-> n.getAge()<15)
		.forEach(n-> {
			n.setPay(50);
		});
		
		System.out.println("-- 패키지 여행 고객명단 --");
		list.stream()
		.forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			System.out.println("이름 : "+ name +" | 나이 : "+ age + " | 비용 : "+n.getPay());
		});
		
		int sum = list.stream()
				.mapToInt(n-> n.getPay())
				.sum();
		System.out.println("총 여행 경비 : " + sum);
		
		
		System.out.println();
//		Collections.sort(list);
		System.out.println("-- 20대 이상 고객 명단 --");
		
		list.stream()
		.filter(n-> n.getAge()>=20)
//		.sorted(new Comparator<Customer>() {
//			@Override
//			public int compare(Customer o1, Customer o2) {
//				// TODO Auto-generated method stub
//				return o1.getName().compareTo(o2.getName());
//			}
//		})
		.sorted() // 정렬이 구현되어 있는 경우
		// 기본 클래스 자체에서 정렬이 구현되어있지 않을 경우
		.forEach(n-> {
			String name = n.getName();
			int age = n.getAge();
			System.out.println("이름 : "+ name +" | 나이 : "+ age + " | 비용 : "+n.getPay());
		});
		
		// 익명클래스 사용할 경우 Comparator 대상(매개변수) 2개
		// 클래스 내부에서 구현할 경우 Comparable 구현 대상(매개변수) 1개
		
	}
}
