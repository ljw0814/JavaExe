package ch08.class08;
// 필드 멤버변수
public class FruitBuyer {
	private int money;		// 구매자의 보유한 돈, 후에 FruitMain에서 매개변수로 10000을 넣어 초기화 시켜준다? 
	private int numOfApple;	// 구매한 사과 개수
	
	// 생성자 초기화: 초기 돈 설정
	public FruitBuyer(int money) {
		this.money = money;
		this.numOfApple = 0;	
	}
	
	// 과일 구매 메서드
	public void buyApple(FruitSeller seller, int money) {
		this.numOfApple += seller.saleApple(money);
		this.money -= money;
	}
	
	// 구매자 현재 잔액과, 구매 개수를 출력하는 메서드
	public void showBuyResult() {
		System.out.println("*** 과일 구매자의 현재 상황 ***");
		System.out.println("현재 잔액 :"+money);
		System.out.println("사과 개수 :"+numOfApple);
	}
}
