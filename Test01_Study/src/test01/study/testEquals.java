package test01.study;

import java.util.Scanner;

public class testEquals {

	public static void main(String[] args) {
		String name;	
		Scanner sc = new Scanner(System.in);
		System.out.println("당신의 이름을 입력하시오.");
		name = sc.next();
		if(name.equals("이정원")){
			System.out.println("본인이 맞습니다.");
		}else {
			System.out.println("본인이 아닙니다.");
		}
		
		sc.close();
		//문자열은 주소값으로 비교하기때문에 equals를 사용하는건지 질문
	}

}
