package testClass;
// 음식점 클래스
public class Restaurant {
	// 멤버변수
	// 선언 시 static으로 선언된 변수는 모든 객체가 하나의 값을 공유하게 됩니다.
	// 따라서 객체를 생성할 때마다 새로운 값을 갖지 않고, 
	// 마지막으로 생성된 객체의 값으로 계속 덮어씌우게 됩니다.
	private String[] food;
	private int[] price;
	// 생성자로 멤버변수 초기화
	public Restaurant(String[] food, int[] price) {
		this.food = food;
		this.price = price;	
	}
	//Restaurant의 멤버변수는 private으로 선언되어 RestaurantMain에서 접근하려면
	// 객체를 생성해야됨. 인스턴스 변수를 사용해 값을 접근 허용함.
	public String[] getFood() {
		return food;
	}
	
	public int[] getPrice() {
		return price;
	}
	
	public int calculate(int count) {
		return getPrice()* count;
	}
}
