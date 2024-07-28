package chapter05;

public class StringJava {
	public static void main(String[] args) {
		// String
		//  - 객체자료형!
		//  - String 객체를 new 를 사용하지 않고 생성하면
		//    문자열값이 동일한 경우 같은 값을 공유
		//    (서로 같은 주소를 참조)
		//     -> 중복을 제거함으로써 메모리 효율 상승!
		
		// name 과 name2는 주소값이 동일하게 들어감
		String nane = "chosun";
		String name2 = "chosun";
		
		// name3와 name4는 주소값이 다르게 들어감
		//  - new(객체생성연산자)
		//  - new 를 사용하면 객체를 생성 가능
		String name3 = new String("chosun");
		String name4 = new String("chosun");
		
	}
}
