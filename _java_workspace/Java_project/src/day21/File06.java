package day21;

import java.io.File;

public class File06 {

	public static void main(String[] args) {
		/* 파일이 가지고 있는 정보 출력
		 * 파일은 첫 경로부터 값을 가지고 있어야 함(무조건)
		 * */

		File f = new File("C:\\Users\\mangs\\Desktop\\mangseon\\_java_workspace\\Java_project\\test.txt");
		String name = f.getName(); // 경로를 제외한 파일 이름 test.txt
		System.out.println(name);
		System.out.println(f.getPath()); // 경로+파일
		System.out.println(f.getParent()); // 경로만
		System.out.println(File.separator); // 파일 구분자
		
		String f2 = f.toString();
		System.out.println(f2); // 텍스트 형태로 저장
		
		// f2를 기준으로 파일 명만 추출
		String file = f2.substring(f2.lastIndexOf(File.separator)+1);
		System.out.println(file);
	
	}

}
