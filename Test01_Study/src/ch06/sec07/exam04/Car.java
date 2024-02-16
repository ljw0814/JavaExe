package ch06.sec07.exam04;
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
		this.model = mod;
	}
	Car(String com, String col){
		this.company = com;
		this.color = col;
	}//this는 현재 객체를 뜻함, 매개변수명과 필드명을 구분하기 위해 this키워드를 사용함
	Car(String mod, String col, int ms){
		this.model = mod;
		this.color = col;
		this.maxSpeed = ms;
	}
}
