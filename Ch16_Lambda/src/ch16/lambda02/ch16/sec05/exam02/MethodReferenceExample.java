package ch16.lambda02.ch16.sec05.exam02;

public class MethodReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		// int ret = str.compareToIgnoreCase(str1);
		// (a, b) -> a.compareToIgnore
		person.ordering(String :: compareToIgnoreCase);
	}
}