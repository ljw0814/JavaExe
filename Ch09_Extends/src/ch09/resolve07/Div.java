package ch09.resolve07;
//빼기
public class Div {
	
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		if(b !=0) {
			return a/b;
		}else {
			System.out.println("Error: Division bu zero");
			return 0;
		}
	}
}
