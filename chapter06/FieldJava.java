package chapter06;

public class FieldJava {
	int num;         // 전역변수, 멤버변수
	// FieldJava fj = new FieldJava();
	// fj.num;
	
	static int num3; // 정적변수, 클래스변수
	// FieldJava.num3;
	
	public void test() {
		int num2 =  0; // 지역변수
		TestField tf = new TestField();
		//tf.num4; // 인스턴스 변수
	}
	// 전역변수
	// 지역변수
	// 인스턴스변수
	// 클래스변수
	// 멤버변수
	// 정적변수
}
