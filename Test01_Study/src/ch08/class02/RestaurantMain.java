package ch08.class02;

import java.util.Scanner;

/* 클래스는 자료형이므로
 * 여러 개의 변수 즉, 객체를 얼마든지 만들어낼 수 있다.
 * 그리고 각 객체는 독립된 공간을 가지므로
 * 내부의 값을 다르게 가질 수 있다.
 * */

public class RestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Restaurant rest = new Restaurant();
		
		rest.viewMain();
		rest.orderFood();
		rest.calc();
		rest.keyboardEnd();
		
		sc.close();
	}
}
