package ch06.sec07.exam02;

public class Korean {

	//필드선언
	String nation = "대한민국";// 여기서 값을 미리 넣을 수 있으나, main에서도 값을 넣으면 main의 값이 출력됨
	String name;
	String ssn;
	// 생성자 선언
	public Korean( String nat, String n, String s) {
		this.nation = nat;
		this.name = n;
		this.ssn = s;
		// 필드의 색깔을 파란색, 매개변수 색깔을 갈색으로 보여줌
		/*위와 동일
		name = n;
		ssn = s;
		nation = nat;
		*/
		
		
	}
}
