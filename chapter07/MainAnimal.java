package chapter07;

public class MainAnimal {
	public static void main(String[] args) {
		// 추상클래스(Animal) 상속받은 일반클래스(Dog)를
		// 객체생성해서만 사용 가능
		Dog dog  = new Dog();
		dog.sound();
		
		Animal dog2 = new Dog(); // 다형성
		
		// 추상클래스는 new 연산자로 객체생성 불가
//		Animal ani = new Animal(); // ERROR
	}
}
