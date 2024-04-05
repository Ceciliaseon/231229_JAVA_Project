package day13;

class Animal{
	private String name; // 이름
	private String category; // 종
	
	public Animal() {}
	
	public Animal(String name, String category) {
		this.name = name;
		this.category = category;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("종류 : "+category);
	}
	// 울음소리메서드
	public void howl() {
		System.out.println("> "+name+"의 울음소리");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
}

// Dog / Cat

class Dog extends Animal{
	// 자식의 생성자에서 상속받은 멤버변수를 setting
	public Dog () {
		setName("후추");
		setCategory("개과");
	}
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("멍멍");
	}
	
}

class Cat extends Animal{
	public Cat (String name, String category) {
		super.setName(name);
		super.setCategory(category);
	}
	@Override
	public void howl() {
		// TODO Auto-generated method stub
		super.howl();
		System.out.println("야옹~");
	}
	
}

class Tiger extends Animal{
	public Tiger(String name, String category) {
		//super 생성자 호출
		super(name, category);
	}
	
	public void howl() {
		super.howl();
		System.out.println("어흥!!");
	}
}

public class 상속02 {

	public static void main(String[] args) {
		
		/* 오버라이딩 : 부모클래스에게서 물려받은 메서드를 재정의 하는 것
		 * - 부모 클래스의 메서드와 선언부가 일치해야 한다.
		 * - 접근제한자도 더 넓은 범위는 가능, 축소되는 것은 안됨
		 * 
		 * */
		
		Dog dog = new Dog();
//		dog.setName("후추");
//		dog.setCategory("강아지");
		dog.printInfo();
		dog.howl();

		System.out.println();
		Cat cat = new Cat("계피", "고양이과");
//		cat.setName("계피");
//		cat.setCategory("고양이");
		cat.printInfo();
		cat.howl();
		
		System.out.println();
		Tiger tg = new Tiger("어흥이", "고양이과");
		tg.printInfo();
		tg.howl();
	}

}
