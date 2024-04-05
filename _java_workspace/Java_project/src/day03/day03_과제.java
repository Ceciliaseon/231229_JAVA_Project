package day03;

import java.util.Scanner;

public class day03_과제 {

	public static void main(String[] args) {
		
		/* 
		 up/down 게임
		 1~50사이의 랜덤수를 생성하여 맞추는 게임
		 */

		Scanner sc = new Scanner (System.in);
		int num = (int)(Math.random()*50)+1;
		
		System.out.println("UP & DOWN Start! 숫자를 맞춰보세요!");
		int i = 0; // 사용자 입력값
		int count = 0; // 게인 횟수
		
		while (/*i!=num*/ count < 5) {
			System.out.println("입력 > ");
			i = sc.nextInt();
			count++;
//			if (count>=6) {
//				System.out.println("횟수 5회를 초과하였습니다.");
//				break;
//			}
			if (i<num) {
				System.out.println("UP! 입력 > " + count + "회");
			} else if (i>num) {
				System.out.println("DOWN! 입력 > " + count + "회");
			} else {
				System.out.println("정답입니다! " + count + "회");
				break;
			}
		}
		if(count > 5) {
			System.out.println("횟수제한 실패");
		}
		

		sc.close();
		
//		int num = (int)(Math.random()*50)+1;
//		int i = 0;
//		
//		while (num!=i) {
//			System.out.println("입력 > ");
//			i = sc.nextInt();
//			if (i>num) {
//				System.out.println("down");
//			} else if (i<num) {
//				System.out.println("up");
//			}
//		}
//		
//		System.out.println("정답");
//		
//		sc.close();
	}

}
