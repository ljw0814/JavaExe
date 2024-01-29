package ch06_Method01;
import java.util.Scanner;
/*	2. 두 개의 정수를 받아서, 두 수의 차의 절대값을 계산하여 출력하는 메서드를 만들고
	 사용해보세요. 메서드 호출 시 전달되는 값의 순서와 상관없이
	절대값이 계산되어서 출력되어야 합니다*/

public class Resolve2 {
	
	public static void calculate(int a, int b) {
		// 절대값 계산 메소드
		int absolute = Math.abs(a - b);
		System.out.println(absolute);
	}
		
	
	public static void main(String[] args) {
		
		int num1 = 15;
		int num2 = 10;
		// 메서드 호출
		calculate(num1, num2);
	}
}






