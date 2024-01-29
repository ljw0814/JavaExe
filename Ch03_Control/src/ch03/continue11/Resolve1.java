package ch03.continue11;
// for문을 이용해 1 부터 100까지의 정수 중 3의 배수의 총합을 출력하는 코드를 작성하시오
public class Resolve1 {
	public static void main(String[] args) {
		
		int sum = 0;
				
		for(int i=0;i<=100;i++) {
			if(i%3==0) { // 3의 배수만 출력하기위해 조건걸음				
				System.out.println("3의 배수인 값:"+i);			
			}
			//sum+=i;
			sum = i + sum; // 3의 배수를 계속 더해줌
		}
		System.out.println("3의 배수를 모두 더한 값: "+sum);
	}

}
