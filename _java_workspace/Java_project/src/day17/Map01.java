package day17;

import java.util.HashMap;
import java.util.Iterator;

public class Map01 {

	public static void main(String[] args) {
		/* Map
		 * - 값을 2개 쌍으로 저장, key / value
		 * - key : 중복불가 , value : 중복가능
		 * - HashMap을 가장 많이 사용
		 * 
		 * HashMap<key클래스, value클래스> map = new HashMap<key클래스, value클래스>()
		 * map은 값이 2개이기 때문에 향상된 for / iterator 사용 안됨
		 * map의 key > set으로 구성 후 출력
		 * 
		 * list, set > add() 형태로 값을 추가
		 * map > put() 형태로 값을 추가
		 * getKey(), getValue() : 따로 추출이 가능
		 * */
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("apple", 2000);
		map.put("banana", 3000);
		map.put("peach", 4000);
		map.put("orange", 1000);
		map.put("kiwi", 3000);
		
		System.out.println(map);
		System.out.println(map.keySet()); // key만 별도로 set구성
		System.out.println(map.values()); // value만 구성
		
		// get("key") > value 값을 리턴
		System.out.println(map.get("apple")); 
		
		//remove() > key 에대한 값을 삭제하면서 value를 리턴
		System.out.println(map.remove("apple"));
		System.out.println(map);
		System.out.println(map.remove("a")); // null을 리턴
		System.out.println(map.remove("banana", 3000)); //key, value를 동시에 주면 true / false로 리턴
		System.out.println(map);
		
		int sum = 0;
		//향상된 for문으로 출력
		for (String key : map.keySet()) {
			sum+=map.get(key);
			System.out.println(key+":"+map.get(key));
		}
		System.out.println("------------");
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key+":"+map.get(key));
		}
		
		System.out.println("구입 합계 : "+sum);
		
	}

}

