package chapter04;

public class ForJava {
	public static void main(String[] args) {
		//반복문
		// 1. for(반복 횟수를 아는경우)
		// 2. while(반복 횟수 모르는경우)
		
		// 구구단 2단 출력
		// 2*1 = 2
		// 2*2 = 4
		for (int i = 1; i <= 9; i++)
		{
			System.out.println("2x"+i+"=" +(2*i));
		}
		// 향상 된 for문
		for(String string : args) {
			
		}
	}
}
