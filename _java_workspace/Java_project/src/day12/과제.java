package day12;

public class 과제 {

	public static void main(String[] args) {
		
		Student st = new Student("별1", "940119", "010-1111-1111", 29,"인천");
		
		st.printStInfo();
		st.printGigumIfo();
		
		st.guamokAdd("자바", 2);
		st.guamokAdd("파이썬", 4);
		st.guamokAdd("빅데이터", 3);
		st.printSubjutInfo();
		System.out.println("------------------------");
		
		st.guamokAdd("웹", 3);
		st.guamokAdd("풀스텍", 4);
		st.printSubjutInfo();
		System.out.println("------------------------");

		st.guamokAdd("c++", 4);
		st.printSubjutInfo();
	}
}

//student
/* - 학생정보를 관리하기 위한 클래스
 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
 * - 학원 정보 : 학원명 = "EZEN" (final static), 지점
 * - 수강 정보 : 수강과목, 수강기간 (6개월, 1년 등..)
 * 	 > 여러과목을 들을 수 있음 > 여러과목 수강하기 위해서는 배열로 처리 > 5과목까지 가능
 * 
 * 출력 결과 ex ) 홍길동 / 000101 / 010-1111-1111 / 25
 * 			    EZEN / 인천
 * 				자바 (6개월) / 파이썬 1개월 / 빅데이터 3개월
 * 
 * 기능 (메서드)
 * - 학생 기본정보 출력 기능
 * - 학원 정보 출력 기능
 * - 수강 정보 출력 기능
 * - 학생의 수강정보를 추가하는 기능 (이미 생성된 메서드에 추가하는 기능)
 * 
 */

class Student{
	private String name;
	private String birthDate;
	private String phone;
	private int age;
	private final static String ACADEMY = "EZEN";
	private String gigum;
	
	private String subject []= new String[5];
	private int month[]= new int[5];
	private int count = 0;
	
	public Student() {}
	
	public Student(String name, String birthDate, String phone, int age, String gigum) {
		this.name = name;
		this.birthDate = birthDate;
		this.phone = phone;
		this.age = age;
		this.gigum = gigum;

	}	
	
	public void guamokAdd(String subject, int month) {
		if (count <5) {
			this.subject[count] = subject;
			this.month[count] = month;
			count++;
		} else {
			System.out.println("과목 추가 불가합니다.");
		}
	}
	
	//학생 기본정보 출력 기능
	public void printStInfo() {
		System.out.println(name + " / " + birthDate + " / " + phone + " (" +age+")");
	}
	// 학원 정보 출력 기능
	public void printGigumIfo() {
		System.out.print(ACADEMY);
		System.out.println(" / " + gigum+"지점");
	}
	// 수강 정보 출력 기능
	// > 여러과목을 들을 수 있음 > 여러과목 수강하기 위해서는 배열로 처리 > 5과목까지 가능
	public void printSubjutInfo() {
		for ( int i=0;i<count;i++) {
			System.out.println("수강과목 : " + subject[i] + "("+ month[i]+"개월)");
		}
		}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}



	
	
	
	
 }
