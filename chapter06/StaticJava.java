package chapter06;

public class StaticJava {
	// [지정어]
	//  - static
	//  - final
	//  - abstract
	
	// 기본적으로 JAVA 변수 -> Stack 영역
	// 인스턴스(주소를 갖는) -> Heap 영역(Garbage Collector 관여)
	// Static 선언 -> OS 메모리 공유 영역
	
	// static
	//  - 변수, 함수 사용!
	//  - 객체 생성 없이 사용 가능!
	//  - static 으로 선언하면 프로그램 시작부터 끝까지 동작(소멸 x)
	//  - 메모리 올려야 사용 가능!
	//     ㄴ 용량 한계
	//  - 클래스 이름으로 호출
	//    ㄴ 클래스이름.변수;
	//    ㄴ 클래스 이름.함수();
	//    클래스이름.변수; -> 클래스이름, 첫글자 대문자
	//    인스턴스이름.변수; -> 인스턴스(변수 담아서 사용), 첫글자 소문자
	//  * static 남발 x
	//  * PM 물어보고 사용!
	//   
	//  객체
	
	// 객체 생성
	// StaticJava sj = newStaticJava();
	// 
	// sj(변수) -> 스택 영역
}
