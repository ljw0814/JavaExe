package ch02.varaible01;

public class DataType {
	public static void main(String[] args) {
		// 자료형 변수공간이름 = 값
		int num = 100; 			// 정수
		double dnum = 3.14; 	// 실수
		char ch = 'a'; 			// 문자
		String name = "홍길동"; 	// 문자열
		boolean isRun = true; 	// 논리 참&거짓 0과1
		String str = "a"; 		// 문자열
		
		System.out.println(num);
		num = 999;
		num = 123;
		// 변수는 값 변경 가능
		System.out.println(num);
		System.out.println(dnum);
		System.out.println(ch);
		System.out.println(name);
		System.out.println(isRun);
		System.out.println(str);
	}
}
