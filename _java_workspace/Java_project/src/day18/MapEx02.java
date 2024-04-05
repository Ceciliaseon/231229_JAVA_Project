package day18;

import java.util.HashMap;
import java.util.Scanner;

import org.xml.sax.HandlerBase;

public class MapEx02 {

	public static void main(String[] args) {
		
		/* 단어장
		 * 단어 5개를 입력받아서 콘솔에 출력하는 기능
		 * 
		 * --단어장--
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지 ...
		 * 
		 * map에 저장 후 출력
		 * */
		
		HashMap<String, String> map = new HashMap<>();
		Scanner sc = new Scanner (System.in);
		
			System.out.println("단어를 입력해주세요 > ");
			for (int i=0;i<5;i++) {
				map.put(sc.next(), sc.next());
			}
			
			System.out.println();
			System.out.println("--단어장--");
			for (String s : map.keySet()) {
				System.out.println(s+" : "+map.get(s));

		}
			
		// ****** Iterator로도 풀어보기
			
	}

}
