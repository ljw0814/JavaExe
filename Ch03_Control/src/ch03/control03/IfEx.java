package ch03.control03;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		int score;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("0~100 점수 입력 >>");
		score = sc.nextInt();
		
		//if문은 ()의 결과가 참일 때 소속 영역을 실행한다.
		
		if(score >= 90) 
			System.out.println("A학점");
		else if(score >= 90)
			System.out.println("B학점");
		else if(score >= 80)
			System.out.println("C학점");
		else if(score >= 70)
			System.out.println("E학점");
		else 
			System.out.println("F학점이 아닙니다.");
		
		sc.close();
		
//		if(score >= 90) {
//			System.out.println("A학점");
//		}
		sc.close();

	}

}
