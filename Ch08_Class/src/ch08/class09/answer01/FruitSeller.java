package ch08.class09.answer01;

public class FruitSeller {
	private int numOfApple;			// 사과개수
	private int saleMoney;			// 판매금액
	final int APPLE_PRICE = 1000;	// 사과 가격 (상수)
	// 생성자: 초기 사과 개수 설정
	public FruitSeller(int numOfApple) {
		this.numOfApple = numOfApple;
	//this.numOfApple--> this를 붙여야 우선순위를 줌. 
	}
	// 과일 판매 메서드
	public int saleApple(FruitBuyer buyer, int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		saleMoney += money;
		return num;
	}
	public void showSaleRestlt() {
		System.out.println("*** 과일 판매자의 현재 상황 ***");
		System.out.println("남은 사과: "+ numOfApple);
		System.out.println("판매 수익: "+ saleMoney);
	}
}
