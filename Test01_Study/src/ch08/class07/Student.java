package ch08.class07;
//Student 클래스 정의
public class Student { 
	
	public static void main(String[] args) {
		// Student 객체 생성
		Student student1 = new Student("John Doe", "2021001", 90);
		// display 메서드 호출
		student1.display();
	}
	// 멤버 변수 선언
	private String name;
	private String studentId;
	private int score;
	// 생성자 정의, 
	public Student(String name, String studentId, int score) {
		// 생성자를 통해 입력받은 값으로 멤버 변수 초기화
		this.name = name;
		this.studentId = studentId;
		this.score = score;
	}
	// 학생 정보 출력하는 메서드 정의
	public void display() {
		System.out.println("이름: "+name);
		System.out.println("학번: "+studentId);
		System.out.println("점수: "+score);
	}
	
	
}
