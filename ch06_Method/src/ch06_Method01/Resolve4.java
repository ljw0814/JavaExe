package ch06_Method01;
import java.util.Scanner;
/*		4. gugudan(3); 
		   구구단 메서드를 void 리턴형으로 제작하세요.
		  3을 입력하면 3단이 출력됩니다.*/

public class Resolve4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단의 숫자를 입력하시오: ");
		int dan = sc.nextInt()	
		gugudan(dan);
		
		}
	
	public static void gugudan(int dan) {
		for(int i=1; i <=9; i++) {
			int puls = dan*i;
			System.out.println(dan+"X"+i+"= "+puls);
		}
	}
}






