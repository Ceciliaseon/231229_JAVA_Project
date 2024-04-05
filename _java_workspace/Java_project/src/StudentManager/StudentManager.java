package StudentManager;

import java.util.Scanner;

public class StudentManager implements Program{
	
	private Student [] s = new Student[10];
	private int cnt;

	@Override
	public void insertStudent(Scanner sc) { // 학생등록 기능
		
		System.out.println("수강신청 학생 이름 > ");
		String name = sc.next();
		System.out.println("수강신청 학생 생일 > ");
		String birth = sc.next();
		System.out.println("수강신청 학생 전화번호 > ");
		String phone = sc.next();
		
		s[cnt] = new Student(name,birth,phone);
		cnt++;
		
		if (cnt == s.length) {
			Student [] tmp = new Student[s.length];
			for (int i =0;i<s.length;i++) {
				tmp[i] = s[i];
			}
			s = tmp;
		}
		
	}
	
	@Override
	public void printStudent() { // 학생리스트 출력 기능
		System.out.println("--학생정보--");			
		for (int i=0;i<cnt;i++) {
			s[i].printStudent();
		}
	}
	
	@Override
	public void serchStudent(Scanner sc) { // 학생검색 기능
		
		System.out.println("검색할 학생의 이름을 입력해주세요.");
		for (int i=0;i<cnt;i++) {
			if(s[i].getName().equals(sc.next())) { //
				System.out.println("--학생정보--");				
				s[i].printStudent();
				System.out.println("--수강정보--");
				s[i].printCourse();
				return;
			}
		}
	}

	@Override
	public void registerSubject(Scanner sc) { //수강신청 기능
			
		System.out.println("수강신청 학생 이름 >");
		String name = sc.next();
		//
		int index = -1;
		
		for (int i=0;i<cnt;i++) {
			if (name.equals(s[i].getName())) {
				index = i;
				break;
			}
		}
		
		if (index == -1) {
			System.out.println("학생 정보가 없습니다.");
			return;
		}
		//
		System.out.println("과목 > ");
		String subjetName = sc.next();
		for(int i=0;i<cnt;i++) {
			s[i].insertCourse(subjetName);
			System.out.println(subjetName + " 과목이 수강신청 되었습니다.");
			break;
		}
	}

	@Override
	public void deleteSubject(Scanner sc) { //수강철회 기능
		
		System.out.println("수강 삭제할 학생 이름 > ");
		String serchName = sc.next();
		int index = -1;
		
		for (int i=0;i<cnt;i++) {
			if (s[i].getCourse().equals(serchName)) {
				index = i;
				break;
			}
		}
		
		System.out.println("취소할 과목 > ");
		String name = sc.next();
		for(int i=0;i<cnt;i++) {
			s[i].deleteCourse(name);
			System.out.println(name + " 과목이 수강 취소 되었습니다.");
			break;
		}
	}
}
