package ch06.sec07.exam05;
// << 생성자 오버로딩 >> 매개값으로 객체의 필드를 다양하게 초기화하는것
public class Car {
	// 필드선언
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언
	Car(){}
	// 앞에 public 붙여도 됨.
	Car(String mod){
		this(mod, "은색",250);
	}
	Car(String mod, String col){
		this(mod, "은색",250);
	}
	Car(String mod, String col, int ms){
		this.model = mod;
		this.color = col;
		this.maxSpeed = ms;
	}

}
