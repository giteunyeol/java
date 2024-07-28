package chapter09;

public class WrapperJava {
	// Wrapper Class
	//  - 기본자료형을 박스로 싸서 객체자료형으로 만들어 줌
	//  - 기본자료형: 8가지
	//  - 객체자료형: 기본자료형 8가지 제외하고 모두
	
	// * 함수를 사용하다보면 데이터를 사용할 때 반드시
	//   객체자료형으로만 사용해야하는 경우가 있음!
	//
	
	// byte     ->  Byte
	// short    ->  Short
	// int      ->  Integer
	// long     ->  Long
	// float    ->  Float
	// double   ->  Double
	// char     ->  Character
	// boolean  ->  Boolean
	
	// example) 함수(객체자료형, 객체자료형)
	// int num : 정수형 기본자료형
	// Integer num : 정수형 객체자료형  
	
	Integer num = new Integer(12345); // 기본 -> 객체
	int num1 = num.intValue();        // 객체 -> 기본
	
}
