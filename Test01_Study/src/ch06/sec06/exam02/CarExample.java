package ch06.sec06.exam02;

public class CarExample {

	public static void main(String[] args) {
		// 외부 객체
		// 객체 생성
		Car myCar = new Car();
		
		//Car 객체의 필드값 읽기
		// .(도트 연산자): 객체 멤버에 접근할 때 사용하는 연산자
		System.out.println("제작회사: "+ myCar.company);
		System.out.println("모델명: "+myCar.model);// myCar객체의 model이라는 필드(멤버변수)에 접근하는 코드
		System.out.println("자동차 색상: "+myCar.color);
		System.out.println("차 최고속도: "+myCar.maxSpeed);
		System.out.println("현재속도: "+myCar.speed);
	
		//Car 객체의 필드값 변경(외부에서 변경)
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
		// 내부에서 자신의 객체를 호출시에는 .(도트 연산자)없이 호출이 가능
		// 외부에서 사용시 . 사용하여 호출
	}

}
