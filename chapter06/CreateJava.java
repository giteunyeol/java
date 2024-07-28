package chapter06;
// 프로그래밍 언어 -> 디자인 패턴 ->프레임워크 

public class CreateJava 
{
	public static void main(String[] args)
	{
		  // 객체 생성
		  //  - class(설계 도면)을 사용해서 객체를 생성(인스턴스)
		  //  - 생성자 함수() 반드시 필요!
		  //  - 같은 class 로 생성한 인스턴스라도 서로 다른 객체로 인식(주소도 다름)
		  //  - 객체타입과 생성자함수()의 이름은 동일
		  //    (상속과 다형성 제외)
		  //      ㄴ 상속을 받게 되면 나의 type 을 부모 type 으로 사용가능
		  //    # 부모(라이츄) -> 상속 -> 자식(피카츄)
		  //    # 라이츄 a  =  new 라이츄();
		  //    # 피카츄 b  =  new 피카츄();
		  //    # 라이츄 c  =  new 피카츄();
		  
		  // 생성자 함수()
		  //    - 클래스와 이름이 동일!
		  //    - class -> 파스칼(MemberJoin)
		  //    - method  -> 카멜(memberJoin) 
		  //    - 생성자가 객체를 생성(인스턴스)
		  //       ㄴ 초기화(시작 프로그램)
		  //    - class 반드시 1개 이상 존재 
		  //    - 생성자 함수를 선언하지 않으면 default 로 생성
		 
	}
	// 기본 생성자(선언하지 않으면 JAVA가 실행할 때 자동생성)
	public CreateJava(){
		// TODO Auto-generatec constructor stub
		// 시작 프로그램 등
	}
}
