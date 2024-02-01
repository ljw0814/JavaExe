package testClass;

public class RestaurantMain {

	public static void main(String[] args) {
		
		//Restaurant restaurant = new Restaurant("음식", 3000);
		//Restaurant클래스 객체 생성하지 않은 이유, getFood()와 getPrice메서드가
		//인스턴스 메서드이기때문
        // 배열에는 Restaurant 객체가 들어가야 하므로 
		// new Restaurant를 통해 객체를 생성해야 합니다.
        Restaurant[] menu = {
                new Restaurant("바나나우유", 1800),
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
