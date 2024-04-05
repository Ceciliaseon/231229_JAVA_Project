package sale;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class Order extends Sale<String, Integer> {
	
	/* 주문객체
	 * 주문을 하려면(메뉴명, 가격), 수량, 합계(가격*수량)
	 * (메뉴명, 가격) : 상속받은 객체의 값 > super
	 * 수량, 합계 : order만 가지고 있는 객체 > this
	 * */
	
	private int count; // 수량
	private int total; // 총금액

	
	public Order() {}
	
	public Order(String menu, int price, int count) {
//		super.setMenu(menu); // 부모의 set사용
//		super.setPrice(price);
		
		// 부모생성자 호출
		super(menu,price);
		this.count = count;
		this.total = price * count;
	}
	
	public void orderListPrint() {
		
		this.total = super.getPrice()*count;
//		System.out.println(super.toString()+"*"+count +" = "+total);
		System.out.print(super.getMenu()+" - "+super.getPrice());
		System.out.println(" / "+count +"개 주문 > 금액 : "+total);
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotla() {
		return total;
	}

	public void setTotla(int total) {
		this.total = total;
	}
	
	
	
	
}
