package test01.study;
import java.util.Scanner;
//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
// 1.7명, 2.학점, 3.총점, 4.평균
public class testArray6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. 학생 수를 나타내는 배열과 학생의 점수를 저장하는 배열 분리
		int student = 7;				// 학생수를 나타내는 변수

		// 2. 배열을 사용하여 각 학생의 점수 저장
		// 배열 선언과 생성: 데이터타입[] 변수명 = new 동일한데이터타입[길이], 길이에 변수나 숫가 대입가능
		int[] score = new int[student]; // 각 학생의 점수를 배열에 저장
		
		// 3. 총점 계산을 위한 변수 초기화
		int sum = 0;  

		// 4. 반복문 생성
		//	  점수 입력받기
		//	  입력받은 점수 더하기
		for(int i =0; i<student; i++) {
			System.out.print("점수를 입력하시오: ");
			score[i] = sc.nextInt();
			sum += score[i];
		}
		System.out.println("총점은: "+sum);
		
		int average = sum/student;
		System.out.println("평균은: "+average);
		
		sc.close();
	}

}
