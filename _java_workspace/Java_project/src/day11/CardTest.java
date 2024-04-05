package day11;

public class CardTest {

	public static void main(String[] args) {
			
//		Card c = new Card();
//		c.setShape('♣');
//		c.setNum(12);
//		c.print();
//		
//		c.setShape('%');
//		c.setNum(1);
//		c.print();
//
//		c.setShape('♠');
//		c.setNum(13);
//		c.print();
//		
//		c.setShape('◆');
//		c.setNum(15);
//		c.print();
		
		CardPack cp = new CardPack(); // 52장의 카드가 모두 생성됨
		cp.shuffle(); // 카드 섞는 기능
		
		int cnt = 0;
		for (int i=0;i<4;i++) {
			for (int j=0;j<13;j++) {
				cp.getPack()[cnt].print();
				//cp.getPack() > CardPack 클래스안에 있는 pack[]을 return;
				//cp.getPack()[cnt] > pack[0] > Card (멤버변수, 메서드)
				cnt++;
			}
			System.out.println();
		}
		System.out.println();
		cp.pick().print();
		cp.pick().print();
		cp.pick().print();
		cp.pick().print();
		cp.pick().print();
		cp.pick().print();
		System.out.println();
		
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.println("play1 Card open");
		player1.print();
		System.out.println();
		System.out.println("play2 Card open");
		player2.print();
		



		
	}

}
