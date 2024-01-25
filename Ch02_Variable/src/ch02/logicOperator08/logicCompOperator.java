package ch02.logicOperator08;

import java.util.Scanner;

public class logicCompOperator {

	public static void main(String[] args) {
		int score;
		String pass = "화목";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 시험 점수는? (0~100) >> ");
		score = sc.nextInt();
		System.out.print("당신의 면접 분위기는? (0~100) >> ");
		pass = sc.next();
		// A
		//
		if(score >= 90 && pass.equals("화목")==true) {
			System.out.println("당신은 합격입니다.");
		}else {
			System.out.println("당신은 더 좋은 곳이 있을거예요");
		}
		
		sc.close();
	}

}
