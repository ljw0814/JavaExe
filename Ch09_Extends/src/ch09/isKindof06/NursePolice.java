package ch09.isKindof06;

public class NursePolice extends Police {

	private int thermomerers;
	
	public NursePolice(int bullet,
			int handCuffs, int thermimeters) {
		super(bullet, handCuffs);
		this.thermomerers = thermomerers;
	}
	public void calcThermometer() {
		if(thermomerers>0) {
			System.out.println("Check 36.5 Temp");
			thermomerers--;
			
		}else {
			System.out.println("No check temp");
		}
	}
}
