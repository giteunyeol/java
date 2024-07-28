package chapter07;

// 자식: CellPhone(부모) 상속
public class MusicCellPhone extends CellPhone{
	String music; // 재생 곡
	
	public MusicCellPhone(String model, String color, String music) {
		 super(); // 부모클래스 객체생성, 선언 안하면 자동생성
		 this.model = model;  // 상속받은 부모 필드
		 this.color = color;  // 상속받은 부모 필드
		 this.music = music;
	}
	
	void turnOnMusic() {System.out.println("MUSIC ON");}
	void turnOffMusic() {System.out.println("MUSIC OFF");}
    void nextMusic(String music) {
    	System.out.println(music + "곡을 재생합니다.");
    }

	@Override
	void bell() {
		super.bell();  // 부모 bell () 호출
		System.out.println("샤랄라");
	}
    
}
