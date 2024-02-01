package ch09.hasa08;

public class Police{
	
	private int clothes;
	
	public Police(int clothes) {
		this.clothes = clothes;
	}
	public void putOnClithes() {
		if(clothes>0) {
			System.out.println("Smile!!");
			clothes--;
		}else {
			System.out.println("Shame");//부끄러움
		}
	}
}
