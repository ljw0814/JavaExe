package ch05.array04;
import java.util.Arrays;
/*4. int배열을 10개 생성하세요.
int배열에 3의 배수를 차례대로 저장하세요.
그리고 거꾸로 출력하세요.*/
public class Resolve4 {
	public static void main(String[] args) {
		
		int[] num = new int[10];
		// 3의 배수를 차례대로 저장
		for(int i= 0 ; i< num.length; i++) {
			num[i] = (i + 1) * 3;
			//System.out.println(num[i]);
		}
//		// 순차적으로 출력
//		for(int i= 0;i < num.length;i++) {
//			System.out.println(num[i]);
//		}
		// 거꾸로 출력
		// 초기값에 -1하는 이유:  num.length는 배열 길이보다 1 큰 값임
		// 배열의 인덱스가 0부터 시작하므로, 배열 길이가 10이라면 유효한 인덱스는 0~9까지다.
		for(int i= num.length -1; i>=0; i-- ) {
			System.out.println(num[i]);
		}
		
	}	
}









