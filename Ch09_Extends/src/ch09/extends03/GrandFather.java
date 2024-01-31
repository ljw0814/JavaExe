package ch09.extends03;

public class GrandFather {
	int handsomeScore = 10;
	//GrandFather()-> 생성자, 
	// 정의 시 리턴타입 없는 이유: 객체 초기화 용도이기 때문
	// 초기화 역활이라 리턴 타입없음, 
	// 	- 일반적인 생성자 정의
	//	public 클래스이름(매개변수) {
	// 		생성자의 내용
	//	}
	
	GrandFather(){
		System.out.println("GrandFather 생성자");
	}
	
	void handsome() {
		System.out.println("잘 생겼다~");
	}
}
