package ch16.lambda01.ch09.sec07.exam02;
// 교재 익명객체 417~418p
public class Home {
	// 필드 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
	};
	//메소드(필드사용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}
		//메소드(로컬변수 이용)
		public void use2() {
			//로컬 변수에 익명 구현 객체 대입
			RemoteControl rc = new RemoteControl() {
				public void turnOn() {
					System.out.println("에어컨을 켭니다");
				}
				public void turnOff() {
					System.out.println("에어컨을 끕니다");
				}
			};
			rc.turnOn();
			rc.turnOff();
		}
	//메소드(매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
