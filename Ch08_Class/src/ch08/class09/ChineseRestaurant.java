package ch08.class09;
// 중화요리집 클래스 정의
public class ChineseRestaurant {
	// 멤버변수 선언
	private String restName; // 가게이름
	private String[] menu; ;  // 음식이름
	private int[] price; 		 // 음식가격
	
	// 생성자 정의
	public ChineseRestaurant(String restName, String[] menu,int[] price) {
		this.restName = restName;
		this.menu = menu;
		this.price = price;
	}
	
	// 가게 정보 출력하는 메서드 정의
	// 가게이름, 음식이름, 음식 가격 출력
	public void display() {
		System.out.println("가게 이름: "+ restName);
		System.out.println("음식 메뉴: ");
		for(int i =0; i<menu.length; i++) {
			System.out.println(menu[i]+price[i]+"원");
		}
	}
	// 음식 주문 메서드 정의
	public void order(int index) {
        System.out.println("주문한 음식: " + menu[index]);
        System.out.println("가격: " + price[index] + "원");
        System.out.println("조리중... 완료!");
	}
		// 중화요리집 객체 생성
		public static void main(String[] args) {
			ChineseRestaurant myChineseRestaurant = new ChineseRestaurant(
					"홍콩반점",
					new String[] {"짜장면","짬뽕","탕수육","볶음밥"},// new 쓰는 이유: 배열은 객체라 new통해 객체를 생성하면서 {}사용해 초기값을 할당함.
					new int[] {7500,8000,12000,7000}
					);
	        // 중국집 정보 출력 메소드
	        myChineseRestaurant.display();

	        // 음식 주문 (인덱스 0은 짜장면)
	        myChineseRestaurant.order(0);
		}

		

	
}
