package ch03.for10;

import java.util.Scanner;

//13. 양의 정수 입력받고 그 수만큼 3의 배수 출력하세요
//예를 들어 5를 입력받으면 3 6 9 12 15를 출력하면 됩니다
public class Resolve13 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i =1; i<=num;i++) {
			if(num%3==0) {
			System.out.println(i);
			}
		}
		

		
		sc.close();
	}
}





