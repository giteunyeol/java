package chapter06;

// 타 class
// ReadyObjectJava roj = new ReadyObjectJava();
// roj.text();  // 인스턴스를 활용한 객체 사용!

public class ReadyObjectJava {
	int speed;  // 멤버 변수, 전역 변수 
	
	public ReadyObjectJava() { // 생성자 함수
		speed = 30; // 변수 초기화
		test();     // 함수 동작
	}
	
	public void test() { // 일반 함수
		System.out.println("테스트 함수 실행합니다.");
		
	}
	
	public static void main(String[] args) {
		int speed = 0; // 지역 변수
		System.out.println(speed);
		
		// Class -> 객체 설계도
		//   1. 필드(변수)    -> 맴버 변수
		
		//   2. 생성자(함수)
		//      - 클래스 이름과 동일
		//      - 객체 생성을 위해 반드시 하나 이상 필요!
		//        -> 1개의 클래스 내에 다수의 생성자 함수 선언 가능
		//        -> 오버로딩을 사용하면 중복 이름의 함수를 선언 가능
		//        ->  DTO/VO 활용!
		//       - 선언 X: Default 생성자 함수 생성(JAVA)
		//       - 생성자 역할 = 객체생성 + 변수초기화 + 함수 동작 
		
		//   3. 매서드(함수)   -> 멤버 함수
		//      - 반복적이거나 자주 사용하는 기능들을 함수로 묶음
		//        -> 호출해서 사용!
		//      - 단순하게 기능 1개만 정의 사용!
		//      - 카멜표기법(첫글자 소문자)
		//      - 1개의 클래스 내에 중복이름의 함수를 선언 불가
		//      - () -> 매개변수:입력값, 객체를 매게변수로 사용 가능(DTO/VO)
		//      - return
		//        + 함수 종료
		//        + 호출한 곳으로 값을 반환!
		//      - void : 값을 반환하지 않음!
		//      - 함수 호출(사용)
		//        + 같은 클래스에서는 바로 호출 가능
		//        + 다른 클래스는 반드시 객체생성을 하고 사용!
		//      * 반드시 함수는 호출했던 곳으로 돌아감!
		
		
	}
}
