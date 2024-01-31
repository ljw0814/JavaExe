package ch09.resolve07;

public class Triangle {
	private double base; 	// 삼각형 밑변
	private double height;	// 삼각형 높이
	// 생성자 초기화
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	// 삼각형 넓이 구하는 공식
	public double calculateArea() {
		return 0.5 * base * height;
	}
	
	// 밑변과 높이 정보를 변경시킬 수 있는 메소드 정의
	public void newSet(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	
	
}
