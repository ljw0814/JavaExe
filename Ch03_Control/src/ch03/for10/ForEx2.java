package ch03.for10;

public class ForEx2 {

	public static void main(String[] args) {
		// 1~10까지 출력
		// 구구단 전체 출력
		//1번만 실행; 조건;(계속비교);실행이 끝나면 변화	
		// 시작;끝;변화량
		for(int i=1;i<=9;i++) {	
			for(int j=1;j<=9;j++)
				System.out.printf("%d*%d=%d\n", i, j, i*j);
			System.out.println();		//실행
			}
		}
	
}


