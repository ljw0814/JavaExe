package ch08.class07;

import java.util.Scanner;

public class RestaurantMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 클래스도 자료형
		 * 우리가 직접 만든 사용자 정의 자료형
		 * */
		// 클래스 객체(클래스의 변수) = new(힙에 할당) 클래스의 생성자함수 호출;
		Restaurant rest = new Restaurant(sc, "새마을 식당",
				new String[] {"연탄불고기","소금구이","차돌밖이"}); 
		rest.viewMenu();
		rest.selectFood();
		rest.deliveryFood();
		
		Restaurant rest1 = new Restaurant(sc, "낙원타코",
				new String[] {"낙원파히타","김치 브리또", "불고기퀘사디아"});
		rest1.viewMenu();
		rest1.selectFood();
		rest1.deliveryFood();
		
		Restaurant rest2 = new Restaurant(sc, "소호정",
				new String[] {"안동국시", "국밥","메밀묵"});
		rest2.viewMenu();
		rest2.selectFood();
		rest2.deliveryFood();

	}
}
