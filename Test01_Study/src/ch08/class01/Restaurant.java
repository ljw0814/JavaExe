package ch08.class01;

import java.util.Scanner;

/* 클래스는 영역이 확실하다(클래스의 캡슐화)
 * 클래스 = 멤버변수(필드) + 멤버함수(메서드)
 * 
 * 식당
 * 필드=변수=명사
 * 메서드=함수=동사
 * 
 * [클래스의 대상]
 * 큰 개념의 명사(일반적인 클래스)
 * 동사들의 집합(Controller, Business Layer)
 * 필드들의 집합(Vo, Dto)
 * */
public class Restaurant {
	// 필드 + 멤버변수
	private String[] foods = {"연어덮밥","돈까스","냉모밀","가라아게"};
	private int count;
	private Scanner sc = new Scanner(System.in);
	//메서드
	public void viewMenu() {
		for(int i =0; i<foods.length; i++) {
			System.out.println(i+"."+foods);
		}
	}
	
}
















