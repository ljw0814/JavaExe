package ch06.sec06.exam01;

public class CarExample {

	public static void main(String[] args) {
		//객체 생성
		Car myCar = new Car();
		
		//Car 객체의 필드값 읽기
		// .(도트 연산자): 객체 멤버에 접근할 때 사용하는 연산자
		System.out.println("모델명: "+myCar.model);// myCar객체의 model이라는 필드(멤버변수)에 접근하는 코드
		System.out.println("시동여부: "+myCar.start);
		System.out.println("현재속도: "+myCar.speed);
	}

}
