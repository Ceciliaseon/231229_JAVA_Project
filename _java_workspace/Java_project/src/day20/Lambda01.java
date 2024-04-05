package day20;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda01 {

	public static void main(String[] args) {
		/* lambda : 람다식 (식(메서드)을 단순하게 표현하는 방법)
		 * 외부 자료의 부수적인 영향 (side effect)를 주지 않도록 구현하는 방식
		 * Lambda + Stream => 람다와 스트림 
		 * Stream : 흐름 / 자료의 대상과 관계없이 동일한 연산을 수행할 수 있도록 해주는 반복자
		 * - 메서드 체이닝 기법을 사용
		 * - 
		 * 
		 * lambda function : 람다함수 > 익명클래스를 사용하여 쓰는 함수를 지칭
		 * 
		 * 람다의 장점 : 코드의 간결성(가장 큰 장점), 병렬처리 가능(멀티스레드), 불필요한 코드, 연산을 최소화
		 * 람다의 단점 : 가독성이 떨어짐, 반복문 사용시 성능 저하
		 * 
		 * - 람다의 표현식
		 * (매개변수) -> {구현};
		 * 매개변수가 1개이면 () 생략 가능. 
		 * ex) (x) -> {return 1}; >> x -> {return 1}; 으로 사용 가능
		 * return이 없으면 {} 생략 가능
		 * x -> x+1;
		 * (x,y) -> x+y; 가능
		 * (x,y) -> {return x+y};
		 * 
		 * 매개변수가 2개인데 ()가 없으면 오류 / return 값이 있는데 {}가 없다면 오류 
		 * */
		
		
		ArrayList <Integer> list = new ArrayList<>();
		list.add(10);
		list.add(67);
		list.add(20);
		list.add(40);
		list.add(30);
		list.add(90);
		list.add(70);
		list.add(80);
		
		for (Integer tmp : list) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("--------람다식 처리--------");
		list.forEach(n->{
			System.out.print(n+" ");
		});
		System.out.println();
		
		// 람다함수(익명함수) 구현
		Consumer<Integer> method = (n)->{
			System.out.print(n+" ");
		};
		
		System.out.println("---Consumer를 활용한 출력---");
		list.forEach(method);
		
	}

}
