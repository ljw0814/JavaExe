package ch08.class11;


public class WatchTime {
	private int hour, min, sec;
	
	public WatchTime(int hour, int min, int sec) {
		System.out.println("this:" + this); // this는 객체를 정보를 가지고 있는 참조변수
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	//public void viewTime(WatchTime this)
	public void viewTime() {// 메모리에 올라간다, 첫번째 객체를 사용할 때 viewTime을 올려서 재사용한다.
		System.out.printf("[%02d:%02d:%02d]\n", hour, min, sec);
	}
	
	public static void main(String[] args) {
		WatchTime wtNum = new WatchTime(12, 13, 33);
		System.out.println("wtNum:" + wtNum);
		System.out.printf("wtNum:%x\n", wtNum.hashCode());
		wtNum.viewTime();//메서드가 호출된 메서드 정보값을 담고있다
		
		WatchTime wtNum1 = new WatchTime(13, 23, 53);
		System.out.println("wtNum1:" + wtNum1);
		System.out.printf("wtNum1:%x\n", wtNum1.hashCode());
		wtNum1.viewTime();//실제로 내부적으로는 viewTime(wtNum1); 이렇게 호출된다.
	}
}














