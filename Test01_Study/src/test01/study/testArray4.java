package test01.study;
import java.util.Arrays;
//String 배열을 10명의 이름으로 초기화하고 역순 순서대로 출력하세요
public class testArray4 {

	public static void main(String[] args) {

		String[] name = {"정원","철수","짱구","유리"};

		System.out.println("순서대로 출력하기: ");
		for(int i = name.length-1;i>=0;i--) {
			String arr = name[i];
			System.out.print(arr+", ");				
		}
		//for(int i =3; i<name.length;i--)  <- 틀린코드, 문제점 "i < name.length" 이 조건은 계속 참으로 나와 무한루트에 빠짐,
	}

}
