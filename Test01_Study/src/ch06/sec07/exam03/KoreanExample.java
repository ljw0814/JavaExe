package ch06.sec07.exam03;

public class KoreanExample {
	public static void main(String[] args) {
		// korean 객체 생성
		Korean kor = new Korean("한국","이정원", "970000-0000000");
		// korean 객체 데이터 읽기
		System.out.println("국적: "+kor.nation);
		System.out.println("이름: "+kor.name);
		System.out.println("주민등록번호: "+kor.ssn);// 주민등록번호
	}
}
