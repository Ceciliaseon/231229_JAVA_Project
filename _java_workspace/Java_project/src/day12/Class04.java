package day12;

public class Class04 {
	/* static
	 * static이 붙은 메서드/멤버변수 > 클래스 멤버변수/메서드라고 한다.
	 * - 객체의 생성 없이 클래스가 만들어지면 생성
	 * - 객체가 없이 클래스만으로 사용 가능
	 * - 클래스명.메서드 / 클래스명.멤버변수
	 * - 객체를 생성해서 호출도 가능하지만, 그렇게 사용하지 않음
	 * - 클래스의 멤버변수/메서드를 쓰는 이유
	 * ㄴ 하나의 멤버변수가 모든 객체에 공유(사용) 할때 사용
	 * 
	 * static이 안붙은 메서드/멤버변수 > 객체(인스턴스)의 멤버변수/메서드라고 한다.
	 * - 객체의 멤버변수/메서드는 객체를 통해 사용되고, 생성이 된다.
	 * ㄴ 객체를 만들지 않으면 생성이 안됨
	 * - 객체명.메서드 / 객체명.멤버변수 형태로 사용
	 * - 각 객체마다 독립적인 객체 > 각객체마다 독립적인 멤버변수, 메서드를 생성
	 * 
	 * - 클래스와 객체는 생성 시점이 다름 > 메서드를 사용할 수 있는 환경이 다름
	 * - 객체의 멤버는 클래스가 생성되고 난 후 객체를 생성할 수 있음.
	 * - 클래스 멤버는 클래스의 멤버(변수/메서드) 안에서만 사용가능
	 *   / 객체의 멤버(변수/메서드)에서 모두 사용될 수 있다.
	 *   but, 객체의 멤버는 객체에서만 사용될 수 있다.
	 * - 클래스 먼저 / 객체 나중
	 * */
	
	public static void main(String[] args) {

		
		// 클래스 멤버에 접근하는 방식
		// 현시점에서 BRAND는 이미 생성되어 있는(객체가 없어도 생성)
//		System.out.println(Tv.BRAND); // private 은 접근 권한이 없음
		Tv.printBrand(); //클래스메서드 사용 > 클래스명.메서드명();
		
		Tv t = new Tv(); // 객체 생성 시점에 객체 멤버들이 생성
		t.printPower(); // 객체메서드 사용 > 객체명.메서드명();
		// t.printBrand(); // 객체를 통해 사용할 수 있지만 그렇게 사용하지 않음 
		/*The static method printBrand() from the type 
		  Tv should be accessed in a static way*/
		
	}

}

class Tv{
	private boolean power;
	private final static String BRAND = "LG";
	
	// power를 출력하는 메서드
	public void printPower() { //객체의 메서드
		if(power) {
			System.out.println("Tv가 켜졌습니다.");
		} else {
			System.out.println("TV가 꺼졌습니다.");
		}
		//객체메서드에서 클래스 변수를 사용할 수 있음  (공용)
		// 클래서의 멤버는 어디서든 사용 가능
		System.out.println("brand : "+ BRAND);
	}
	
	// 클래스 메서드
	public static void printBrand() { // 객체가 없어도 클래스로 바로 접근 할 수 있음 
		System.out.println("Tv Brand : " + BRAND);
		// 클래스 메서드에서 객체 변수를 사용
//		System.out.println("power : "+ power);
		// 클래스 입장에서는 객체가 생성될지 안될지 알 수 없기 때문에 객체의 변수를 사용할 수 없음
		
	}
}