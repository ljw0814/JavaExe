package ch08.class01;

import java.util.Arrays;
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
	// 필드
	private String[] foods = {"소금빵","푸딩","크레페","초코빵"};
	private int[] price = {2800,5000,8000,3500};
	private int selectNum; // 사용자가 선택한 메뉴번호를 저장하는 변수
	private Scanner sc = new Scanner(System.in);
	// foods 전부 출력하는 메서드
    public void printAllFoods() {
        System.out.println(Arrays.toString(foods));
    }
	
	// 메서드: 메뉴 출력
	public void viewMenu() {
	    for (int i = 0; i < foods.length; i++) {
	        System.out.println((i + 1) + "." + foods[i] + ": " + price[i]);
	    }
	}
	 // 사용자의 메뉴 선택을 받는 메서드
	public void selectFood() {
		System.out.println("어떤음식을 주문하시겠습니까?");
		selectNum = sc.nextInt();
	}

	/*
	 * public void deliveryFood() { String food = foods[selectNum]; //int price =
	 * price[selectNum]; System.out.println(food+"로 주문 접수하겠습니다");
	 * System.out.println(price+"원 결제 도와드리겠습니다."); }
	 */
	
	 // 사용자의 주문을 처리하고 주문 내역을 화면에 표시하는 메서드
    public void deliveryFood() {
    	// 배열에서 선택한 음식과 해당하는 가격을 가져옴
        String food = foods[selectNum - 1];
        int selectedPrice = price[selectNum - 1];
        int num = price[0];
        System.out.println(food + "(으)로 주문 접수하겠습니다");
        //System.out.println(Arrays.toString(new int[]{selectedPrice}) + "원 결제 도와드리겠습니다.");
       
        System.out.println(selectedPrice+ "원 결제 도와드리겠습니다.");
        // 배열 출력시 Arrays.toString()
        //System.out.println(price + "원 결제 도와드리겠습니다.");
        
    }
	
	public void keyboardEnd() {
		sc.close();
	}
	
	
	
}
















