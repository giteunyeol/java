package chapter03;

public class EqualJava {
	public static void main(String[] args) {
		// 기본자료형과 객체자료형의 동등 연산자
		int num = 4;
		System.out.println("기본자료형: " + (num == 4));
		
		String name = new String("yey");
		String name2 = new String("yey");
		System.out.println("객체자료형(==): " + (name == name2));
		System.out.println("객체자료형(equals): " + (name.equals(name2)));
		// * equals를 사용하지 않으면
		// 객체자료형은 변수에 실제값이 위치한 주소가
		// 들어있기 때문에 비교가 불가함
		// equals를 사용하면 실제값이 위치한 주소로 
		// 가서 실제값을 가져오고 비교하기때문에 연산 가능
		
		// ***기본자료형과 객체자료형의 차이***
		// - 기본자료형은 변수에 실제 값이 저장
		// - 객체자료형은 변수에 실제 값이 위치한 주소가 저장
		int val = 4;
		//String name2 = "yey";
		
	}
}
