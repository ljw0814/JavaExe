package ch06_Method01;
import java.util.Scanner;
/*		4. gugudan(3); 
		   구구단 메서드를 void 리턴형으로 제작하세요.
		  3을 입력하면 3단이 출력됩니다.*/

public class Resolve4 {
	public static void main(String[] args) {
	gugudan(3);
	}
	public static void gugudan(int num) {
		for(int i =1; i<=9; i++) {
			int dan = num * i; 

			System.out.println(num+"X"+i+"="+dan);
		}

	}
}






