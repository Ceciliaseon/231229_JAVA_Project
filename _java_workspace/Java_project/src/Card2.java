
public class Card2 {
	
	private int num;
	private char shape;
	
	public Card2 () {
		this.num = 1;
		this.shape = '◆';
	}
	
	public void print () {
	
		System.out.print(shape);
		
		if (num == 11) {
			System.out.print("J"+" ");
		} else if (num == 12) {
			System.out.print("Q"+" ");
		} else if (num == 13) {
			System.out.print("K"+" ");
		} else {
			System.out.print(num+" ");
		}
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		if (1<=num && num<=13) {
			this.num = num;
		} else {
			this.num = 1;
		}
	}

	public char getShape() {
		return shape;
	}

	public void setShape(char shape) {
		
		if (shape == '♥' || shape == '♣' || shape == '◆' || shape == '♠') {
			this.shape = shape;
		} else {
			this.shape = '◆';
		}
	}
	
	
}
