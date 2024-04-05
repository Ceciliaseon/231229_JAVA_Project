
public class Test {

	public static void main(String[] args) {
		
		//변수 값의 합을 구하는 프로그램
		int [][] a = {{10,20,50},{20,30,15},{100,110,120}};
		
		int sum = 0;
		for (int i=0;i<a.length;i++) { 
			for (int j=0;j<a.length;j++) { 
				sum+=a[i][j];
			}
		}
		System.out.print("배열의 총합은 > " +sum);
		System.out.println();
		int i=5;
		int j=0;
		j =i++;
		System.out.println(i + "/" +j);
		
		int x =5;
		switch (x) {
		case 6: System.out.println(x--);
		case 5: System.out.println(x--);
		case 4 : System.out.println(x--);
		case 3 : System.out.println(x--); break;
		default: System.out.println(x--);
			break;
		}
	}

}


