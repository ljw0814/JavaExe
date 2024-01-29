package ch06_Method01;

import java.util.Scanner;

public class MethodEx3 {
	// num0과 num1은 add함수의 지역변수다.
	// 아래와 전혀 다른공간에 있는 함수
	// add(num0)은 main 함수에 있는 num0이 대입됨
	// main함수의 10과 5가 전달됨.
	// return은 호출된곳으로 돌아가라
	// 값을 가지고 돌아감
	public static int add(int num0, int num1) {
		int result = num0 + num1;
		return result;
	}
	
	public static void main(String[] args) {
		// main함수의 지역변수로 stack에 num0과 num1이 초기화되어 생성된다.
//		int num0 = 10, num1 =5;
		int result1 = add(10, 5);// add(파라미터(인자))
		System.out.println("결과값은 "+ result1);
		
		
		int a =3, b = 7;
		int result2 = add(a,b);
		System.out.println("결과값은 "+ result2);
		
	}

}
