package ch05.array05.ch05.sec09;
import java.util.Arrays;

public class ArrayCopyByForExample {
	public static void main(String[] args) {
		// 길이 3인 배열
		int[] num = {1,2,3}; 
		// 길이 5인 배열 새로 생성
		int[] arr = new int[5];
		// 배열 항목 복사
		for(int i=0; i<num.length;i++) {
			arr[i] = num[i];
		}
		// 배열 항목 출력
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
		
	}
}








