package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 (Scanner) > map에 저장 후 출력
		 * 합계, 평균 출력
		 * 입력 > 종료 키워드가 나올 때까지 반복 (1==계속 / 0==종료)
		 * 
		 * 과목과 점수를 이볅해주세요 >
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 * */
		
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> map = new HashMap<>();
		
		int it = 0;
		int sum = 0;
		double avg = 0;
		while(true) {
			System.out.println("과목과 점수를 입력해주세요 (1:입력, 0:종료)");
			it = sc.nextInt();
			if (it == 1) {
				System.out.println("입력 >> ");
				map.put(sc.next(), sc.nextInt());
			} else if (it == 0) {
				for (String key : map.keySet()) {
					sum += map.get(key);
					avg = sum/(double)map.size();
					System.out.println(key+":"+map.get(key));
				}
				System.out.println();
				System.out.println("총합 : "+ sum + " / 평균 : "+avg);
				break;
			}
		}
	}
}
