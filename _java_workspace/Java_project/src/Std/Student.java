package Std;

import java.util.HashMap;
import java.util.Objects;

import StdManager_class.Subject;

public class Student {
	
	// 멤버변수 : 이름, 나이, 전화번호, map(과목, 점수), 합계, 평균
	// 생성자, 메서드, getter/setter, 출력메서드
	// 메서드
	// - 출력메서드 (학생정보와 과목에 대한 점수(성적표처럼), 합계, 평균을 함께)
	// - map(과목, 점수) 데이터를 추가 메서드
	// - map(과목, 점수) 데이터를 삭제 메서드
	
	// 코딩작업시 가장 기본
	// 멤버변수는 private 설정 / 메서드 public
	// 클래스명은 대문자로 시작 / 변수명, 메서드명은 소문자로 시작
	// 변수면, 메서드명에 단어가 많아지면 다음 시작단어 대문자(카멜케이스 기법)
	// indent : 들여쓰기 잘 맞추기
	
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> map = new HashMap<>();
	private int sum;
	private double avg;
	
	public Student () {}
	
	public Student(String name) {
		this.name = name;
	}

	public Student(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public Student(String name, int age, String phone, HashMap<String, Integer> map, int sum, double avg) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.map = map;
		this.sum = sum;
		this.avg = avg;
	}
	
	public void print() { // 출력메서드 (학생정보와 과목에 대한 점수(성적표처럼), 합계, 평균을 함께)
		
		System.out.println("--- 학생 정보 ---");
		System.out.println("이럼 : " + name +" / 나이 : "+age+" / 전화번호 : " + phone);
		System.out.println("과목 : "+ map.keySet() + " > 점수 : " + map.values());
		if(map.size()>0) {
			addSum(map);
		}
	}
	
	// 수업 내용 (출력 메서드)
	public void printOne() { //학생 1명 정보 출력
		System.out.println(name+"("+age+") / ");
		if (phone !=null) {
			System.out.println(phone);
		}
		System.out.println();
		if (map.size()<=0) {
			System.out.println("점수가 없습니다.");
			return;
		}
		printSub();
		addSum(map);
		System.out.println("결과 :" +sum+"["+avg+"]");
		System.out.println("--------");
	}
	
	public void printSub() { // 과목의 성적표 출력 - map 출력
		for (String sub : map.keySet()) {
			System.out.println("--------");
			System.out.println("과목 : "+ sub+ " > 점수 : " + map.get(sub));
		}
		System.out.println("--------");
	}
	//----	
	public void addSum(HashMap<String, Integer> map) {
		
		this.sum = 0;
		this.avg = 0;
		for (String s : map.keySet()) {
			sum+=map.get(s);	
		}
		avg = (double)sum/map.size();
		System.out.println("총점 : " +sum + " / 평균 : " + (double)sum/map.size());
	}
	
//	public void addAvg(HashMap<String, Double>map) {
//		this.avg = 0;
//		
//		for (String s : map.keySet()) {
//			avg = sum/s;
//		}
//	}
	
	public void AddMap(String sub, int score) { //map(과목, 점수) 데이터를 추가 메서드
		map.put(sub, score);
	}
	
	public void DelMap(String sub) { // map(과목, 점수) 데이터를 삭제 메서드
		// 수업 추가 내용 
		if (map.remove(sub) == null) {
			System.out.println("해당 과목이 없습니다");
			return;
		}
		map.remove(sub);
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public double getAvg() {
		return avg;
	}


	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, avg, map, name, phone, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) // 주소가 내 객체의 주소와 같다면 true;
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) // 클래스 정보다 다르다면 false
			return false;// 여기까지는 기본적인 내용
		Student other = (Student) obj;
		return Objects.equals(name, other.name); // 이름만 일치하면 리턴(true)
	}
	
	
	
}
