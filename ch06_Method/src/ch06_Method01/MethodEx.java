package ch06_Method01;
import java.util.Scanner;

public class MethodEx {
// 메서드를 만들기 전 코드
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1) 처리하기 전에 입력받는 부분
		System.out.println("1번째 정수 입력 >> ");
		int num0 = sc.nextInt();
		System.out.println("2번째 정수 입력 >> ");
		int num1 = sc.nextInt();
		System.out.println("연산자 입력(+ - * / %) >> ");
		String op = sc.next();
		int result = 0;
		// 2) 계산하는 부분
		switch(op) {
		case "+":
			result = num0 + num1;
			break;
		case "-":
			result = num0 + num1;
			break;
		case "*":
			result = num0 + num1;
			break;
		case "/":
			result = num0 + num1;
			break;
		case "%":
			result = num0 + num1;
			break;
		default:
			System.out.println("연산이 불가능합니다!");
			break;
		}
		// 3) 결과값 출력
		System.out.println("결과값은 "+result+"입니다");
		
		
		sc.close();
	}

}
