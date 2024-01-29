package test01.study;
import java.util.Arrays;
//String 배열을 10명의 이름으로 초기화하고 순서대로 출력하세요
public class testArray5 {

	public static void main(String[] args) {

		String[] name = {"정원","철수","짱구","유리"};

		System.out.println("순서대로 출력하기: ");
		for(String arr:name) {
			System.out.print(arr+", ");				
		}
		
	}

}
