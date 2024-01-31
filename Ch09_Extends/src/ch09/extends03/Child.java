package ch09.extends03;

public class Child extends Father {
//자식 클래스가 부모 클래스의 특성을 상속받을 때 extends 키워드를 사용합니다.	
	float day = 365 + 1.0f/4;
	
	Child(){
		System.out.println("Child 생성자");
	}
	
	void play(){
		System.out.println("인생이 즐겁다.");
	}
}
