package ch05.array04;
import java.util.Arrays;
//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		
		String[] name = {"정원","길동","철수","유리","꺽정","소정","정훈","동훈","아이린","한소희"};
		
//		System.out.println(Arrays.toString(name));
		
		for(int i=0; i<name.length;i++) {
			System.out.print(name[i]+", ");			
		}
		System.out.println();
		for(String arr : name) { // int arr: name[i] 틀림 for each 조건에 (변수:변수)임
			System.out.print(arr+", ");
		}
		
	}
}








