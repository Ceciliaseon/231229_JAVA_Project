package StdManager_class;

import java.util.Scanner;

public interface Program {
	/*
	- 학생리스트 출력 기능 : void printStudent();
	- 학생등록 기능 : void insertStudent(Scanner sc);
	- 학생검색 기능 : void serchStudent(Scanner sc);
	- 수강신청 기능 : void registerSubject(Scanner sc);
	- 수강철회 기능 : void deleteSubject(Scanner sc);
	 */
	
	void printStudent();
	void insertStudent(Scanner sc);
	void serchStudent(Scanner sc);
	void registerSubject(Scanner sc);
	void deleteSubject(Scanner sc);
	
}
