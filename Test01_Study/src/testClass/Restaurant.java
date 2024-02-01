package testClass;
// 음식점 클래스
public class Restaurant {
	// 멤버변수
	private static String food;
	private static int price;
	// 생성자로 멤버변수 초기화
	public Restaurant(String food, int price) {
		this.food = food;
		this.price = price;
		
	}
	
	public static String getFood() {
		return food;
	}
	
	public static int getPrice() {
		return price;
	}
}
