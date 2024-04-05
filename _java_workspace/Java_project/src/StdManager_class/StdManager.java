package StdManager_class;

import java.util.Scanner;

public class StdManager implements Program {
	
	// 학생의 배열을 멤버변수로 추가
	private Student [] studentList = new Student[5];
	// index 처리 변수 
	private int stdCnt;
	
	
	@Override
	public void printStudent() {
		System.out.println("------전체 학생 정보-");
		for (int i=0;i<stdCnt;i++) {
			studentList[i].stdPrint(); // 학생정보 출력
		}
	}

	@Override
	public void insertStudent(Scanner sc) {
		// 1명의 학생정보를 입력방아서 객체를 생성한 후 studentList에 추가
		
		System.out.println("학번 > ");
		String stdNum = sc.next();
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("전화번호 > ");
		String phone = sc.next();
		
		// 입력받은 값을 객체로 생성(Student)
		Student s = new Student(stdNum, name, phone);
		
		// 배열이 다 찼을 경우 배열 복사
		if (stdCnt == studentList.length) {
			Student[] tmp = new Student [studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		studentList[stdCnt] = s;
		stdCnt++;
		
	}

	@Override
	public void serchStudent(Scanner sc) {
		// 검색할 학생 이름을 입력받아 배열에서 탐색 후 있다면
		// 학생 정보 + 수강정보 출력
		System.out.println("검색할 학생명 >");
		String serchName = sc.next();
		for (int i=0;i<stdCnt;i++) {
			if (serchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner sc) {
		// 누가 / 무슨과목을 추가할지 설정
		// 수강 신청할 학생 이름을 입력받아 
		System.out.println("수강신청 학생명 >");
		String name = sc.next();
		int index = -1; // 학생의 번지를 저장하기 위한 변수
		//학생의 위치를 탐색 후 
		for (int i=0;i<stdCnt;i++) {
			if (name.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		// 학생이 없다면
		if (index == -1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		// 그 학생의 배열에 수강과목[]을 추가
		// 수강과목에 객체를 생성
		System.out.println("수강과목 > ");
		String sName = sc.next();
		Subject s = new Subject(sName);
		// Student 클래스(수강 신청을 한 학생)의 insertSubject 호출(해당 배열에 추가)
		studentList[index].insertSubject(s);
		
		
		
	}

	@Override
	public void deleteSubject(Scanner sc) {
		// 누가 / 어떤 과목을 철회할건지 deleteSubject()를 호출해서 사용
		// 수강 삭제할 학생 이름을 입력받아 
				System.out.println("수강 삭제 할 학생명 >");
				String name = sc.next();
				int index = -1; // 학생의 번지를 저장하기 위한 변수
				//학생의 위치를 탐색 후 
				for (int i=0;i<stdCnt;i++) {
					if (name.equals(studentList[i].getStdName())) {
						index = i;
						break;
					}
				}
				// 학생이 없다면
				if (index == -1) {
					System.out.println("학생 정보가 없습니다.");
					return;
				}
				// 그 학생의 배열에 수강과목[]을 추가
				// 수강과목에 객체를 생성
				System.out.println("수강 삭제 과목 > ");
				String sName = sc.next();
				// 해당 학생의 수강 삭제 메서드 호출
				studentList[index].deleteSubject(sName);
	}
	

}
