package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 출력 > 일반 for문 / 향상된 for문 / Iterator출력
		 * */
		
		ArrayList<String> day = new ArrayList<String>();
		
		day.add("수면");
		day.add("베이킹");
		day.add("스터디");
		day.add("영화");
		day.add("외식");
		day.add("쉼");
		
		System.out.println(">> 일반 for문");
		for (int i=0;i<day.size();i++) {
			System.out.print(day.get(i)+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(">> 향상된 for문");
		for (String s : day) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println();
		System.out.println(">> Iterator");
		Iterator<String> str = day.iterator();
		while(str.hasNext()) {
			String tmp = str.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		System.out.println();
		Collections.sort(day);
		System.out.println(day);
		
		day.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는 (크자/작다를 이용) - or +의 값이 출력
				// 문자는 compareTo ㅁ서드를 활용하여 정렬
				// o1.compareTo(o2); > 오름차순
				// o2.compareTo(o1); > 내림차순
				return o2.compareTo(o1); 
			}
		});
		System.out.println(day);
	}

}
