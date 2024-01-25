package ch02.logicOperator07;

public class logicOperator {

	public static void main(String[] args) {
		boolean logic;
		
		// And 연산 둘다 참이거나
		logic = true && true;
		System.out.println("true && true => " + logic);
		logic = true && false;
		System.out.println("true && false => " + logic);
		// or 연산 하나라도 참이거나
		logic = true || true;
		System.out.println("true || true => " + logic);
		logic = true || false;
		System.out.println("true || false => " + logic);
		// Xor 연산
		logic = true ^ true;
		System.out.println("true ^ true => " + logic);
		logic = true ^ false;
		System.out.println("true ^ false => " + logic);
		logic = false ^ false;
		System.out.println("false ^ false => " + logic);
		// Not 연산
		logic = !false;
		System.out.println("!false => " + logic);

	}

}
