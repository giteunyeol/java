package chapter06;

public class ObjectJava 
{
	public static void main(String[] args)
	{
		// 객체
		// 데이터나 데이터 관련된 기능들을 class 로 정의해서 사용하는 기술
		// * 모든 클래스는 Object 클래스를 상속 받는다.
		//   즉, Object 시조(뿌리)
		
		// class -> 객체 설계도
		
		// class = field(변수) + method(함수)
		
		// 우체국(class)
		// - 우체부가 편지를 배달한다.
		// - 우체부가 소포를 배달한다.
		// - 우체부가 등기를 배달한다.
		
		// field -> 2개(who, what)
		// method -> 배달함수
		
		/*
		 *  // 객체 모델링
		 * public class PostOffice
		 * {
		 *    String worker; // 우체부
		 *    String mail; // 등기, 우편, 소포 등
		 *    public void deliver(worker, mail)
		 *    {
		 *        System.out.println(worker+"가"+mail+"를 배달한다.")
		 *    
		 *    }
		 * }
		 */
		
		// 객체를 사용하는 이유
		// 1. 은닉성(캡슐화)
		//  -> 보안성 강화
		// 2. 재사용성
		//  -> 상속, 다형성
		// 3. 개발 관리가 용이, 협업 효율 중가 (+강제성)
		//  -> 추상, 인터페이스
		
		// 클래스 네이밍룰
		// - 파스칼
		// - MemberJoin : 모든 합성어의 첫글자 대문자
		
		// 객체 사용 방법 
		// 1.class 설계(코드 작성)
		// 2.객체 생성(new 연산자)
		// 3.생성된 객체(인스턴스)를 사용
		
		// 객체 생성 문법
		// 객체참조타입  변수명 = new      생성자 함수();
		// (=객체자료형)         (객체생성연산자)
		
		// new -> 객체생성연산자 
		// 생성자 함수() -> Class 이름과 동일
		//            -> 생성자함수를 통해서만 객체를 생성 및 초기화
		ModifierJava mj = new ModifierJava();
		
		// 클래스 기본 문법
		
		// 접근제한자   (private 붙으면 문법 오류)          지정어(생략가능)     class    클래스이름  {      
		 // - public                                 - static                   -파스
		 // - (default)                              - final
		 //                                          - abstract
		 //    field(변수)
		 //    method(함수)
		 //    constructor(생성자)
		 // }
	}
}
