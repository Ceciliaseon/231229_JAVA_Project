package day03;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) { 
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("단을 입력해주세요.");
		int num = sc.nextInt();
		System.out.println(num+"단");
		for (int i=1;i<=9;i++) {
			System.out.println(num+"*"+i+" = "+(num*i));
		}
		
		sc.close();
		
	}

}
