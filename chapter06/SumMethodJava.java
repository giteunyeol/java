package chapter06;

public class SumMethodJava 
{
	// 함수 정의
	// - int 형 숫자 2개를 입력
	// - void -> 반환값 x
	/*
	public void calcSum(int a, int b)
	{
		int sum = a + b;
		System.out.println("덧셈: " + sum);
	}
	*/
	
	// 반환값 -> 덧셈 결과
	public int calcSum(int a, int b)
	{
		int sum = a + b;
		System.out.println("덧셈: " + sum);
		return sum;
	}
}
