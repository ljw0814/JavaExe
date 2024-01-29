package ch05.array04;
import java.util.Scanner;
//3. 7명의 학생의 학점을 입력받고 총점과 평균을 출력하세요
public class Resolve3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[7];
			//int num = sc.nextInt();	
	
			for(int i=0;i<num.length;i++) {
				System.out.println((i+1) + "번째 학생 학점 입력 >> ");
				num[i] = sc.nextInt();
			}
			int total = 0;
			for(int i=0;i<num.length;i++) {
				total+=num[i];
			}
			int avg = total/num.length;
			System.out.println("학생들의 총 점수는: " + total);
			System.out.println("학생들의 평균 점수는: " +(double)avg);
			sc.close();
	}
}








