package day20;

import java.util.HashMap;

public class Lambda02 {

	public static void main(String[] args) {
		// map을 구성하여 forEach를 사용하여 출력
		
		HashMap<String, Integer> map = new HashMap<>();
		
		map.put("길동", 30);
		map.put("철수", 60);
		map.put("영희", 25);
		map.put("영철", 42);
		map.put("만수", 99);
		
		map.forEach((x,y)->{
			System.out.println(x+":"+y);
		});
		System.out.println();

		Number sum = (a,b)->{return a+b; };
		int hap = sum.add(30,20);
		System.out.println(hap);

		System.out.println(sum.add(6, 3));
		
		
		Number max = (a,b)->(a>=b)?a:b; // 함수구형 (return 값이 없을때)
		System.out.println(max.add(30, 50));
	}

}


// 함수형 인터페이스 생성
// 메서드가 반드시 1개여야만 함
@FunctionalInterface
interface Number{
	int add(int a, int b);
//	int max(int a, int b); // 메서드가 2개이면 error
	
}
