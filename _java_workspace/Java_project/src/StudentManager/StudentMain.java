package StudentManager;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
//		Subject sb = new Subject(23022, "java", "A+", "오미란", "C");
//		System.out.println(sb.toString());
//		
//		Student st = new Student("별1", "000101", "010-1111-1111", "인천", 20);
//		st.printStudent();
//		st.insertCourse(new Subject(230222, "java"));
//		st.insertCourse(new Subject(230222, "빅데이터"));
//		st.insertCourse(new Subject(230222, "java"));
//		st.insertCourse(new Subject(230222, "java"));
//		st.insertCourse(new Subject(230222, "java"));
//		st.printCourse();
		Scanner scan = new Scanner (System.in); 
		StudentManager sm = new StudentManager();
		int menu = 0;
		do {
			System.out.println("menu");
			System.out.println("1. 학생등록 | 2. 학생리스트 | 3. 학생검색(학생정보, 수강정보) \r\n"
					+ "4. 수강신청 | 5. 수강철회 | 6. 종료");
			System.out.println("menu 선택 >>");
			menu = scan.nextInt();
			switch (menu) {
				case 1 : 
					sm.insertStudent(scan);
					break;
				case 2 :
					sm.printStudent();
					break;
				case 3 :
					sm.serchStudent(scan);
					break;
				case 4 :
					sm.registerSubject(scan);
					break;
				case 5 :
					sm.deleteSubject(scan);
					break;
				case 6 :
					break;
				default :
					System.out.println("menu를 잘못 선택하였습니다.");
			}
		} while (menu!=6);
		System.out.println("프로그램 종료");
		
		
	}

}
