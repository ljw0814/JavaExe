package ch05.array08;
import java.util.Arrays;
//4. 정수 배열 5개를 할당하고
//Arrays.sort를 사용하지 말고
//배열을 오름차순으로 정렬하도록 저장하세요.
//그리고 출력하세요.
public class Resolve4 {
	public static void main(String[] args) {
		int[] numArr = {10, 99, 2, 78, 32, 1, 67, 105, 187, 23};
		
		int min, max;
		min = max = numArr[0];
		
		for(int i=1;i<numArr.length;i++) {
			// 최소값
			if(min > numArr[i])
				min = numArr[i];
				
			// 최대값
			if(max < numArr[i])
				max = numArr[i];
		}
		
		System.out.println("최소값은 " + min);
		System.out.println("최대값은 " + max);
	}
}


