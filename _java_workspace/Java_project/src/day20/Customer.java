package day20;

public class Customer implements Comparable<Customer> {

	/* 스트림으로 출력
	 * 
	 * 여행사 상품이 있습니다.
	 * 여행비용은 15세 이상은 100만원, 그 미만은 50만원으로 계산
	 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
	 * 1. 비용 계산 > 출력  / 2. 고객명단 검색 > 출력
	 * 2. 고객 클래스를 생성, ArrayList로 고객관리
	 * 
	 * 예시) 고객정보 > 고객명단
	 * 이름 : 이순신, 나이 40, 비용 : 100
	 * 이름 : 신사임당, 나이 35, 비용 : 100
	 * 이름 : 홍길동, 나이 10, 비용 : 50
	 * 총 여행경비 : 250
	 * 
	 * 
	 * 20대 이상 고객명단 > 이름순으로 정렬
	 * 이름 :신사임당, 나이 : 35, 비용 100
	 * 이름 : 이순신, 나이 : 40, 비용 100
	 * */
	
	private String name;
	private int age;
	private int pay;
	
	public Customer() {}
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		this.pay = (age >= 15)? 100:50;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 비용 : " + pay;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
