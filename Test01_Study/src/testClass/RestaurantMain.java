package testClass;

public class RestaurantMain {

	public static void main(String[] args) {
		
		//Restaurant restaurant = new Restaurant("음식", 3000);
		
        Restaurant[] menu = {
                new Restaurant("바나나우유", 2000),
                new Restaurant("삼각김밥", 2800),
                new Restaurant("컵라면", 1000)
            };
		
        // 음식 정보 출력 (하나만 출력됨)
       // System.out.println("음식 이름: " + Restaurant.getFood());
       // System.out.println("음식 가격: " + Restaurant.getPrice() + "원");
        
        for(int i =0; i < menu.length; i++) {
            System.out.println("메뉴판: " + menu[i].getFood());
            System.out.println("가격: " + menu[i].getPrice());
        }
	}
}
