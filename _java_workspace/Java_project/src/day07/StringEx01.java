package day07;

public class StringEx01 {

	public static void main(String[] args) {
		/* file에 저장되어있는 문자를 파일명과 확장자로 분리하여 출력 
		 * 파일명 : 이것이자바다
		 * 확장자 : java
		 * */

		String file = "이것이자바다.java";
		
		String file_name = file.substring(0,file.indexOf("."));
		System.out.println("파일명 : "+file_name);
		
		String suffix = file.substring(file.indexOf(".")+1);
		System.out.println("확장자 : "+suffix);
		
		System.out.println();
		
		String [] arr = file.split("\\.");
		for (String s : arr) {
			System.out.println(s);
		}
		
		// .contains : 해당 문자를 포함하는지 체크 boolean으로 리턴
		if (file.contains("java")) {
			System.out.println("자바파일입니다.");
		}

	}

}
