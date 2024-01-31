package ch08.class09;

public class ChineseRestaurantMain {
	public static void main(String[] args) {
        ChineseRestaurant myChineseRestaurant = new ChineseRestaurant(
                "홍콩반점",
                new String[]{"짜장면", "짬뽕", "탕수육", "볶음밥"},
                new int[]{7500, 8000, 12000, 7000}
        );

        // 중국집 정보 출력 메소드
        myChineseRestaurant.display();

        // 음식 주문 (인덱스 0은 짜장면)
        myChineseRestaurant.order(0);
	}
}
