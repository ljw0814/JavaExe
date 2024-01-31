package ch08.class07;

public class TestClass2 {
// 클래스 구조 (필드(객체데이터저장되는곳), 생성자(new연산자로 호출되는 메소드로 필드 초기화홤), 메소드)	
// 1. 클래스 정의 : class 키워드를 사용하여 정의
// 2. 객체 생성
// 3. 멤버 변수와 메서드 사용:
// 4. 접근 제어자:
// 5. 상속과 다형성:
	// 멤버 변수 (필드)
	private int market;
	private int myVar;
	// 생성자
	public TestClass2(int inVal) {
		this.myVar = inVal;
	}
    // 메서드
    public void printVar() {
        System.out.println("My variable: " + myVar);
    } 
}

/*
 * public class main { public st }
 */
