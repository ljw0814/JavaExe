package ch09.abstract11.test;
//Employee 클래스: 직원 정보를 나타내는 추상 클래스
public abstract class Employee {
	protected String empno;		// 사번
	protected String name;		// 이름
	
	public Employee(String empno, String name) {
		this.empno = empno;
		this.name = name;
	}
	// showEmployeeInfo 메서드: 직원의 기본 정보를 출력하는 메서드
	public void showEmployeeInfo() {
		System.out.println("----------------------");
		System.out.println("empno : " + empno);
		System.out.println("name : " + name);
	}
	// getMonthPay 메서드: 월급을 계산하는 추상 메서드
	public abstract double getMonthPay();// 추상 메서드로 선언하며 하위 클래스에서 구현해야 함
}
