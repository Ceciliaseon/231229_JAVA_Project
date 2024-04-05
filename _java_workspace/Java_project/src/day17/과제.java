package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class 과제 {  

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고, 출력
		 * 합계를 출력
		 * 입력값 : 45, 78, 90, 25, 26 > String
		 * list에 넣고 출력 > 합계(인원수) 출력
		 * 전체 몇명, 70점 이상 몇명인지 > 갯수 출력
		 * */
		
		// 배열을 List로 구성할 때 (배열 자체가 같은 int 자료형일 때 사용)
		// List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		
		Scanner sc = new Scanner (System.in);
		HashSet<Integer> set = new HashSet<Integer>();
		
		while(true) {
			System.out.println("점수를 입력하세요 >> ");
			String num = sc.next();
			if (Integer.parseInt(num)==0) {
				break;
			} else {
				System.out.println("1 : 계속 / 0 : 종료");
				int cnt = sc.nextInt();
				set.add(Integer.parseInt(num));
				if (cnt == 0) {
					break;
				}
			}
		}
		
		int sum = 0;
		int cheack = 0;
		List<Integer> list = new ArrayList<Integer>(set);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			sum+=list.get(i);
			if (list.get(i)>=70) {
				cheack++;
			}
		}
		
		System.out.println("점수 합계 : "+sum);
		System.out.println("총 인원수 : "+list.size()+"명");
		System.out.println("70점 이상 인원수 : "+ cheack+"명");

	}

}
