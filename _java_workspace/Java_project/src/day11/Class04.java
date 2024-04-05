package day11;

public class Class04 {

	public static void main(String[] args) {
		/* TV 클래스 생성
		 * 멤버변수 : brand, power, ch, vol
		 * 
		 * 메서드 
		 * powerInfo()
		 * power 켜지면 "tv가 켜졌습니다." 출력 / 꺼지면 "tv가 꺼졌습니다."출력
		 * 
		 * chUp() : 1씩 증가,  20번까지만 있음 20이 넘어가면 다시 0번으로 순환구조
		 * chDown() : 1씩 감소, 0번이 되면 다시 20번으로 순환구조
		 * 
		 * volUp() / volDown() : 1씩 증가/감소, 볼륨은 10까지
		 * 						 10이 넘으면 10으로 출력, 0이면 "음소거"라고 출력
		 * */
		
		Tv t = new Tv();
//		t.print();
		t.powerInfo();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.powerInfo();
	}

}

class Tv {
	private final String BRAND = "LG" ;
	private boolean power;
	private int ch;
	private int vol;

	public Tv() {
		this.vol = 3;
	}
	
	public void print () {
		System.out.println("tv 브랜드 : " + BRAND);
	}
	
	public void powerInfo () {
		power = !power;
		if (power) {
			System.out.println("tv가 켜졌습니다. 현재 채널 : "+ch +"번");
			print();
		} else {
			System.out.println("tv가 꺼졌습니다.");
		}
	}
	
	public void chUp() {
		if (ch>=20) {
			ch = 0;
			System.out.println("채널 : " + ch+"번");
		} else {
			ch+=1;
			System.out.println("채널 : " + ch+"번");
		} 
	}
	
	public void chDown() {
		if (ch<=0) {
			ch = 20;
			System.out.println("채널 : " + ch+"번");
		} else {
			ch-=1;
			System.out.println("채널 : " + ch+"번");
		}
	}
	
	public void volUp() {
		if (vol>=10) {
			vol = 10;
			System.out.println("vol : "+ vol);
		} else {
			vol+=1;
			System.out.println("vol : "+ vol);
		}
	}
	
	public void volDown() {
		if (vol <=0) {
			System.out.println("음소거");
		} else {
			System.out.println("vol : "+ vol);
			vol-=1;
		}
	}

	public String getBrand() {
		return BRAND;
	}

//	public void setBrand(String brand) { final > setter 만들 수 없다. 변경이 불가능 하기 때문
//		this.BRAND = brand;
//	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}
	
	
}