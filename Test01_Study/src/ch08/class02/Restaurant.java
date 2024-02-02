package ch08.class02;
import java.util.Scanner;
// 메뉴 출력, 키오스크 기능, 점원이 음식 전달
// 음식과 가격, 선택한 음식이름과 개수를 받고, 음식 전달
public class Restaurant {
	// 필드
	private String[] foodN = {"스테이크","제로콜라","파스타","샐러드"};
	private int[] foodPri = {48000,2000,18000,16000};
	private int selectNum;
	private int totalPay;
	private Scanner sc = new Scanner(System.in);
	
	
	// 메서드	메뉴판 출력
	public void viewMain() {
		System.out.println("--------[메뉴판]--------");
		for(int i=0; i<foodN.length;i++) {
			for(int j = 0; j < i; j++) {
				System.out.println(i+". "+foodN[i]+": "+foodPri[j]);
			}
		}
	}
	
	// 주문 받는 메서드
	public void orderFood() {
		System.out.println("주문하실 음식 번호를 입력해주시오: ");
		selectNum = sc.nextInt();
	}
	
	
	
	// 결제금액을 알려주는 메서드
	public void calc() {
		totalPay = selectNum * foodPri[selectNum -1];//사용자가 선택한 selectNum를 배열의 인덱스로 변환하는 것
		System.out.println(totalPay+"원 결제 도와드리겠습니다.");
	}
	
	public void keyboardEnd() {
		sc.close();
	}
	
	
	
	
}
















