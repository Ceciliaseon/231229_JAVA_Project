package StudentManager;
/*Subject class : 하나의 수강과목 정보를 저장하는 클래스
	- 과목코드, 과목명, 학점, 시수, 교수명, 학기, 강의실, 시간표
	- 멤버변수, 생성자, getter/setter, toString
*/
public class Subject {	
	
	private int subjectcode;
	private String subjectName;
	private String subject; //학점
	private String name;
	private String group;
	
	public Subject() {}
	
	public Subject (String subjectName) {
		this.subjectName = subjectName;
	}
	public Subject(int subjectcode, String subjectName) {
		this.subjectcode = subjectcode;
		this.subjectName = subjectName;
	}
	
	public Subject(int subjectcode, String subjectName, String subject, String name, String group) {
		this.subjectcode = subjectcode;
		this.subjectName = subjectName;
		this.subject = subject;
		this.name = name;
		this.group = group;
	}
	
	@Override
	public String toString() {
		return "코드 : " + subjectcode + " / 과목명 = " + subjectName + " / 학점 = " + subject
				+ " / 교수명 = " + name + " / 강의실 = " + group + "강의실";
	}
	
	public void subSet(String Name) {
		
		switch (Name) {
		case "java" : 
			subjectcode = 11;
			subjectName = "java";
			name = "오미란";
			subject = "3학점";
			group = "1";
			break;
		case "빅데이터" : 
			subjectcode = 12;
			subjectName = "빅데이터";
			name = "홍길동";
			subject = "4학점";
			group = "3";
			break;
		case "HTML" : 
			subjectcode = 13;
			subjectName = "HTML";
			name = "김철수";
			subject = "2학점";
			group = "2";
			break;
		case "c++" : 
			subjectcode = 14;
			subjectName = "C++";
			name = "김영희";
			subject = "4학점";
			group = "1";
			break;
		case "파이썬" : 
			subjectcode = 15;
			subjectName = "피아썬";
			name = "김말순";
			subject = "3학점";
			group = "3";
			break;
		}
	}
	
	public int getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(int subjectcode) {
		this.subjectcode = subjectcode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgroup() {
		return group;
	}

	public void setClass(String group) {
		this.group = group;
	}
	
	
}
