package chapter07;

public class Dog extends Animal {
	
	public Dog() {
		this.kind =  "포유류";
	}
	
	// 추상 메서드를 반드시 오버라이딩 하도록 강제성(ERROR) 
	@Override
	public void sound() {
		System.out.println("멍멍");
		
	}
	
	
	
}
