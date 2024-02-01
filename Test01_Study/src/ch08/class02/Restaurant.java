package ch08.class02;
import java.util.Scanner;
// 메뉴 출력, 키오스크 기능, 점원이 음식 전달
// 음식과 가격, 선택한 음식이름과 개수를 받고, 음식 전달
public class Restaurant {
	// 필드
	private String[] foodN = {"스테이크","제로콜라","파스타","샐러드"};
	private int[] foodPri = {48000,2000,18000,16000};
	private int selectNum;
	public Scanner sc;
	
	// 메서드	메뉴판 출력
	public void viewMain() {
		System.out.println("--------[메뉴판]--------");
		for(int i=0; i<foodN.length;i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(foodN[i]+foodPri[j]);
			}
		}
	}
	
	// 주문 받는 메서드
	public void orderFood(int[] foodPri, int selectNum) {
		
	}
	
	
	
	// 결제금액을 알려주는 메서드
	public void calc() {
		total = selectNum * foodpri[];
		
	}
	
	
	
}
















