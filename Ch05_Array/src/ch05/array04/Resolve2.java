package ch05.array04;
import java.util.Arrays;
//2. String 배열을 10명의 이름으로 초기화하고 역순으로 출력하세요
public class Resolve2 {
	public static void main(String[] args) {
		
		String[] name = {"영정원","일정원","이정원","삼정원","오정원","육정원","칠정원","팔정원","구정원","열정원"};
		System.out.println(Arrays.toString(name));
		for(int i= name.length -1;i >= 0;i--) {
			System.out.print(name[i]+", ");
		}
		/* System.out.println(); */
	}
}








