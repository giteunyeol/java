package chapter08;

public class MazingerToyImpl implements IMoveArmLeg, IMissile, Ilight {

	@Override
	public void canLight() {
		// TODO Auto-generated method stub
		System.out.println("마징가 z의 불빛!");
	}

	@Override
	public void canMissile() {
		// TODO Auto-generated method stub
		System.out.println("마징가 z의 미사일!");
	}

	@Override
	public void canMoveArmLeg() {
		// TODO Auto-generated method stub
		System.out.println("마징가 z의 팔!");
	}




}
