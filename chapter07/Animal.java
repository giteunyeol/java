package chapter07;

// 추상 클래스 
public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
		
	}
	// 추상 메서드(함수)
	public abstract void sound();
}
