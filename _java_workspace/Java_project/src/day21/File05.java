package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		/* test.txt 파일을 읽어들여 map 저정하여
		 * 명단, 합계, 평균을 출력
		 * txt에서 읽어들이는 값은 모두 String
		 * 계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(); String > int로 변환 
		 */
		
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		HashMap<String, Integer> map = new HashMap<>();
		
		System.out.println("---명단---");

		int sum = 0;
		
		while(true) {
			String data = br.readLine();
			if(data == null) {
				break;
			}
//			System.out.println(data);
			//substering(포함, 미포함)
			String name = data.substring(0, data.indexOf(" "));
			int score= Integer.parseInt(data.substring(data.indexOf(" ")+1));
			map.put(name, score);		
			
		}
		for (String key : map.keySet()) {
			System.out.println(key+" / " +map.get(key));
			sum+=map.get(key);
		}
		
		System.out.println();
		System.out.println(map);
		System.out.println();
		System.out.println("점수 합계 : " + sum);
		double avg = sum/(double)map.size();
		System.out.println("평균 : " + avg);		

		// br 끊기
		if( br != null) { // 객체가 생성되었다면 끊기		
			br.close();
		}
		

		

	}

}
