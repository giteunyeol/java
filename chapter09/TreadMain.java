package chapter09;

// 백그라운드 스케줄러(CRON)
public class TreadMain {
	public static void main(String[] args) {
		ThreadJava tj = new ThreadJava();
	    tj.setName("카운트다운 스레드");
	    tj.start();
	}
}
