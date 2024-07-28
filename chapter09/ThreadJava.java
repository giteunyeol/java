package chapter09;

public class ThreadJava extends Thread{

	@Override
	public void run() {
		super.run();
		System.out.println(Thread.currentThread().getName());
		System.out.println("Thread Test");
		
		for (int i = 10; i >= 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	// 프로세스
	//   - 일을 하는 애들 -> 스레드
	//   - 1명 -> 싱글 스레드
	//   - 여러명 -> 멀티 스레드
}
