package ch06_Method01;
import java.util.Scanner;
/*	3. int result = total(10, 100);
	  위처럼 사용하면 result에는 10부터 100까지의 누적합이 저장되어야 합니다
	  total메서드를 작성하고 사용해보세요.*/

public class Resolve3 {
	public static void main(String[] args) {
		
		int result = total(10,100);
		
		System.out.println("누적합: "+result);
		
	}
	
	public static int total(int start, int end) {
		
		int sum = 0;
		
		for(int i = start;i<=end;i++) {
			sum+=i;			
		}
		return sum;
	}
}






