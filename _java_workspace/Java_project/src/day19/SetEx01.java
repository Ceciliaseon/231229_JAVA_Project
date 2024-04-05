package day19;

import java.util.HashSet;
import java.util.TreeSet;


public class SetEx01 {

	public static void main(String[] args) {
		/* set 중복저장 x
		 * set에 로또번호 6개 생성 후 출력
		 * 랜덤 번호 1~45;
		 * */
		
		HashSet<Integer> set = new HashSet<Integer>();	
		
		// 6번 생성 x : 중복발생 가능성 
		// set이 6개 찰때까지 넣어줘야 함
		
		while (set.size()<6) {
			
//			int random = new Random().nextInt(45)+1;
//			set.add(random);
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		System.out.println("--------");
		
		//set 중에서 정렬리 되는 set TreeSet
		//데이터를 추가, 삭제를 할 때는 조금 시간이 걸리지만,
		//데이터를 검색할 때는 용이한 set 구조	
		//데이터의 최대값, 최소값을 구하는에 용이하다
		
		//Set<Integer> treeset = new TreeSet<Integer>();
		//Set 부모의 객체로 선언할 경우 treeset과 구성은 동일하지만,
		//first, last 등 자식이 가지고 있는 명령어들은 쓸 수 없다.
		
		TreeSet<Integer> treeset = new TreeSet<Integer>();	
		
		while (treeset.size()<6) {
//			int random = new Random().nextInt(45)+1;
//			set.add(random);
			treeset.add((int)(Math.random()*45)+1);
		}
		System.out.println(treeset);
		
		//.first() / .last()
		System.out.println(treeset.first()); // 가장 앞에 있는 값
		System.out.println(treeset.last()); // 가장 뒤에 있는 값

		// .headSet : 지정한 값보다 작은 값
		// .tailSet : 지정한 값보다 큰 값
		System.out.println(treeset.headSet(15));
		System.out.println(treeset.tailSet(15));
		
		// .subSet : 검색 범위 지정, 뒤쪽 값은 미포함
		System.out.println(treeset.subSet(15, 30)); // 15~30 / 30은 미포함

		
	}

}
