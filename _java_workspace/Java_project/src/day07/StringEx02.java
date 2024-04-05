package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		/* 5개의 파일명이 주어졌을 때, 
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 */
		
		String [] fileName = {"이것이자바다.java", "java의정석.java", "String.jpg", "String 메서드.txt", "array.txt"};
		
		// ex : 검색어 java > 이것이자바다, java의 정석 이 출력
		// ex : 검색어 String > String
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("글자를 입력하세요.");
		String str = sc.next();
		int count = 0;
		for (int i=0;i<fileName.length;i++) {
			if (fileName[i].contains(str)) {
					System.out.println(fileName[i]);
					count++;
			}
		}	
		// 위와 같은 결과가 나옴 
//		for (String tmp : fileName) {
//			if (tmp.contains(str)) {
//				System.out.println(tmp);
//				count++;
//			}
//		}
		if (count==0) {
			System.out.println("검색 결과가 없습니다.");
		}
		
		sc.close();
		
		
	}

}
