package ch16.lambda01.ch09.sec07.exam02;
//교재 익명객체 419p
public class HomeExample {
	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		home.use2();
		home.use3(new RemoteControl() {
			public void turnOn(){
				System.out.println("난방을 켭니다");
			}
			public void turnOff() {
				System.out.println("난방을 끕니다");
			}
		});
	}
}
