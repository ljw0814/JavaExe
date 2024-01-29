package ch06_Method01;
import java.util.Scanner;
/*	
	1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
	   작은 값을 반환하는 메서드를 작성하고 사용하세요
*/   
public class Resolve1 {
	// main 메서드 내의 계산하는 부분을 옮긴다.
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수: ");
		int num1 = sc.nextInt();
		
		System.out.println("두번째 정수: ");
		int num2 = sc.nextInt();
		
		int maxResult = reMax(num1, num2); 
		System.out.println("입력값중 큰 값: "+ maxResult);
		
		int minResult = reMin(num1, num2); 
		System.out.println("입력값중 작은 값: "+ minResult);
	}

	
	public static int reMin(int a, int b) {
		return (a < b) ? a : b;
	}
	
	public static int reMax(int a, int b) {
		return (a > b) ? a : b;
	}
}







