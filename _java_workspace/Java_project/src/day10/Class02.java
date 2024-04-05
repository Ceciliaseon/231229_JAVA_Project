package day10;

public class Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.setName("k3");
		c.setColor("black");
		c.setYear("2023");
		c.print();
		c.power();
		System.out.println("my Car Power : "+ (c.isPower()?"On":"Off"));
		c.power();
		System.out.println("my Car Power : "+ (c.isPower()?"On":"Off"));
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		System.out.println("my Car Power : "+ c.getSpeed());
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();c.speedDown();c.speedDown();c.speedDown();c.speedDown();c.speedDown();
		System.out.println("my Car Power : "+ c.getSpeed());
		
		
		Car c2 = new Car();
		c2.setName("그랜저");
		c2.setColor("gray");
		c2.setYear("2024");
		c2.print();
		c2.power();
		System.out.println("Car2 Power : "+ (c2.isPower()?"On":"Off"));
		c2.power();
		System.out.println("Car2 Power : "+ (c2.isPower()?"On":"Off"));
		System.out.println("Car2 speed : "+ c2.getSpeed());
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		c2.speedUp();
		System.out.println("Car2 speed : "+ c2.getSpeed());
		
	}

}


class Car { //클래스명 > 대문자로 시작
	//멤버변수 > private
	//method > public > getter / setter 메서드
	
	private String name; // 이름
	private String color; // 색상
	private String year; // 연식
	private boolean power;
	private int speed;
	
	// power()
	// 꺼져있을 떄 시동 버튼 > 켜짐
	// 켜져있을 때 시동 버튼 > 꺼짐
	
	public void power() {
		power = !power;
	}
	
	// speedUp()
	public void speedUp() {
		if (speed < 300) {
			speed += 10;
		}
	}
	
	// speedDown()
	public void speedDown() {
		if (speed <=  0) {
			speed = 0;
		} else {
			speed -= 10;
		}
	}
	// print()
	public void print() {
		System.out.println("myCar : "+name+"/"+color+"("+year+")");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}