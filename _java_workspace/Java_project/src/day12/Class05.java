package day12;

import javax.sql.rowset.serial.SerialArray;

public class Class05 {
	/* 객체를 생성시 값을 초기화 하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 (int = 0 / String = null)
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * ex) private String name = "홍길동";
	 * 3. 초기화 블럭 : { } 멤버변수를 초기화 하는 방법 
	 * 4. 생성자 : 객체를 생성할 때 초기화해서 생성하는 값
	 * 
	 * 초기값의 우선순위
	 * 기본값 < 명시적초기값 < 초기화 블럭 < 생성자 (가장 우선순위가 높음)
	 * 
	 * */
	
	public static void main(String[] args) {
		
		EzenStudent ez = new EzenStudent("인천","홍길동","000","백엔드개발");
		// toString()메서드가 없으면 객체의 주소가 출력
		// toString()메서드가 있으면 toString() 출력
		System.out.println(ez); // es.toString() 같은 의미
		System.out.println("-------");
		EzenStudent ez2 = new EzenStudent("강남","강남순","111","프론트개발");
		System.out.println(ez2);
		EzenStudent ez3 = new EzenStudent();
		System.out.println(ez3);
		
		// 학생 5명 생성
		EzenStudent ez4 = new EzenStudent("신사" , "유해진", "222", "자바스크립트");
		System.out.println(ez4);
		EzenStudent ez5 = new EzenStudent("인천" , "김지혜", "333", "백엔드개발");
		EzenStudent ez6 = new EzenStudent("인천" , "최미자", "444", "백엔드개발");
		EzenStudent ez7 = new EzenStudent("인천" , "홍만식", "555", "백엔드개발");
		System.out.println(ez5);
		System.out.println(ez6);
		System.out.println(ez7);
		
		EzenStudent stendenArr [] = new EzenStudent [7];
		stendenArr[0] = ez;
		stendenArr[1] = ez2;
		stendenArr[2] = ez3;
		stendenArr[3] = ez4;
		stendenArr[4] = ez5;
		stendenArr[5] = ez6;
		stendenArr[6] = ez7;
		
		System.out.println("==========");
		// 김지혜 학생이 듣고 있는 과목을 출력
		String searchName = "강남순";
		System.out.println(searchName+" 학생이 듣고 있는 과목");
		
		for (int i=0;i<stendenArr.length;i++) {
			if (stendenArr[i].getName().equals(searchName)) {
				System.out.println("> " + stendenArr[i].getgroup());
			}
		}
		
		System.out.println("----------");
		// 김지혜가 듣고 있던 과목을 변경하려고 할때
		String modify = "강남순";
		for (int i=0;i<stendenArr.length;i++) {
			if (stendenArr[i].getName().equals(modify)) {
				stendenArr[i].setgroup("빅데이터");
				System.out.println(stendenArr[i]);
			}
		}
		
		System.out.println("----------");
		// 자바를 듣고있는 학생명단을 출력
		// 학생이 없으면 "명단이 없습니다." 라고 출력
		int cnt = 0;
		String subject = "프론트개발";
		for(int i=0;i<stendenArr.length;i++) {
			if (stendenArr[i].getgroup().equals(subject)) {
				System.out.println(stendenArr[i]);
				cnt++;
			}
		}
		if (cnt == 0) {
			System.out.println("명단이 없습니다.");
		}
	}
}

class EzenStudent{
	// 학생의 정보를 생성하는 클래스
	// 멤버변수 : 이름 / 번호 / 문의 강의
	
	private String gigum = "Incheon"; // 명시적 초기값
	private String name; // 기본초기값 null
	private String phoneNum;
	private String group;
	
	public EzenStudent () {}	
	
	public EzenStudent(String gigum, String name, String phoneNum, String group) {
//		super(); // 나의 상위(부모) 클래스 생성사 호출
		this.gigum = gigum;
		this.name = name;
		this.phoneNum = phoneNum;
		this.group = group;
	}
	
	{
	 // 초기화 블럭 영역 
		gigum = "인천";
		group = "미정";
		name = "미상";
		phoneNum = "000";
		
	}
	// toString() == print메스드와 비슷한 일을 함 
	@Override // 상속받은 메서드를 바꿔서 쓰고 싶을 때 사용
	public String toString() { 
		return gigum + " > " + name + " ( " + phoneNum + " / " + group + " )";
	}

//	public void printStudent() {
//		System.out.println("이름 : " + name);
//		System.out.println("전화번호 : " + phoneNum);
//		System.out.println("희망강의 : " + group);
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getgroup() {
		return group;
	}

	public void setgroup(String class1) {
		group = class1;
	}
	
	
}