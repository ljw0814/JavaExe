package ch06.sec07.exam05;
// << 생성자 오버로딩 >> 매개값으로 객체의 필드를 다양하게 초기화하는것
// 오버로딩은 개수 순서가 같으면 오버로딩 아님
// 오버로딩 시 new연산자로 생성자 호출할 때 제공되는 매개값의 타입과 수에 따라 실행됨
// Car = Car1 = new Car{"그랜저", "흰색"};
public class CarExample {
	public static void main(String[] args) {
		// 객체화 하며, 생성자 호출
		
		Car car1 = new Car();
		System.out.println("car1.company: "+ car1.company);
		System.out.println();
		
		Car car2 = new Car("아우디","검정");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.color: "+car2.color);
		System.out.println();
		// 생성자 호출
		Car car3 = new Car("벤츠","파랑",200);
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println("car3.maxSpeed: "+car3.maxSpeed);
	}
	
}
