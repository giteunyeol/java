package chapter04;

import java.util.Scanner;

public class WhileJava {
	public static void main(String[] args)
	{
		//while : 반복횟수를 모르는 경우
		// - 조건만 만족하면 무한 반복
		// - ** 무한루프에 빠지는 것을 조심 **
		// - break 문과 항상 함께 사용할 것
		
		// - break; -> 반복문 빠져 나가기 
		// - continue; -> 다음 반복으로 넘어가기
		// - break, continue는 for과 while 모두 사용 가능
		
		// while문 (1 ~ 100 더하기)
		int i = 1;
		int sum = 0;
		while (i <= 100) 
		{
			sum += 1; 
			i++;
		}
		
		int sum2 = 0;
		// for문(1~100 더하기)
		for(int j = 0; j <= 100; j++)
		{
			sum2 += j;
		}
		
		//while문을 사용하는 경우
		// - 케이스 1
		// 올바른 값을 입력해주세요!
		
		//0~100점까지만 입력이 가능한 반복문 코드
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			int score = sc.nextInt();
			if (score >= 0 && score <= 100)
			{
				// 0 ~ 100점 올바르게 입력
				break;
			}
			else
			{
				System.out.println("0~100점 사이의 값을 입력하세요.");
			}
		}
	}
}
