package day13;

abstract class 추상클래스 {

	public static void main(String[] args) {
		/* 추상클래스 : 미완성 클래스 
		 * 추상메서드 : 메서드의 선언부만 있고, 구현은 없는 메서드
		 * 추상클래스 : 추상메서드 + 일반메서드 + 멤버변수 + 상수(final)...
		 * > 미완성 클래스이기 때문에 객체를 생성할 수 없다. 
		 * 키워드 : abstract
		 * ex) abstract 클래스명 / abstract 메서드명
		 * 
		 * abstract 리턴타입 메서드명(매개변수); >> 추상메서드
		 * - 추상클래스에서 abstract 키워드는 반드시 써야한(생략 불가능)
		 * - 인터페이스에서는 abstract 키워드생략 가능 (어차피 추상메서드만 존재하기 때문에)
		 * - 상속을 받아야 하는 부모 클래스를 작성할 경우
		 * - 특정 메서드가 자식들에게 자주 오버라이딩 되는 상황일 때 사용 
		 * - 상속받은 클래스에 추상메서드가 있다면 반드시 구현.
		 * 	 > 구현하지 않으면 추상 클래스가 됨
		 * */
		
		Dog1 d1 = new Dog1("뿌꾸", "개과");
		d1.printInfo();
		d1.howl();
		d1.Eatting("개껌");
		
		System.out.println();
		
		Cat1 c1 = new Cat1("계피", "고양이과");
		c1.printInfo();
		c1.howl();
		c1.Eatting("츄르");
	}

}

//추상클래스 : abstract
abstract class Animal1{
	public String name;
	public String category;
	
	public void printInfo() {
		System.out.println(name+"("+category+")");
	}
	
	abstract public void howl(); //추상메서드
	
}

class Dog1 extends Animal1{ //반드시 구현해야함 / 구현안하면 안댐...

	private String eat;
	
	public Dog1(String name, String category) {
		super.name = name;
		super.category = category;
	}
	
	@Override
	public void howl() {
		System.out.println(name+" 울음소리 > 알알!");
	} 
	
	public void Eatting(String eat) {
		this.eat = eat;
		System.out.println(name+"은 "+eat+"을 좋아합니다");
	}
	
}

class Cat1 extends Animal1{
	
	private String eat;
	
	public Cat1(String name, String category) {
		super.name = name;
		super.category = category;
	}
	@Override
	public void howl() {
		System.out.println(name+" 울음소리 > ㅁ미양!");
	}
	
	public void Eatting(String eat) {
		this.eat = eat;
		System.out.println(name+"은 "+eat+"를 좋아합니다.");
	}
	
}