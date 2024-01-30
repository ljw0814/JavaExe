package ch08.class07;

import java.util.Scanner;


public class Restaurant {
	// 필드
	private String[] foods = {"냉면", "떡볶이", "쌀국수",
							"칼국수", "순대", "튀김", "라면"};
	private int selectNum;
	private Scanner sc;
	private String name;
	
	// 메서드
	public void viewMenu() {
		for(int i=0;i<foods.length;i++) {
			System.out.println(i + "." + foods[i]);
		}
	}
	public void selectFood() {
		System.out.print("어떤 음식을 선택하시겠습니까? >> ");
		selectNum = sc.nextInt();
	}
	public void deliveryFood() {
		String food = foods[selectNum];
		System.out.println(food + "이 나왔습니다.");
		System.out.println("맛있게 드세요 ^^");
	}
	public void keyboardEnd() {
		sc.close();
	}
	
}
















