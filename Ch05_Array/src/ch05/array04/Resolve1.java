package ch05.array04;
import java.util.Arrays;
//1. String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class Resolve1 {
	public static void main(String[] args) {
		
		String[] name = {"일원","이원","삼원","4원","5원","6원","7원","8원","9원","10원"};
		
		System.out.println(Arrays.toString(name));
		
		for(int i=0; i<name.length;i++) {
			System.out.println(name[i] = " ");
		}

		
	}
}








