package chapter02;

public class CastingJava {
	public static void main(String[] agrs) {
		// 자료형 변환
		// 1. promotion(작은 자료형 -> 큰 자료형 변환) - 자동
		// 2. casting(큰 자료형 -> 작은 자료형 변환) - 값의 손실이 생김(자동 불가)
		
		//promotion
		int num = 4;
		double dNum = num; //자동 형변환(int -> double)
		System.out.println(dNum);
		
		//casting
		
		double pi = 3.14;
		int ipi = (int)pi; // 강제 형변환(값 손실 생김)
		System.out.println(ipi);
	}

}


