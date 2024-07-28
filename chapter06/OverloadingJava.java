package chapter06;

public class OverloadingJava {
	// Class 내에 동일한 이름의 함수는 사용 불가
	//  1. 오버로딩
	//  2. 오버라이딩(+상속)
	
	//  오버 로딩 
	//    - 동일한 이름의 함수를 식별(매개변수로 파악)
	//    1. 매개변수의 갯수가 달라야함
	//    2. 매개변수의 갯수가 동일하더라도 type 이 달라야함
	//    3. 매개변수의 갯수와 type 이 동일한경우 순서가 달라야함
	
	// OverloadingJava()
	// OverloadingJava(5)
	// OverloadingJava(5, 1.2)
	// OverloadingJava(1.2, 5)
	public OverloadingJava() {
		
	}
	public OverloadingJava(int a, int b) {
		
	}
	public OverloadingJava(String a, int b) {
		
	}
	public OverloadingJava(double a, int b) {
		
	}
}
