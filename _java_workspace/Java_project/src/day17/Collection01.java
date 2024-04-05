package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		 * List, Set, Map > 인터페이스. 반드시 구현 클래스로 객체를 생성
		 * 데이터를 묶어서 관리할 때 사용
		 * 주로 배열 대신 사용
		 * 
		 * List(배열과 동일)
		 * - 값을 하나씩 저장
		 * - 순서를 보장(index)
		 * - 중복 허용
		 * - 배열 대신 가장 많이 사용되는 구조
		 * 
		 * Set
		 * - 값을 한씩 저장
		 * - 순서를 보장하지 않음 (index라는 개념이 없음)
		 * - 중복을 허용하지 않음 (동일한 값이 입력되면 버려짐)
		 * 
		 * 
		 * Map
		 * - 값을 두개씩 저장 (key, value) 한 쌍으로 저장 
		 * - key : 중복 불가능 / value 중복 가능
		 * - key가 중복되면 value는 엎더쓰게 됨 
		 * - id / password처럼 하나의 자료를 묶어서 저장해야할 때 사용
		 * 
		 * 배열은 기본 자료형, 클래스 자료형으로 구성이 가능함
		 * int arr[], String arr[], Student arr[] 모두 가능
		 * 
		 * 하지만, Collection에서는 기본 자료형은 불가능함. 클래스 자료형만 구성가능
		 * 기본 자료형에 맞는 클래스 자료형을 사용하면 됩
		 * int > Integer / String
		 * 나머지는 기본자료형에 첫글자만 대문자로 변환하면 클래스가 됨
		 * long > Long / byte > Byte / boolean > Boolean ...
		 * 
		 * 만냑 클래스를 지정하지 않으면 Object가 자동 설정됨
		 * 
		 * List<클래스명> 객체명 = new 구현클래스<클래스명>();
		 * List > 구현클래스 ArrayList, LinkedList
		 * List 내부에 toString을 가지고 있어서 그대로 출력해도 됨 
		 * 
		 * ArrayList : 검색할 때 유리한 List (배열과 가장 비슷)
		 * - 미리 길이를 지정하지 앟음. 추가되면 늘어남, 삭제되면 줄어듬 (자동)
		 * - 추가, 삭제하는 것이 쉬움, 검색이 쉬움
		 * 
		 * LinkedList : 추가, 삭제가 많을 때 유리한 List
		 * - 값을 중간에 끼워넣거나 빼는 것이 쉬움
		 * - 검색할 때는 속도가 느림 
		 * */
		
		List<Integer> list = new ArrayList<Integer>(); // 부모를 기준으로 생상
		ArrayList<Integer> list1 = new ArrayList<Integer>(); // 자식을 기준으로 생성
		ArrayList list2 = new ArrayList(); // object로 생성 
		ArrayList<Integer> list3 = new ArrayList<>();
		
		//add() : 요소를 추가 
		list.add(1);
		list.add(2);
		list.add(3);
//		list.remove(0);
		System.out.println(list);
		// get(index) : index번지의 요소를 가져오기
		System.out.println(list.get(0)); // get > getter
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		// set(index, 값) : index 번지의 값을 변경하기
		list.set(0, 5);
		System.out.println(list.get(0));
		System.out.println(list);
		System.out.println("---for문을 활용하여 출력---");
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("---");
		// size() : 총개수를 확인
		System.out.println(list.size());
		
		System.out.println("---");
		// 문자열을 담을 수 있는 ArrayList를 생성
		// 문자열 5개를 담고 출력
		// 총개수가 몇개인지도 출력
		
		List<String> listStr = new ArrayList<String>();
		listStr.add("바나나");
		listStr.add("사과");
		listStr.add("딸기");
		listStr.add("블루베리");
		listStr.add("키위");
		
		System.out.println(listStr);
		
		for (int i=0;i<listStr.size();i++) {
			System.out.print(listStr.get(i)+" ");
		}
		System.out.println();
		
		// 향상된 for문
		for (String s : listStr) {
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println(listStr.size());
		
		
		System.out.println("---");
		// list1에 1~10까지 값을 지정한 후 출력
		for (int i=0;i<10;i++) {
			list1.add(i+1);				
		}
		System.out.println(list1);
		
		list1.set(0, 7);
		System.out.println(list1);
		
		//remove(index) : index 번지의 값을 삭제
		//remove(object) : object의 요소를 삭제 (번지와 상관없이)
		list1.remove(0);
		System.out.println(list1);
		Integer a = 9;
		list1.remove(a);
		System.out.println(list1);
		
		//contains(object) : list에 해당 값이 있는지 검사 true / false로 리턴
		System.out.println(list1.contains(a));
		
		//clear() : list를 비우는 용도 (요소 전부 삭제)
		list1.clear();
		System.out.println(list1);
		
		//isEmpty() : list가 비어있는지 체크 비어있으면 true / false
		System.out.println(list1.isEmpty());
		System.out.println("-----------");
		
		
		//ArrayList로 number 를 생성
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			number.add(i+1);
		}
		
		for (Integer i : number) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("-----------");
		
		/* Iterator : index가 없는 값을 출력하기 위해 사용
		 * list에서는 순서를 보장하기 때문에 get(i)를 사용하여 원하는 번지에 접근 가능
		 * set / map은 순서를 보장하지 않기 때문에 일반 for문을 사용할 수 없음
		 * 그래서 향상된 for, Iterator를 사용
		 * 순서와 상관없이 값을 가져올 수 있는 구문을 사용해야 함
		 * map > 향상된 for, Iterator 둘다 직접 사용가능하지 않음 (불가능)
		 * */
		
		System.out.println(">> Iterator 출력");
		Iterator<Integer> it = number.iterator();
		while(it.hasNext()) { // .hasNext() : 다음 요소가 있는지 체크 true / false로 리턴 
			Integer tmp = it.next(); //.next() : 다음 요소 가져오기
			System.out.print(tmp+" ");
		}
		System.out.println();
		
		// .indexOf(값): 해당 값이 list에 있는지 확인하고 해당 index를 반환 / 없다면 -1리턴
		System.out.println(number.indexOf(a));
		System.out.println(number.contains(a));
		Integer x = 11;
		System.out.println(number.indexOf(x));
		
		// number 리스트를 비우고, 값을 무작위로 5개만 추가
		number.clear();
		number.add(77);
		number.add(42);
		number.add(22);
		number.add(14);
		number.add(25);
		number.add(32);
		System.out.println(number);
		
		//정렬
		//Collections.sort() //오름차순만 가능
		Collections.sort(number);
		System.out.println(number);
		System.out.println();
		System.out.println("--sort(Comparator를 구현한 객체)--");
		// sort(Comparator를 구현한 객체) : 정렬
		// Comparator 인터페이스를 구현한 구현체를 넣어야 함 (익명클래스)
		// compareTo 메서드를 구현하여 객체를 정렬
		// - compareTo : 사전상으로 앞에 있으면 -1, 같으면 0, 뒤에 있으면 1
		number.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) { //o1 1번으로 읽는 값
				// o1 - o2 : 오름차순 / o2 - o1 내림차순 정렬
				// 결과가 -면 앞으로 보내고, +면 뒤로 보내는 역할
				return o2-o1;
			}
		});
		System.out.println(number);
		
	}

}
