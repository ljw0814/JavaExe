package ch08.class02;

import java.util.Scanner;


public class Restaurant {
	
	public String name;
	private String[] foods = {"냉면","떡볶이","쌀국수",
								"칼국수","순대","튀김","라면"};
	
	private  int selectNum;
	private Scanner sc = new Scanner(System.in);
	// 메서드
	public void viewManu() {
		System.out.println("----["+name +"]----");
		for(int i=0; i<foods.length;i++) {
			System.out.println(i+", "+foods[i]);
		}
	}
	public void selectFood() {
		System.out.println("----["+name +"]----");
		System.out.println("어떤 음식 선택? >>");
		selectNum = sc.nextInt();
		}
	public void deliveryFood() {
		System.out.println("----["+name +"]----");
		String food = foods[selectNum];
		System.out.println(food +"이 나왔습니다.");
		System.out.println("맛있게 드세요");
	}
	public void keyboardEnd() {
		sc.close();
	}


}
