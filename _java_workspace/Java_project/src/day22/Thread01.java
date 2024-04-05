package day22;

class MyTread extends Thread{

	// 반드시 run()이라는 메서드를 구현해야 함
	@Override
	public void run() {
		//0~200까지 반복하여 실행하는 구문 수행
		
		for(int i=0;i<=200;i++) {
			System.out.println(i+"번째 thread! "+getName());
		}
	}
}

public class Thread01 {

	public static void main(String[] args) {
		/* Thread(쓰레드)
		 * - 실행중인 프로그램이 OS로부터 메로리를 할당 받아 process상태가 됨
		 * - 하나의 process는 하나 이상의 thread를 가지게 되고,
		 * - thread는 실제 작업을 수행하는 단위
		 * 
		 * - Thread가 실제 CUP가 작업을 처리하는 단위 > thread 단위
		 * - multi-thread :여러개의 thread가 동시에 수행되는 프로그램
		 * - CUP는 1초라는 시간을 잘게 쪼개서 thread를 번갈아 처리, 수행하면서
		 * - 사용자들은 동시에 처리하는 것처럼 보여지는 효과를 가지게 됨
		 *  
		 * - thread는 각각 자신만의 작업공간을 가짐 (context)
		 * - 각 thread는 공유하는 자원이 있을 수 있음 (java > static instance)
		 * - 여러 thread가 공유되는 자원 중 경쟁이 발생하는 부분을 critical section(임계영영) 이라고 함
		 * - critical section에 대한 동기화(순차적수행)을 구형하여 오류를 막음
		 * */
		
		/* Thread를 구현하는 2가지 방법
		 * 1. Thread 클래스를 상속하여 만들기
		 * 2. Runnable 인터페이스를 구현하여 만들기
		 * 
		 * 차이점
		 * 자바는 다중상속을 허용하지 않기 때문에 다른 클래스를 상속 중인 경우는 2번으로 구현
		 * 보통은 1번으로 구현하게 됨 
		 */
		
		// 1번 구현방법
		// current 현재 실행중인
		// 현재 실행중인 thread 이름
		System.out.println(Thread.currentThread().getName());
		
		MyTread th = new MyTread();
		th.start();

		MyTread th2 = new MyTread();
		th2.start();

	}

}