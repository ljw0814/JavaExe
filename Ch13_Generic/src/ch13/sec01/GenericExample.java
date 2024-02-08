package ch13.sec01;
/* Box<String> box1 = new Box<>();
 * Box<Integer> box2 = new Box<>();
 * 위처럼 코드를 작성하면 아래처럼 컴파일러는 자동으로 2개의 클래스를 정의하게 된다.
 * class Box_String{
 * 	public String content;
 * }
 * class Box_integer{
 * 	public Integer content;
 * }
 * */
public class GenericExample {
	public static void main(String[] args) {
		//Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		box1.content = "안녕하세요.";
		String str = box1.content;
		System.out.println(str);

		//Box<Integer> box2 = new Box<Integer>();
		Box<Integer> box2 = new Box<>();
		box2.content = 100;			// boxing : heap -> Stack
		int value = box2.content;	// UnBoxing : Stack -> heap  
		System.out.println(value);
	}
}