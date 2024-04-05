package day10;

public class Class03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Car1 클래스를 통해 c객체를 생성하는데
		// new라는 키워드를 통해 Car1()이라는 생성자에 의해 초기화 되는 것
		Car1 c = new Car1 (); 
		c.setName("캐스퍼");
		c.setColor("화이트");
		c.setYear("2024");
		c.setDoor(4);
		c.print();
		c.speedUp();
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		c.speedDown();
		
		Car1 c2 = new Car1("카니발", "2023");
		c2.print();
		Car1 c3 = new Car1("k5", "블랙", "2024", 4);
		c3.print();
	}

}

// 같은 패키지에서 같은 이름의 클래스를 사용하면 error
class Car1 {
	//멤버변수 : name, year, color, door(문), power, speed
	
	private String name;
	private String color;
	private String year;
	private int door;
	private boolean doorrack;
	private boolean power;
	private int speed;

	// 생성자 위치
	public Car1() {
		// 기본 생성자
	}
	// 생성자는 여러개 만들 수 있음 (생성자 오버로딩)
	// 오버로딩의 조건 : 매개변수의 개수가 달라야 함, (개수가 같다면) 타입이 달라야함
	public Car1(String name, String year, String color, int door) {
		this(name,year); // 생성자 중 두 매개변수만 받는 생성자가 있다면 이와 같은 형태로 호출 (생성자 호출)
		this.color = color;
		this.door = door;
	}
	public Car1(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	// 내 차량의 정보를 출력하는 메서드(name, year, color, door) > print
	public void print () {
		System.out.println("New Car : "+name+" / "+color+" / ("+year+") / 문 "+door+"개" );
	}
	// power() : on / off
	// on > 시동이 켜졌습니다. 라고 출력
	// off > 시동이 꺼졌습니다. 라고 출력
	// speed 값이 있을 경우에는 속도를 줄여주세요. 라는 안내멘트
	
	public void power()	{
		this.power = !power;
		if (this.power && speed<=0) {
			System.out.println("시동이 켜졌습니다.");
		} else if (power && speed > 0) {
			System.out.println("주행중입니다.");
		} else if (!power && speed > 0) {
			System.out.println("주행 중 시동을 끌 수 없습니다.");
		} else {
			System.out.println("시동을 끕니다.");
			this.power=!power;
		}
	}
	
	// speedUp & Down 기본 조건 > power가 켜져야 가능
	// 시동이 꺼져있는 상태라면, (시동이 꺼져있습니다. 시동을 켜주세요.) 라고 출력
	// speedUp()
	// 300이상이면 최고속도입니다. 라고 출력 
	// 현재 속도를 출력
	public void speedUp() {
		if ((power?true:false) == false) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		} else {
			if (speed >=300) {
				speed = 300;
				System.out.println("최고속도입니다. 속도를 줄여주세요.");
			} else {
				speed += 10;
				System.out.println("현재 속도 : "+speed);
				if (speed==30) {
					doorrack();
				}
			}
		}
	}

	// speedDown()
	// 속도가 0이 되면 더 이상 내려가지 않음 (0== 멈췄습니다.라고 출력)
	// 내릴때마다 현재 속도가 언제인지 출력
	public void speedDown() {
		if((power?true:false) == false) {
			System.out.println("시동이 꺼져있습니다. 시동을 켜주세요.");
		} else {
			if (speed <=0) {
				System.out.println("차가 멈췄습니다.");
				power();
			} else {
				speed -= 10;
				System.out.println("현재 속도 : "+speed);
			}
		}
	}
	
	// doorrack()
	// 속도가 30일때 잠겼습니다. 라고 출력
	public void doorrack() {
		if ((power?true:false) == true) {
			if (speed == 30) {
				System.out.println("문이 잠겼습니다.");
			}
		}
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

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public boolean isDoorrack() {
		return doorrack;
	}

	public void setDoorrack(boolean doorrack) {
		this.doorrack = doorrack;
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
	
	// getter / setter
	
	
}