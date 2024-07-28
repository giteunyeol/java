package chapter07;

public class MainMusicCellPhone {
	public static void main(String[] args) {
		MusicCellPhone phone = new MusicCellPhone("아이폰", "민트", "Bonnie&Clide");
		
		// 부모로부터 상속받은 필드
		System.out.println(phone.model);
		System.out.println(phone.color);
		
		// 자식에 정의된 필드
		System.out.println(phone.music);
		
		// 부모로부터 상속받은 매서드 호출
		phone.powerOn();
		phone.bell();
		phone.sendVoice("누구세요?");
		phone.receiveVoice("안녕하세요. 조선대입니다.");
		phone.sendVoice("네 반갑습니다.");
		phone.hangUp();
		
		// 자식에 정의된 매서드 호출
		phone.turnOnMusic();
		phone.nextMusic("Die4you");
		phone.turnOffMusic();
	}
}
