package ch09.resolve07;

public class TriangleMain {

	public static void main(String[] args) {
		// 삼각형 객체 생성
		Triangle triangle = new Triangle(5.0, 3.0);
		
		System.out.println("삼각형의 넓이는: "+ triangle.calculateArea());
		
		triangle.newSet(7.0, 4.5);
		
		System.out.println("변경된 삼각형의 넓이는: " +triangle.calculateArea());
		
	}
}
