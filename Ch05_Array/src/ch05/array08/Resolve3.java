package ch05.array08;

import java.util.Arrays;
//3. 정수 배열 5개를 할당하고
//System.out.println(Arrays.toString(numArr));
//로 배열을 출력했을 때 거꾸로 출력되도록
//배열의 값을 거꾸로 저장하세요.
public class Resolve3 {
	public static void main(String[] args) {
//		1. 배열 5개 할당. 
		int[] numArr = {1,8,12,9,47};
		
		int num = 0;
		
		System.out.println(Arrays.toString(numArr));
		
		for(int i = numArr.length -1; i>=0; i--) {
			//numArr[i] = num;
			System.out.print(numArr[i]);			
		}
	}
}


