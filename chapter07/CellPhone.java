package chapter07;

public class CellPhone {  // 부모
	String model;
	String color;
	void powerOn() {System.out.println("전원 ON");}
	void powerOff() {System.out.println("전원 OFF");}
	void bell() {System.out.println("따르릉");}
	void sendVoice(String msg) {
		System.out.println("나: " + msg);
	}
	void receiveVoice(String msg) {
		System.out.println("상대방: " + msg);
	}
	void hangUp() {System.out.println("전화 끊기");}
}
