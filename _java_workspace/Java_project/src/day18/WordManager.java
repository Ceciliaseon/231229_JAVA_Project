package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WordManager {
	
	private HashMap<String, String> map = new HashMap<>();
	
	public WordManager() {};

	public void addWord() {
		map.put("apple", "사과");
		map.put("banana", "바나나");
		map.put("school", "학교");
		map.put("mean", "뜻");
		map.put("word", "단어");	
	}

	public void makeWord(Scanner sc) {
			
		System.out.println("단어 :");
		String word = sc.next();
		System.out.println("뜻 : ");
		String mean = sc.next();
			
		map.put(word, mean);
	}
		
	public void searchWord(Scanner sc) {
		
		System.out.println("검색할 단어를 입력하세요 > ");
		String st = sc.next();
		
		if (map.get(st)==null) {
			System.out.println("등록되지 않은 단어입니다. ");
		} else {
			System.out.println(st+":"+map.get(st));
		}
//		if (map.containsKey(st)==true) {
//			System.out.println(word +":"+map.get(st));
//			return;
//		} else {
//			System.out.println("등록되지 않은 단어입니다. ");
//		}
			
	}
	
	public void modifyWord(Scanner sc) {
		
		System.out.println("수정할 단어 입력 >");
		String word = sc.next();
		
		if (map.get(word)==null) {
			System.out.println("수정 가능한 단어가 없습니다.");
		} else {
			map.remove(word);
			return;
		}
//		if (map.containsKey(word)==true) {
//			map.remove(word);
//			return;
//		} else {		
//			System.out.println("수정할 단어가 없습니다.");
//		}
		
		System.out.println("수정(단어) > ");
		word = sc.next();
		
		System.out.println("수정(뜻) > ");
		String mean = sc.next();
		
		map.put(word, mean);
		
		
	}

	public void printWord() {
		
		Iterator<String> it = map.keySet().iterator();
		int cnt = 0;	
		while(it.hasNext()) {
			String word = it.next();
			String mean = map.get(word);
			cnt++;
			System.out.println(cnt+". "+word+":"+mean);
		}
		
	}
	
	public void deletWord(Scanner sc) {
		System.out.println("삭제할 단어 입력 > ");
		String word = sc.next();
		
		if (map.get(word)==null) {
			System.out.println("삭제할 단어가 없습니다.");
		} else {
			map.remove(word);
		}
//		if (map.containsKey(word)==true) {
//			map.remove(word);
//		} else {
//			System.out.println("삭제할 단어가 없습니다.");
//		}
	}

	public void filePrint() throws IOException {
		
		// StringBuffer 객체
		//.append : 기존 String 에 데이터 추가 가능.
		
		// 파일출력
		FileWriter fw = new FileWriter("printWord.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		StringBuffer sb = new StringBuffer();
		// sb.append : 기존 String에 데이터 추가
		
		String data = null;
		sb.append("---단어장---");
		sb.append("\r\n"); // 줄바꿈
		
		for (String key : map.keySet()) {
			sb.append(key +":"+map.get(key));
			sb.append("\r\n");
		}
		
		data = sb.toString(); // StringBuffer 객체여서 String 객체로 변환
		System.out.println(data);
		bw.write(data);
		
		if(bw !=null) {
			bw.close();
		}
		
		if (fw !=null) {			
			fw.close();
		}
		
		
	}
	
}
