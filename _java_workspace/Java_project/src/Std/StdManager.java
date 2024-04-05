package Std;

import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StdManager implements StdProgram {
	
	private ArrayList <Student> list = new ArrayList<Student>();
	
	public void add() {
		list.add(new Student("홍길동"));
		list.add(new Student("김영이"));
		list.add(new Student("이순신"));
		list.add(new Student("강감찬"));
		list.add(new Student("박순이"));
	}
	@Override
	public void printStd() { // 학생정보 출력

		for (int i =0;i<list.size();i++) {
			list.get(i).print();
			System.out.println();
		}	
	}

	@Override
	public void addStd(Scanner sc) { // 학생추가
		
		System.out.println("--- 학생 정보 추가 ---");
		System.out.println("이름 > ");
		String name = sc.next();
		System.out.println("나이 > ");
		int age = sc.nextInt();
		System.out.println("전화번호 > ");
		String phone = sc.next();
		
		Student s = new Student(name, age, phone);
		list.add(s);
		
	}

	@Override
	public void modStd(Scanner sc) { // 학생정보 수정
	
		System.out.println("수정할 학생 검색 > ");
		String Stdname = sc.next();
		
		for (int i=0;i<list.size();i++) {
			if (Stdname.equals(list.get(i).getName())) {
				// 수업내용
				System.out.println("이름, 나이, 전화번호 중 1 선택");
				String op = sc.next();
				System.out.println("수정 할 정보 입력");
				switch (op) {
				case "이름" :
					String name = sc.next();
					list.get(i).setName(name);
					System.out.println("이름 수정 완료");
					break;
				case "나이" :
					int age = sc.nextInt();
					list.get(i).setAge(age);
					System.out.println("나이 수정 완료");
					break;
				case "전화번호" :
					String phone = sc.next();
					list.get(i).setPhone(phone);
					System.out.println("전화번호 수정 완료");
					break;
				default : System.out.println("정보가 존재하지 않습니다."); break;
				}
//				System.out.println("이름 수정 > ");
//				String modName = sc.next();
//				System.out.println("나이 수정 > ");
//				int modAge = sc.nextInt();
//				System.out.println("전화번호 수정 > ");
//				String modPhone = sc.next();
//				
//				list.remove(i);
//				
//				Student s = new Student(modName, modAge, modPhone);
//				list.add(s);
//				System.out.println(Stdname +" 학생 정보 수정완료");
//				return;
			}
		} System.out.println("학생 정보가 없습니다.");		
	}
	

	@Override
	public void delStd(Scanner sc) { // 학생삭제
		
		System.out.println("정보를 삭제할 학생 명");
		String delName = sc.next();
		
		for (int i=0;i<list.size();i++) {
			if (delName.equals(list.get(i).getName())) {
				list.remove(list.get(i));
				System.out.println(delName+" 학생 정보 삭제 완료");
				return;
			}
		}System.out.println("학생 정보가 없습니다.");
		
		// 수업내용
//		boolean result = list.remove(new Student(delName));
//		if (!result) {
//			System.out.println("학생이 없습니다.");
//			return;
//		}
//		System.out.println("학생 삭제 완료!");
		
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void searchStd(Scanner sc) { // 학생검색
		
		System.out.println("검색할 학생명 >");
		String serchName = sc.next();

		for (int i=0;i<list.size();i++) {
			if (serchName.equals(list.get(i).getName())) {
				list.get(i).print();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
		
		
	}

	@Override
	public void addSub(Scanner sc) { // 점수 추가
		
		System.out.println("점수 추가할 학생 > ");
		String socreName = sc.next();
		
		for (int i=0;i<list.size();i++) {
			if (socreName.equals(list.get(i).getName())){
				
				System.out.println("점수 추가할 과목 > ");
				String addSub = sc.next();
				
				System.out.println("점수 입력 > ");
				int addScore = sc.nextInt();
				if(addScore > 100 || addScore < 0) {
					System.out.println("점수 오류, 다시 입력 > ");
					addScore = sc.nextInt();
				}
				list.get(i).AddMap(addSub, addScore);
				return;
			}
		}
		System.out.println("점수를 추가할 학생이 없습니다.");

		
	}

	@Override
	public void modSub(Scanner sc) { // 점수 수정
		
		System.out.println("점수 수정할 학생 > ");
		String modSdName = sc.next();
		
		for (int i=0;i<list.size();i++) {
			if (modSdName.equals(list.get(i).getName())) {
				System.out.println("수정할 과목 > ");
				String modSub = sc.next();
				System.out.println("점수 수정 > ");
				int modScore = sc.nextInt();
				
				if(modScore > 100 || modScore < 0) {
					System.out.println("숫자를 잘못 입력하였습니다.");
				}
				
				list.get(i).AddMap(modSub, modScore);
				
//				HashMap<String, Integer> map = null;
//				HashMap<String,Integet> m = new Student();
//				list.add(s);
				System.out.println(modSub +" 점수 수정완료");
				return;
			}
		} System.out.println("수정할 학생 정보가 없습니다.");		

		
		
		
	}

	@Override
	public void delSub(Scanner sc) { // 점수 삭제
		
		System.out.println("점수 삭제 할 학생 > ");
		String delSdName = sc.next();
		
		for (int i=0;i<list.size();i++) {
			if (delSdName.equals(list.get(i).getName())) {
				System.out.println("점수 삭제할 과목 > ");
				String delSub = sc.next();
				list.get(i).DelMap(delSub);
				System.out.println(delSub +" 점수 삭제완료");
				return;
			}
		} System.out.println("점수를 삭제 할 학생 정보가 없습니다.");	
		
	}
	
	
//	for (int i=0;i<list.size();i++) {
//		if (delName.equals(list.get(i).getName())) {
//			list.remove(list.get(i));
//			System.out.println(delName+" 학생 정보 삭제 완료");
//		}
//	}
//	
	// 학생 리스트 생성 후 Program에 있는 메서드 구현
	
}
