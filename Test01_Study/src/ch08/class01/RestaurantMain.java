package ch08.class01;

public class RestaurantMain {
	public static void main(String[] args) {
		/* 클래스도 자료형
		 * 우리가 직접 만든 사용자 정의 자료형
		 * */
		// 클래스 객체(클래스의 변수) = new(힙에 할당) 클래스의 생성자함수 호출;
		Restaurant rest = new Restaurant();
		rest.viewMenu();		// 메뉴판 출력 메서드 호출
		rest.selectFood();		// 음식 선택
		rest.deliveryFood();	// 주문, 결제
		rest.keyboardEnd();		// 키보드로 음식 선택
		//rest.printAllFoods();
	}
}
