package chapter08;

public class ToyMain {
	public static void main(String[] args) {
		MazingerToyImpl mazinger = new MazingerToyImpl();
		
		mazinger.canLight();
		mazinger.canMissile();
		mazinger.canMoveArmLeg();
	}
}
