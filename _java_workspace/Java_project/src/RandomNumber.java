import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int sum = 0; // 합계 변수 
		
		System.out.print("난수의 개수를 입력하세요 > ");
		int RandomNum = sc.nextInt(); 

		for (int i=1;i<=RandomNum;i++) { 
			int num = (int)(Math.random()*99)+0;
			sum +=num; 
		}
		System.out.println("난수 "+RandomNum+"개의 합은 > " + sum); 

		
		int a =5,b=10,c=15,d=30;
		boolean result;
		result = (a*3+b >d)||(c-d/a<=d);
		System.out.println(result);
	}

}


