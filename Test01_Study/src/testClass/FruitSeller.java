package testClass;

public class FruitSeller {
	// 과일 판매자 
	public String fruitName;	// 과일 이름
	public int totalMoney;		// 매출 금액 	 
	public int FRUIT_PRICE = 5000; ;	// 과일 가격
	// 생성자로 초기화
	public FruitSeller(String fruitName, int totalMoney, int priceFruit) {
		this.fruitName = fruitName;
		this.totalMoney = totalMoney;
		//this.priceFruit = priceFruit;
	}
	// 고객이 원하는 과일의 갯수만큼 곱하여 계산
	public void saleFruit(int buyCount) {
		int money = buyCount * FRUIT_PRICE;
		// 총 판매금액에 고객이 구매한 금액 더함
		totalMoney += money;
	}
	
}
