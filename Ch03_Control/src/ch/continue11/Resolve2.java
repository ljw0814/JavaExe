package ch.continue11;
// for문을 이용해 *로 트리를 만드시오
public class Resolve2 {
	public static void main(String[] args) {
		int i = 0;
		for(i=1;i<=6;i++) {
			for(int j = 1; j<i; j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
