package day07;

public class String02 {

	public static void main(String[] args) {
		/* String method */
		
		String str = "홍길동";
		String str1 = "";
		// .trim : 불필요한 공백을 제거
		System.out.println("---trim---");
		System.out.println("    hello    ");
		System.out.println("    hello    ".trim());
		
		// .toLowerCase(), .toUpperCase() : 대소문자 변환
		System.out.println("---toLowerCase/ toUpperCase---");
		System.out.println("ToLowerCase".toLowerCase());
		System.out.println("touppercase".toUpperCase());
		
		// .isEmpty() : 객체가 비어있는지 체크 비어있으면 true (값이 있는지 없는지 확인) / 비어있지 않으면 가져오세요.
		System.out.println("---isEmpty---");
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		
		System.out.println(str.isBlank());
		System.out.println(str1.isBlank());
		
		// .replace : 글자를 치환(변환)하는 역할
		System.out.println("---replace---");
		String str2 = "banana,apple,kiwi"; 
		System.out.println(str2.replace(",", "/" ));
		
		// .split : 특정값을 기준으로 나누기 > 배열로 리턴 
		System.out.println("---split---");
		String [] arr = str2.split(",");
		for (String s : arr) {
			System.out.println(s);
		}
		
		String [] arr1 = str2.split("");
		for (String s : arr1) {
			System.out.print(s+" ");
		}
		
//		System.out.println(arr); // 주소가 출력
		
		System.out.println();
		
		// Integer.parseInt() : 문자 > 숫자 변환
		String num1 = "1";
		String num2 = "2";
		System.out.println(num1+num2);
		
		int num3 = Integer.parseInt(num1);
		int num4 = Integer.parseInt(num2);
		System.out.println(num3+num4);
		
		// String.valueOf() : 숫자 > 문자 변환 
		// instanceof : 객체의 형이 일치하는지 체크 (참조형만 가능 / 기본데이터형 확인 x)
		int a = 1522;
		String as = String.valueOf(a);
		System.out.println(as);
		
		System.out.println(as instanceof String);

		
	}

}
