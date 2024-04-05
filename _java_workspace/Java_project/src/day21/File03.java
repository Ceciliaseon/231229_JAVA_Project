package day21;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File03 {

	public static void main(String[] args) throws IOException {
		/* FileWriter를 이용한 파일 쓰기 > 문자 기반 스트림
		 * 일반적으로 다시 같은 이름의 파일을 생성하면 덮어쓰기
		 * 기존 파일에 추가모드가 가능
		 * */
		FileWriter fw = new FileWriter("writer.txt"); // 기록할 파일명 > writer.txt

		for (int i=0;i<=10;i++) {
			String data = i+ " test \r\n"; // \n Enter, \r\n : 캐리지 리턴 (앞으로 밀어줌)
			fw.write(data); // 파일에 기록하라는 의미 
			fw.write("my project I/O Test \r\n");
		}
		
		fw.close();
		
		FileWriter fw2 = new FileWriter("writer.txt",true);
		for(int i=11;i<=20;i++) {
			String data = i+ " test \r\n"; // \n Enter, \r\n : 캐리지 리턴 (앞으로 밀어줌)
			fw2.write(data); // 파일에 기록하라는 의미 
			fw2.write("my project I/O Test \r\n");
		}
		
		fw2.close();
		
		
		/* PrintWriter를 이용한 파일 쓰기 > 문자 기반 스트림
		 * 기존파일에 추가하려면 파일 객체를 생성해서 추가
		 */
		PrintWriter pw = new PrintWriter("writer2.txt");
		
		for (int i=0;i<=5;i++) {
			String pwdata = i+ "tset 파일입니다. \r\n";
			pw.write(pwdata);
		}
		
		pw.close();
		
		PrintWriter pw2 = new PrintWriter(new FileWriter("writer2.txt", true));
		
		for (int i=6;i<=10;i++) {
			String data = i+" append mode \r\n";
			pw2.write(data);
		}
		
		pw2.close();
		
		// 바이트 기반 스트림
		// FileOutputStream 을 이용한 파일쓰기
		
		FileOutputStream output = new FileOutputStream("out.txt");
		
		for (int i=0;i<=5;i++) {
			String data = i+" Test mode \r\n";
			//byte 기반 스트림이기 때문에 byte 단위로 쓰기
			output.write(data.getBytes());
		}
		
		output.close();
		

	}

}
