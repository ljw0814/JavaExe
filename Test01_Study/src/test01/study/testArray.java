package test01.study;

import java.util.Arrays;
import java.util.Scanner;

public class testArray {

	public static void main(String[] args) {

		int[] arr = {1,5,9,3,7};
		
		Arrays.sort(arr);
		int max = arr[0];
		int min = arr[0];
		
		for(int i =0; i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
			if(arr[i]>max) {
				max = arr[i];				
			}
		}
		System.out.println("최소값: "+min+", 최대값: "+max);	

		
	}

}
