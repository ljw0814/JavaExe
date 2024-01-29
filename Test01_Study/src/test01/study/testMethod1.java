package test01.study;

public class testMethod1 {

	public static void main(String[] args) {
//		modifier returnType methodName(parameter1, parameter2, ...) {
		    // 메서드 내용
		    // 필요한 작업 수행
//		    return result; // 반환값이 있는 경우
//		}
		
		int result = addNum(5,3);
		System.out.println(result);
		

	}
	public static int addNum(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

}
