package ch17.stream01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamCalc {
	public static void main(String[] args) {
		List<String> nameList = new ArrayList();
		nameList.add("홍길동");
		nameList.add("알렉산드라");
		nameList.add("톨스토이");
		nameList.add("김수한무거북이와두루미삼천갑자동방삭");
		nameList.add("Cristoper");
		nameList.add("프랑스대왕루이14세");
		nameList.add("영국알프레드대왕");
		nameList.add("세종대왕");
		nameList.add("영문예무인성명효대왕");
		nameList.add("일본왕");
		nameList.add("몰라몰라몰라몰라");
		
		for(String name : nameList) {
			if(name.length() >= 5) {
				System.out.print(name + ", ");
			}
		}
		System.out.println();
		
		
		//--list
		Stream<String> strm = nameList.stream();
		Stream<String> strmF = strm.filter(s->s.length() >= 5);
		strmF.forEach(s->System.out.print( s + ", "));
		System.out.println();
		
		// 위의 for문을 아래처럼 Stream을 사용해 간결하게 바꿈 또는 위의 배열 리스트를 아래처럼 바꿈
		nameList.stream()							// 1) 스트림객체
			.filter(s->s.length() >= 5)				// 2) 중간연산(참일 때 새로운 스트림) 
			.filter(s->s.length() <10)
			.forEach(s->System.out.print(s+", "));	// 3) 최종연산
	}
}
