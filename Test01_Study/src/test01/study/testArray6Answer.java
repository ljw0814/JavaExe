package test01.study;
import java.util.Scanner;
//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
public class testArray6Answer {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // 학생 수를 나타내는 변수
	        int studentCount = 7;

	        // 학생들의 점수를 저장하는 배열
	        int[] scores = new int[studentCount];

	        // 총점 계산을 위한 변수 초기화
	        int sum = 0;

	        // 학생별로 점수 입력받고 총점 계산
	        for (int i = 0; i < studentCount; i++) {
	            System.out.print("학생 " + (i + 1) + "의 점수를 입력하세요: ");
	            scores[i] = scanner.nextInt();

	            // 입력받은 점수를 총점에 더함
	            sum += scores[i];
	        }

	        // 평균 계산
	        double average = (double) sum / studentCount;

	        // 총점과 평균 출력
	        System.out.println("총점은: " + sum);
	        System.out.println("평균은: " + average);

	        scanner.close();
	}

}
