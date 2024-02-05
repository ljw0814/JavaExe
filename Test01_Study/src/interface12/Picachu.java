package interface12;

public class Picachu implements StarUnit{

	@Override
	public void walk() {
		System.out.println("스르륵==");
	}

	@Override
	public void attack() {
		System.out.println("징징==");
	}

	@Override
	public void die() {
		System.out.println("펑==");
	}

}
