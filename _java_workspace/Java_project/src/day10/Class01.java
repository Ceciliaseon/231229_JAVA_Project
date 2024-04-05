package day10;

public class Class01 {
	
	/* 클래스의 구성요소 : 멤버변수, 메서드
	 * 형태 : 멤버변수 먼저, 메서드가 뒤에 선언
	 * 
	 * 클래스 - 설계도
	 * 객체 - 제품, 프로그램 ...
	 * 메서드 - 기능 
	 * 
	 * 멤버변수 : 속성, 정보
	 * 메서드 : 기능을 할 수 있게 나타나주는 것 
	 * 
	 * 프린트 클래스
	 * - 속성(멤버변수) : 크기(사이즈), 색, 제조사, 제품명, 종류
	 * - 기능(메서드) : 인쇄, 복사, 스캔, 팩스
	 * 
	 * 멤버변수는 클래스 안 가장 위쪽에 작성 / 메서드는 멤버변수 뒤에 선언
	 * 멤버변수는 클래스 안에서 사용 가능 / 모든 메서드에서 공통적으로 사용가능
	 * 
	 * - 객체 선언 
	 * 클래스명 객체명; // 선언만 (기본적인 값은 null;)
	 * 객체명 = new 클래스명(); // 선언한 객체에 초기값 설정
	 * 
	 * - 객체 선언(초기화 생성)
	 * 클래스명 객체명 = new 클래스명();
	 * 
	 * - 메서드 사용법 (클래스가 다른 메서드를 호출할 경우)
	 * 객체 선언 후 객체명.메서드명();
	 * 
	 * - 같은 클래스안에서 메서드를 호출할 경우 > 메서드명();
	 * - 다름 클래스안에서 메서드를 호출할 경우 > 객체명.메서드명();
	 * 
	 * 접근 제한자 (제어자)
	 * - public : 모두 사용가능
	 * - protected : 나 + 패키지 + 자식클래스 (상속할 때 주로 사용함)
	 * - (default) : 나 + 패키지 
	 * - private : 나 (다른 사람들은 접근 불가능)
	 * 
	 * private < default < protected < public
	 * 
	 * - 클래스에서 public을 붙일 수 있는 것은 >> 파일명 == 클래스명 일경우만 가능 **
	 * - 하나의 java 파일 안에 하나의 클래스만 있을 수 있는 것은 아님
	 * - 멤버변수와 멤버 메서드 public 붙여도 문제 없음 
	 * - 일반적으로 멤버변수는 private으로 선언 / 메서드는 public으로 선언
	 * - private : 다른 클래스에서 접근(사용)할 수 없음 >> 데이터를 보호하기 위해
	 * - private으로 선언된 멤버변수는 getter / setter 메서드를 만들어서
	 *   해당 변수에 접근할 수 있도록 함
	 *   
	 * */
	public static void main(String[] args) {
		Point p = new Point(); // p객체 생성
		p.print();
		// 멤버변수가 private 선언이 되어 직접 접근이 불가능
//		p.x = 10; 
//		p.y = 9; 
		p.setX(1);
		p.setY(2);
		p.print();
		// 메서드로 접근해서 매개변수로 지정한 값은 가능
		p.save(19, 1);
		p.print();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		// x+y > x 값으로 설정 (set) > x 값 출력
		p.setX(p.getX()+p.getY());
		System.out.println(p.getX());
		
		p.setY(50);
		p.print();
		
	}
}
//다른 클래스 생성시 클래스 밖에서 생성
// (1,0) (x,y) 좌표값을 출력하는 클래스
class Point {
	// 멤버변수 위치
	// 멤버변수는 초기값을 설정하지 않아도 자동으로 설정
	// int > 0 / String > null (초기 설정값)
	private int x;
	private int y;
	
	public void print() {
		System.out.println("("+x+","+y+")");
	}
	
	//포인트 값을 저장하는 메서드
	public void save(int x, int y) {
		this.x = x; //this > 멤버변수를 지칭하는 키워드
		this.y = y;
	}
	
	// getter (데이터를 가져오는 메서드)
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// setter (데이터를 변경하는 메서드)
	public void setX(int x) {
		this.x=x;
	}
	public void setY(int y) {
		this.y=y;
	}

	
	
}
