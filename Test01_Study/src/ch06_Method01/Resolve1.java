package ch06_Method01;
import java.util.Scanner;
/*	
	1. 2개의 정수를 입력받고 큰 값을 반환하는 메서드와
	   작은 값을 반환하는 메서드를 작성하고 사용하세요
*/   
public class Resolve1 {
	// 1. 정수 2개를 입력받을 Scanner를 만든다.
	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 정수를 입력하시오: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오: ");
		int num2 = sc.nextInt();
		// 메서드를 호출한다.
		int max = maxNum(num1, num2);
		int min = minNum(num1, num2);
		
		System.out.println("큰 값은: "+max+", 작은 값은: "+min);
		
	}
	// 2. 큰 값을 반환하는 메서드
	public static int maxNum(int ma, int mi) {
		ma  = (ma > mi)? ma : mi; // 삼항연산자로 true값을담을변수 = (조건)?true:false 
		// 삼항연산자로 값을 비교해 큰값을 true로 설정, 즉 큰 값을 ma 넣어 
		return ma; // 리턴으로 큰 값을 가지고 간다.
	}
	
	public static int minNum(int ma, int mi) {
		mi  = (mi < ma)? mi : ma;
		return mi;		
	}

}

// 커밋추가





