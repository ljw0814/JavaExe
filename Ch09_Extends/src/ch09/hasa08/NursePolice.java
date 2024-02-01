package ch09.hasa08;

public class NursePolice extends Police {

	private int thermomerers;
	
	public NursePolice(int clothes, int thermomethers) {
		super(clothes);
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
