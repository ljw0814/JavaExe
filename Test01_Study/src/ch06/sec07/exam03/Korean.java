package ch06.sec07.exam03;

public class Korean {

	//필드선언
	String nation = "대한민국";// 여기서 값을 미리 넣을 수 있으나, main에서도 값을 넣으면 main의 값이 출력됨
	String name;
	String ssn;
	// 생성자 선언
	public Korean( String nat, String n, String s) {
		name = n;
		ssn = s;
		nation = nat;
		
		/*	console 출력창
		 *  국적: 한국
			이름: 이정원
			주민등록번호: 970000-0000000
		 	*/
		
		
	}
}
