package day09;

import java.util.Scanner;

public class 과제_ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int com [] = new int [3];
		int user [] = new int [3];
		int strike = 0;
		int ball = 0;
		
		// 컴퓨터 숫자 생성 (중복제거)
		for (int i=0;i<com.length;i++) {
			com[i] = (int)(Math.random()*9)+1;
			for (int j=0;j<com.length;j++) {
				if (com[j] == com[i]) {
					i--;
					break;
				}
			}
		}
		// 사용자 입력
		while (true) {
			System.out.println("1~9까지 정수를 입력하세요(중복x)");
			for (int i=0;i<user.length;i++) {
				user[i] = sc.nextInt();
				for (int j=0;j<user.length;j++) {
					if (user[j]==user[i]) {
						System.out.println("중복된값");
						i--;
						break;
					}
				}
			}
			for (int i=0;i<com.length;i++) {
				for (int j=0;i<user.length;j++) {
					if (com[i] == user[j] && i==j){
						strike++;
					} else if (com[i] == user[j] && i!=j) {
						ball++;
					}
				}
			}
			
			System.out.println(strike + "s" + ball+"b");
			if (strike == 3) {
				System.out.println("정답");
				break;
			} else if (strike ==0&&ball==0) {
				System.out.println("out");
			} else {
				System.out.println(strike +"s"+ ball+"b");
			}
		}

	}

}
