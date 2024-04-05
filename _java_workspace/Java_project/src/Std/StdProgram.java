package Std;

import java.util.Scanner;

public interface StdProgram {

	void printStd(); // 학생정보 출력
	void addStd(Scanner sc); // 학생추가
	void modStd(Scanner sc); // 학생정보 수정
	void delStd(Scanner sc); // 학생삭제
	void searchStd(Scanner sc); // 학생검색
	
	void addSub(Scanner sc); // 점수 추가
	void modSub(Scanner sc); // 점수 수정
	void delSub(Scanner sc); // 점수 삭제
	
}
