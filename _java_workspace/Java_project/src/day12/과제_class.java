package day12;

public class 과제_class {

	public static void main(String[] args) {

		Student2 st = new Student2("홍길동","981102", "010-1111-1111", 26, "서울");
		st.insertCourse("java", "3개월");
		st.insertCourse("html", "1개월");
		
		Student2 st1 = new Student2("별1", "990111", "010-111-1111",28, "incheon");
		st1.insertCourse("java", "5개월");
		st1.insertCourse("html", "1개월");
		
		Student2 st2 = new Student2("별2", "971123", "010-2222-3333", 25, "incheon");
		st2.insertCourse("java", "5개월");
		st2.insertCourse("빅데이터", "3개월");
		st2.insertCourse("파이썬", "2개월");
		st2.insertCourse("C언어", "6개월");
		st2.insertCourse("풀스텍", "5개월");
		
		Student2 st3 = new Student2("별3", "951123", "010-3333-2222", 29, "incheon");
		st3.insertCourse("java", "5개월");
		st3.insertCourse("html", "1개월");		
		
		Student2 st4 = new Student2("별4", "931023", "010-4444-4444", 32, "incheon");
		
		Student2 st5 = new Student2("별5", "980923", "010-5555-5555", 25, "incheon");
		st5.insertCourse("C언어", "6개월");
		
		Student2 st6 = new Student2("별6", "001123", "010-6666-6666", 25, "incheon");
		st6.insertCourse("빅데이터", "3개월");
		st6.insertCourse("풀스텍", "5개월");
		
		Student2 st7 = new Student2("별7", "061123", "010-7777-7777", 19, "incheon");
		
		Student2 [] std = new Student2[8];
		std [0] = st;
		std [1] = st1;
		std [2] = st2;
		std [3] = st3;
		std [4] = st4;
		std [5] = st5;
		std [6] = st6;
		std [7] = st7;
		
		String searchName = "별3";
		//별3 학생의 학생정보, 학원정보, 수강정보를 출력
		System.out.println(searchName +"님의 검색정보 -------");
		for (int i=0;i<std.length;i++) {
			if (std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompny();
				std[i].printCourse();
			}
		}
		
		System.out.println("--------");
		// 인천지점의 학생들을 모두 검색하여 학생정보만 출력
		for (int i=0;i<std.length;i++) {
			if (std[i].getBranch().equals("incheon")) {
				std[i].printInfo();
			}
		}
		System.out.println("--------");

		// java과목을 수강하는 학생들만 검색하여 학생정보, 학원정보 출력
		String searchCourse = "java";
		System.out.println(searchCourse+"의 수강정보");
		int cnt = 0;
		while(cnt < std.length) {
			for (int i=0;i<std[cnt].getCourse().length;i++) {
				if (std[cnt].getCourse()[i] != null) {
					if (searchCourse.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompny();
						std[cnt].printInfo();
						std[cnt].printCourse();						
					}
				}
			}
			cnt++;
		}
		
	}
}

class Student2{
	private String name;
	private String birth;
	private String phone;
	private int age;
	private final static String COMPANY = "EZEN";
	private String branch; //지점
	
	//같은 번지에 있는 수강과목과 기간 > 같은 값으로 처리 
	//각각 배열을 만들어서 처리
	private String [] course = new String[5]; // 수강과목
	private String [] period = new String[5]; // 기간
	private int cnt; // 배열의 index 처리용 번지
	
	
	// 생성자
	public Student2() {}
	
	public Student2(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public Student2(String name, String birth, String phone, int age, String branch) {
		this(name, phone, branch);
		this.birth = birth;
		this.age = age;
	}
	// 메서드
	public void printInfo() {
		System.out.println("-- 학생 정보 --");
		System.out.println("이름:"+name+"("+age+"세 "+birth +") / "+phone);
	}
	
	public void printCompny() {
		System.out.println("== 학원정보 ==");
		System.out.println("학원명:"+COMPANY+" / "+branch+"지점");
	}

	// 수강정보출력
	public void printCourse() {
		// cnt 까지만 출력 >> 추가되지 않은 값은 출력x
		if (course.length == 0 || cnt == 0) { // 등록한 과목이 없음
			System.out.println("수강과목이 없습니다.");
			return;
		}
		for (int i=0;i<cnt;i++) {
			System.out.println("과정:"+course[i]+"("+period[i]+")");
		}
	}
	
	
	// 수강정보 등록
	// isertCourse()
	// 매개변수 course, period 주고 > 배열에 추가 (배열을 완성 / 리턴되는 값은 없음)
	public void insertCourse(String course, String period) {
		// cnt == 0 > 아직 추가값이 없음.
		if (cnt >=5) {
			// 배열을 더 늘려 더 많은 수강을 받을 수도 있음 (배열 복사)
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getMonth() {
		return period;
	}

	public void setMonth(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
	
}