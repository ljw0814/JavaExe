package ch02.TransDatatype05;

public class TransDataType {

	public static void main(String[] args) {
		int total = 297;
		int stNum = 4;
		double avg = 0.;
		System.out.println("총점은 "+ total +"입니다.");
		System.out.println("평균은 "+ total/stNum +"입니다.");
		avg= total/stNum;
		System.out.println("평균은 " +avg +"입니다.");		
		// (double)total : 컴파일러에 의해 정수 total은  double로 변환
		// 실수와 정수 연산의 결과는?
		// 실수의 표현범위 > 정수
		// 결과값은 실수 자료형으로 나온다.
		// 
		avg= (double)total/stNum;
		System.out.println("평균은 " +avg +"입니다.");
		
		int nAvg = (int)avg;
		System.out.println("평균은 " + nAvg +"입니다.");
		// 앞에 (int) 붙여 형변환을 하지 않으면 오류남
		
		char ch = 'A';
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println((int)'a');
		// 문자 > 숫자로 형변환
		System.out.println((char)66);
		System.out.println((char)98);
		// 숫자 > 문자로 형변환 가능하다.
		
		/*
		 * avg= total/stNum; System.out.println("평균은 " +(double)avg +"입니다.");
		 avg를 형변환하면 소수점 계산X avg에 값을 넣기 전에 계산이 됨
		 */
		
		
		
	}

}
