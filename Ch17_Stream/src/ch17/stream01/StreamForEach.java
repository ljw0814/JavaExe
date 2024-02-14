package ch17.stream01;

import java.util.Arrays;

public class StreamForEach {
	public static void main(String[] args) {
		int[] arr = {10,30,99,2,77,3};
		
		// 1) 출력하는 방법
		System.out.println(Arrays.toString(arr));
		
		// 2) 출력하는 방법
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i] + ", ");
		System.out.println();
		
		// 3) 출력하는 방법
		for(int e : arr)//외부에서 arr에게 값을 e가 받아서 전달하고(반복)
			System.out.print(e + ", ");
		System.out.println();
		
		// 4) 스트림 사용(스트림 객체 -> 최종연산)
		//스트림 사용시 배열의 경우 Arrays에 넣어서 사용해야함
		// 내부적으로 한 줄로 줄세움
		Arrays.stream(arr).forEach(n->System.out.print(n+", "));
	
	}
}
