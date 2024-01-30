package ch08.class02;

public class RestaurantMain {
	public static void main(String[] args) {
		Restaurant rest = new Restaurant();
		rest.name = "새마을 식당";
		rest.viewManu();
		rest.selectFood();
		rest.deliveryFood();
		rest.keyboardEnd();
	}
}
