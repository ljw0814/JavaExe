package testClass;

// 중국집을 나타내는 클래스
public class Chinese {
	// 메뉴 담은 배열
	private MenuName[] menu;
	
	// 생성자: 메뉴 초기화
	public Chinese(MenuName[] menu) {
		this.menu = menu;
	}
	
	//메뉴를 출력하는 메서드
	public void displayMenu() {
		System.out.println("중국집 메뉴");
		for(int i =0; menu.length; i++) { // 메뉴의 길이만큼 반복 실행하라
			System.out.println((i + 1)+ ". "+menu[i].getName + " - " + menu[i].getPrice() + "원");
		}
	}
	
	// 결제 금액 계산하는 메서드
	public int payment() {
		
	}
	

}
