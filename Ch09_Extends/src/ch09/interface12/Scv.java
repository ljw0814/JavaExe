package ch09.interface12;

public class Scv implements StarUnit {

	@Override// 이 메서드는 StarUnit(부모클래스)로부터 받아왔다는 표시
	public void walk() {
		System.out.println("스르륵==");

	}

	@Override
	public void attack() {
		System.out.println("징징==");
	}

	@Override
	public void die() {
		System.out.println("펑~!");

	}

}
