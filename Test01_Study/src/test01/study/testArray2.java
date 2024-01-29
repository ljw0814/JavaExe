package test01.study;

import java.util.Scanner;

public class testArray2 {

	public static void main(String[] args) {

		//타입[]변수이름; 				 배열 선언
		//변수이름 = new 타입[길이];	 배열 생성
		
		int[] carry = new int[3];	 // 값 2개 저장할수있는 배열 생성
		carry[0] = 15;
		carry[1] = 30;
		carry[2] = 60;
		carry[3] = 120;
		
		int in = carry.length; 		// array의 값을 in에 저장
		
		int[] arr = new int[] {77,88};	// 배열 생성과 초기화 동시에 가능
		
		int[] arr1 = new int[] {814,55};
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[3]);
		}
		
	}

}
