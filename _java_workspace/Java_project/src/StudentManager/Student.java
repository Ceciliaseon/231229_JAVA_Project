package StudentManager;

/*
 * Student class : 한 학생의 정보를 저장하는 클래스
	- 학번, 이름, 나이, 전화번호, 주소, 수강과목s
	- 멤버변수, 생성자, getter/setter, toString
	- 멤버변수에 학생이 듣고자하는 과목을 저장 Subject []
	- 메서드
		- 학생정보 출력 메서드
		- 수강과목 추가 메서드
		- 수강과목 삭제 메서드
		- 수강과목 출력 메서드
*/
public class Student {

	private String name;
	private String birth;
	private String phone;
	private String address;
	private int age;
	
	private Subject [] course = new Subject[5]; // 수강과목
	private int cnt;
	
	public Student() {}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(String name, String birth, String phone) {
		this.name = name;
		this.birth = birth;
		this.phone = phone;
	}
	
	public Student(String name, String birth, String phone, String address, int age) {
		this(name, birth, phone);
		this.address = address;
		this.age = age;
	}
	
	public void printStudent() { // 학생정보 출력 메서드
		System.out.println("이름 : "+name + " / "+birth+" / "+phone);
	}
	
	public void insertCourse(String in) { // 수강정보 등록 메서드
		if(cnt >= 5) {
			System.out.println("더 이상 수강하실 수 없습니다.");
			return;
		}
		
		//리턴
		Subject sub = new Subject();
		sub.subSet(in);
		this.course[cnt] = sub;
		cnt++;
	}
	
	public void printCourse() { // 수강정보 출력 메서드
		if (course.length==0 || cnt ==0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for (int i=0;i<cnt;i++) {
			System.out.println("수강과목"+course[i]);
		}
	}
	
	public void deleteCourse(String subName) { // 수강과목 삭제 메서드

		int index = -1;
		if (subName == null) {
			return;
		}
		for (int i=0;i<cnt;i++) {
			if (course[i].getSubjectName().equals(subName)) {
				index = i;
				break;
			}
		}
		if (index ==-1) {
			System.out.println("해당과목이 없습니다. ");
		} 
		
		for (int j=index;j<cnt-1;j++) {
				course[j] = course[j+1];
		}
		course[cnt-1] = null;
		cnt--;
				
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Subject[] getCourse() {
		return course;
	}

	public void setCourse(Subject[] course) {
		this.course = course;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
