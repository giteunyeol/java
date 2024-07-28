package chapter06;

// public static void swap

public class MethodJava 
{
	int num = 4; // 전역변수(JAVA가 자동 초기화)
	             // 멤버변수
	             // -> 객체 생성시 초기화
	public static void main(String[] args)
	{
		// 함수(method)
		//  - 카멜 표기법(첫글자 소문자)
		//  - () 붙음
		//  - 함수 내의 선언된 변수 -> 지역변수 -> 초기화 필수
		//  - (x, y) : 매개변수(parameter) -> 입력값
		//  - return
		//    1. 반환값(호출한 곳으로 값을 전달)
		//    2. return 을 만나면 함수 종료.
		//    3. return 은 생략 가능
		
		//   함수 사용 방법
		//   1. 함수 정의(코드 작성)
		//   2. 함수 호출 -> 함수이름 + 매개변수
		//   * 함수는 반드시 호출했던 곳으로 돌아감(코드)
		int num = 4; //지역변수
	}
	
	public void test()
	{
		
	}
	/*
	접근제한자          [지정어]      데이터반환타입    메소드명         (매개변수)
	{
	 - public       - static      - void        - 카멜 표기법     - 기본자료형 변수명
	 - protected    - final       - 기본자료형                    - 객체자료형 참조변수
	 - (default)    - abstract    - 객체자료형               
	 - private
	    실행문;
	    return 반환값;
	 }
	  지정어 중간 시험 x
	 */
}
