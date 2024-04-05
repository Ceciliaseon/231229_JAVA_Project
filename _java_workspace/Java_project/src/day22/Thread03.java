package day22;

class sumTread extends Thread{

	private int start;
	private int end;
	int total;
	
	public sumTread (int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run() {
		for(int i=start;i<=end;i++) {
			this.total += i;
		}
		
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}

public class Thread03 {

	public static void main(String[] args){
		/* 1~50, 51~100까지의 합을 구하는 2개의 thread를 생성
		 * 그 결과를 확인
		 * 
		 * 2개의 thread가 실행되고 난 후
		 * thread1 1~50까지의 합계 출력
		 * thread2 51~100까지의 합계 출력
		 * 마지막 thread1+thread2의 합계 출력
		 * 
		 * 순서대로 실행
		 * */
		
		sumTread st = new sumTread(1,50);
		sumTread st2 = new sumTread(51,100);
		
		st.start();
		st2.start();
		try {
			st.join();
			Thread.sleep(1000); // 0.5초 있다가 실행해라
			st2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("st totla : "+st.total);
		System.out.println("st2 totla : "+st2.total);
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		int lasttotal = st.total+st2.total;
		System.out.println(lasttotal);
		
	}

}
