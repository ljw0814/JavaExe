package ch03.for10;

import java.util.Scanner;

//12. 양의 정수를 입력받고 그 수만큼 "감사합니다"를 출력하세요
public class Resolve12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		int num = sc.nextInt();
		for(int i =1; i<=num; i++) {
			
			System.out.println("감사합니다.");
		}
		
		sc.close();
	}
}

