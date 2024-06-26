package day11;

/* CardPack 클래스
 * ♥1~♥K / ◆1~◆K / ♣1~♣K / ♠1~♠K
 * 총 카드 수 : 52장
 * 52장의 카드 > 1 pack (배열)
 * 
 * - 카드 출력기능 - Card class print() 사용
 * - 카드 초기화 기능 (CardPack 생성자)
 * 생성자에서 52장에 카드가 다 들어가 있어야 함...?
 * 
 * - 카드 1장을 빼내는 기능 (Random) > 출력 print() 사용
 * - 카드를 섞는 기능 
 * 
 * */

public class CardPack {
	//int arr [] = new int [52]; // int  배열안에 들어가는 자료의 형태
	//카드 52장이 들어갈 수 있는 배열을 생성
	private Card [] pack = new Card [52]; // 카드에 객체가 들어갈 수 있는 배열
	private int cnt = 0; // 카드 배열의 index위치를 제크하기 위한 변수
	
	public CardPack() {
		// CardPack 클래스를 생성하면 52장에 카드가 생성되어야 함
		// * 모양 정보 : ♥ ◆ ♣ ♠ 
		// * 숫자 정보 : 1 ~ 10 J(11) Q(12) K(13)
		
		char shape = '♥';
		for (int i=1; i<=4; i++) { // 4가지 모양을 넣기 위한 for문
			switch (i) {
			case 1 : shape = '♥'; break;
			case 2 : shape = '◆'; break;	
			case 3 : shape = '♣'; break;	
			case 4 : shape = '♠'; break;	
			}
			for (int j=1;j<=13;j++) { // 13까지 숫자를 넣기 위한 for문
				Card c = new Card(); // 새카드 1장 생성
				c.setShape(shape);
				c.setNum(j);
				pack[cnt] = c;
				cnt ++ ; // cnt == 52 / pack 배열의 번지는 51까지
			}
		}
	}

	// 카드를 섞는 기능
	// shuffle()
	// 리턴타입 : void / 매개변수 x
	
	
	public void shuffle() {
		for (int i=0;i<pack.length;i++) {
			int random = (int)(Math.random()*pack.length);
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	// 카드 한장을 빼내는 기능 
	// pick()
	// pick 메서드를 호출하면 카드 한장을 return
	// 리턴타입 Card;
	
	public Card pick() {
		if (cnt==0) {
			return null;
		}
		cnt--;
		return pack[cnt];
	}
	
	// 초기화 하는 기능 
	public void intit() {
		cnt = 52;
	}
	
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}
	
	
}
