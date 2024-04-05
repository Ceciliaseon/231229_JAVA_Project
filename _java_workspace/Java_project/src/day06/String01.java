package day06;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 : 문자열을 다루기 위한 클래스 => 참조변수
		 * String atr = new String ();
		 * > String str = "홍길동"; // 일반 자료형처럼 이용가능
		 * 
		 * */
		
		String str = "홍길동!!!!!";
		System.out.println(str);
		
		String str1 = new String();
		str1 = "홍길순";
		System.out.println(str1); // 기본 null
		
		//.length : 전체 글자의 길이(글자수)
		System.out.println("---length---");
		System.out.println(str.length());
		
		//.charAt(index) : index 번지에 있는 문자열을 반환
		System.out.println("---charAt(index)---");
		System.out.println(str.charAt(2));
		
		//.subString : 문자열을 추출
		System.out.println("---subString---");
		System.out.println(str.substring(1,3)); // 0번지 부터 시작해서 2번지 전까지 추출 (2번지는 포함x)
		System.out.println(str.substring(1)); // 1번지부터 끝까지	
		
		//str.compareTo(str1) : str과 str1을 비교하여 앞이면 -1, 같으면 0, 뒤에 있으면 1을 출력 (사전순으로 문자를 정렬)
		System.out.println("---compareTo---");
		System.out.println("g".compareTo("a"));
		System.out.println("a".compareTo("a"));
		System.out.println("a".compareTo("z"));
		
		//.concat : 이어붙이기 (+연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("Hello".concat("JAVA"));
		System.out.println("Hello"+"JAVA");
		
		//.equals : 두 문자열이 같은지 비교 (대소문자구분) / 같으면 true 리턴, 다르면 false 리턴 
		// 문자 == 로 비교가 안됨
		// 참조변수 == 로 비교하게 되면 주소가 같은지 확인
		System.out.println("---equals---");
		System.out.println("banana".equals("Banana"));
		System.out.println("banana".equals("banana"));
		
		//.indexOf : 문자의 위치 (index)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		//.lastIndexOf : 문자의 위치를 뒤에서부터 찾아주는 기능 
		System.out.println("---indexOf---");
		System.out.println(str.indexOf("동"));
		System.out.println(str.indexOf("!"));
		System.out.println(str.lastIndexOf("!"));
		System.out.println(str.indexOf("$"));
		
		System.out.println();
		System.out.println("---------------");
		
		/* 문제) 이메일에서 id를 추출 */
		String email = "abc123@naver.com";
//		System.out.println(email.indexOf("@"));
		String id = email.substring(0,email.indexOf("@"));
		System.out.println("id = ".concat(id));
		
		email = "asgdedggsssss@naver.com";
		id = email.substring(0,email.indexOf("@"));
		System.out.println("id = ".concat(id));
		
		System.out.println();
		
		// .contains : 해당 문자를 포함하는지 체크 boolean으로 리턴
		String file = "이것이자바다.java";
		System.out.println(file.contains("java"));
		
	}

}
