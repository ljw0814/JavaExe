package ch16.lambda01.ch09.sec07.exam01;
// 교재 익명객체 415~416p
public class CarExample {
	
	public static void main(String[] args) {
		Car car = new Car();
		// 필드 사용
		car.run1();
		// 로컬변수 사용
		car.run2();
		// 익명 자식 객체가 대입된 매개변수 사용
		car.run3(new Tire() {
			public void roll() {
				System.out.println("익명 자식 Tire 객체 3이 굴러갑니다");
			}
		});
	}
}
