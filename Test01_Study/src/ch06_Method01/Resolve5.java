package ch06_Method01;
import java.util.Scanner;
/*	5. star(5);
	을 입력하면 
	*
	**
	***
	****
	*****
	위처럼 출력되는 void star(int num) 메서드를 작성하고 사용해보세요.*/
public class Resolve5 {
	public static void main(String[] args) {
		int star =5;
		for(int i=0;i<=star;i++) {
			//System.out.println("*");
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}






