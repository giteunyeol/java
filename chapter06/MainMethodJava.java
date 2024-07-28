package chapter06;

public class MainMethodJava 
{
	public static void main(String[] args)
	{
		// 2개의 숫자를 덧셈
		int x = 10;
		int y = 15;
		
		// 객체 생성
		SumMethodJava smj = new SumMethodJava();
		
		// 인스턴스(smj) 사용
		int total = smj.calcSum(x, y); // 함수 호출
		System.out.println("반환 값: "+ total);
	}
}
