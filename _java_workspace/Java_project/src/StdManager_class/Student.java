package StdManager_class;

import java.util.Arrays;

public class Student {
	/*
	Student class : 한 학생의 정보를 저장하는 클래스
	- 학번, 이름, 나이, 전화번호, 주소, 수강과목s
	- 멤버변수, 생성자, getter/setter, toString
	- 멤버변수에 학생이 듣고자하는 과목을 저장 Subject [ ]
	- 메서드
		- 학생정보 출력 메서드
		- 수강과목 추가 메서드
		- 수강과목 삭제 메서드
		- 수강과목 출력 메서드
		
		int > 정수형 숫자 > 연산이 필요한 자료 
		주기적으로 업데이트가 되는 값 (나이)은 int로 받는 것이 맞지만
		학번, 전화번호, 우편번호 등 정보를 제공하는 숫자들의 경우에는 String으로 받는 것이 용이하다
	*/
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Subject[] subjectList = new Subject[5];
	private int cnt; //subject 배열의 index
	
	//생성자
	public Student() {}

	public Student(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}

	/* 메서드 */
	// 학생정보를 출력하는 메서드 (toString으로 사용 가능)
	public void stdPrint() {
//		System.out.println("--학생정보--");
		System.out.println("학생명:"+stdName+"("+stdNum+") / "+stdPhone);
	}
	// 수강과목 출력 메서드 > 배열로 여러개 존재하는 형태 (for)
	public void subPrint() {
		// Subject 클래스의 toString 호출 > 출력
		if (cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return;
		}
		// toString은 객체의 내용이 문자로 리턴 sysout(객체) > toString 호출
		for (int i=0;i<cnt;i++) {
			System.out.println(subjectList[i]); // toString 호출
		}
	}
	// 수강과목 추가 메서드 
	// 매개변수 : 수강과목 객체 Subject subjectList 배열에 해당 객체 담기
	public void insertSubject(Subject sub) {
		// 배열이 다 찼을때, 배열 늘려주기
		// 배열은 길이를 정하면 변경불가능
		// 배열을 늘려줄때는 더 긴 길이의 배열을 생성하여 배열 복사 후 배열 바꾸기
		if(cnt ==subjectList.length) { // 배열이 꽉 참
			Subject[] tmp = new Subject[subjectList.length+5];
			// 배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList = tmp; // 5칸 배열은 날아가고 tmp 배열이 subjectList가 됨(!0칸)
		}
		
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt]=sub;
		cnt++;
	}
	
	// 수강과목 삭제 메서드 (subject 삭제)
	public void deleteSubject(String subName) {
		// 수강과목에 대한 배열에서 subName을 검색하여 삭제
		int index = -1;
		if (subName == null) {
			return;
		}
		for(int i=0;i<cnt;i++) { // 위치 찾는 과정
			if (subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("찾은 과목이 없습니다.");
			return;
		}
		
		// 삭제 : 찾은 위치 부터 뒷번지를 앞번지로 옮기는 작업
		for (int i=index;i<cnt-1;i++) {
			subjectList[i] = subjectList[i+1];
		}
		// 끝번지 null 처리
		subjectList[cnt-1] = null;
		// 한과목 삭제 과목 개수가 줄어듦
		cnt--;
		
	}
	
	
	public String getStdNum() {
		return stdNum;
	}

	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdPhone() {
		return stdPhone;
	}

	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}

	public Subject[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject[] subjectList) {
		this.subjectList = subjectList;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	@Override
	public String toString() {
		return "Student [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + "]";
	}
	
	
	
	
}
