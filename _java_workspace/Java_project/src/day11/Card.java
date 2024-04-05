package day11;

/* 한장의 카드를 만드는 클래스
 * 숫자 정보 : 1 ~ 10 J(11) Q(12) K(13)
 * 모양 정보 : ♥ ◆ ♣ ♠ 
 * 한장의 카드를 출력하는 기능 > print () >> ♥1
 * ex) ◆12 입력 > ◆Q 출력 / ♠13 > ♠K /
 * %2 >> ♥2 (없는 모양을 입력했을때 무조건 ♥로 출력) / $16 (모양, 숫자 모두 없을때) > ♥1 로 출력
 * 
 * 1~13까지 입력 받고 print에서 11, 12, 13에서 알파벳으로
 */

/* 클래스의 구성
 * 멤버변수 : 숫자(num,int) 와 모양 (shape,char) > private > getter / setter 생성
 * 메서드 > print()
 * 생성자 : 기본생성자만 생성 > 기본값 ♥1
 * */
public class Card {
	
	private int num;
	private char shape;
	
	public Card() {
		this.shape = '♥'; 
		this.num = 1;
	}
	
	public void print() {
//		if (!(shape == '♥' || shape =='◆' || shape == '♣' || shape == '♠')) {
//			shape = '♥';
//		} 
		System.out.print(shape);
		
		// switch로도 풀어보기 
		
		if (num == 11) {
			System.out.print('J'+ " ");
		} else if (num == 12) {
			System.out.print('Q'+" ");
		} else if (num == 13) {
			System.out.print('K'+" ");
		} else {
			System.out.print(num+" ");
		}
		
	}
		
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
//		this.num = num;
		if (1 <= num && num <= 13) {
			this.num = num;
		} else {
			this.num =1;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
//		this.shape = shape;
//		switch (shape) {
//		case '♥' : case '◆' : case '♣' :case '♠' : {
//			this.shape = shape;
//			break;
//			default : 
//				this.shape = '♥';
//		} 
		if (shape == '♥' || shape == '◆' || shape == '♣' || shape == '♠') {
				this.shape = shape;
		} else {
			this.shape = '♥';
		}

	}
	
	
	
}
