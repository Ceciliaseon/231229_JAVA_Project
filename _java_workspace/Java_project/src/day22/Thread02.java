package day22;

// Runnable 인터페이스를 구현하여 만들기
class MyTread2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=200;i++) {
			System.out.println(i+"번째 "+Thread.currentThread().getName());
		}
	}
}
public class Thread02 {

	public static void main(String[] args) {
		
		// Runnable 로 구현한 스레드 객체 생성
		// Thread 객체를 생성하여 Runnable 구현제를 생성자로 제공
		
		System.out.println("main Start!");
		
		MyTread2  mth = new MyTread2();
		Thread th = new Thread(mth);
		th.start();
		
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// join() : 동시에 2개의 스레드가 실행될 때 다른 스레드의 결과를 참조하여
		// 실행되어야 하는 경우 join()메서드 사용
		
		Thread th2 = new Thread(new MyTread2());
		th2.start();
		
		try {
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main End!");
	}

}
