package chapter09;

public class TryJava {
	// 예외처리
	//  - 
	
	// ERROR: 천재지변이나 하드웨어의 오작동 또는 고장으로 인해
	//        응용프로그램 실행오류가 발생하는 것
	//  * 개발자가 해결할 수 없음!
	//  * 서버 엔지니어 담당
	//    ㄴ 미러 서버
	//    ㄴ HPC(고성능 컴퓨터)
	//    ㄴ RAID 시스템  
	//    ㄴ NAS
	//  Exception(예외): 사용자의 잘못된 조작 또는 개발자의 
	//                  잘못된 코딩으로 인해 발생하는 프로그램 오류 
	//    ㄴ  예외처리를 통해서 방지할 수 있음
	//        (개발자가 해결 가능)
	
	//  공통점(오류와 예외)
	//    - 발생하면 프로그램(서비스) 곧바로 종료
	//    
	//  차이점
	//    -  예외는 개발자가 예외처리를 통해서 예방할 수 있음
	//       (개발자는 서비스직업)
	
	//  예) 핸드폰 번호 입력(-없이)
	//  저장소: 핸드폰번호(11자) -> 01012341234
	//  사용자가 입력: 010-1234-1234 -> 13자
	//  예외가 발생!
	// 
	//  예외처리가 자주 발생하는 예외들
	//   1. NullPointerException
	//   2. ArrayIndexOutOfBoundsException
	//       ㄴ 배열(10칸) [10]
	//   3. NumberFormatException
	//       ㄴ 문자열 -> 숫자로 변환
	//   4. ClassCastException
	//       ㄴ 상위클래스와 하위클래서간의 형변환에서 발생 
	
	// 예외의 종류 2가지
	//  1. 일반 예외
	//   ㄴ Ctrl + s(저장) -> 컴파일러 -> byte code (파일명.class)
	//  2. 실행 예외
	//   ㄴ 프로그램을 동작하는 과정에서 발생하는 예외 
	
	// 예외처리를 반드시 해줘야 하는 경우
	
	// 1. I/O 입출력 관련
	//   - 파일 불러오기, 파일 저장하기 등
	// 2. DB(데이터 베이스) 관련
	//   - DB 연결, CRUD, 기타 등등
	
	// 예외처리는 예외처리 문법이 따로 존재
	//   위 2가지 사항을 제외하고 예외를 꼭 예외처리 문법으로만
	//   해결해야하는 건 아님!
	
	//  예: 사용자가 값을 입력 -> 예외 -> 처리(반드시 예외처리 X)
	//                              유효성 체크 기법 사용(예외처리 문법 X)
	
	//  * 예외처리는 반드시 해줘야함
	//    예외처리를 꼭 예외처리문법을 사용해야만 하는건 아님!
	//    실제 개발자들이 위 2가지 사항 제외하고 예외처리문법 잘 안씀
	
	//  예외처리 종류 4가지
	//  1. try-catch-finally
	//    - 예외처리 문법
	//    - try(예외가 발생할 수 있는 부분)
	//    - catch(예외 처리하는 부분)
	//    - finally(예외가 발생하든 안하든 무조건 실행되는 부분
	//  2. throws
	//    - 예외 전가(예외를 처리하지 않고 다음으로 넘김)
	//  3. throw
	//    - 예외를 강제로 발생 -> 테스트할 때 사용
	//  4. 사용자 정의 예외
	//    - Exception class 를 상속받아서 사용자가 직접 생성 
	//    - JAVA가 기본적인 예외를 생성(마음에 드는 예외가 없는 경우)
	//
	
	public static void main(String[] args) {
		// * finally 는 생략 가능
		// * catch 절은 여러개 상요 가능(Exception 별로)
		// * JAVA의 모든 예외는 Exception 클래스를 상속받고 있음
		try {
			// 예외가 발생할 수 있는 코드 작성 
		} catch (Exception e) {
		    //  예외 처리 방법
			e.printStackTrace(); // 예외를 출력
		} finally {
			// 예외가 발생하든 안하든 무조건 실행하는 경우!
			// * 자원 반납용으로 많이 사용!
		}
	}

	// 예외 던지기(throws) -> 나를 호출한 곳으로(상위)
	public void test() throws Exception {
		
	}
}
