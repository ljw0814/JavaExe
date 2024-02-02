package ch09.abstract11.test;

public class EmployeeMain {
	// instanceof 연산자를 사용하여 객체의 타입을 확인하는 메서드
	public static void testInstanceOf() {
		// RegularEmployee 객체 생성
		RegularEmployee regEmp = 
				new RegularEmployee("1111", "홍길동", 7000, 3000);
		 // Employee 타입의 참조 변수에 RegularEmployee 객체 대입
		Employee emp = regEmp;
		 // emp가 RegularEmployee의 객체인지 확인
		if(emp instanceof RegularEmployee)
			System.out.println("emp는 RegularEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		 // emp가 TempEmployee의 객체인지 확인
		if(emp instanceof TempEmployee)
			System.out.println("emp는 TempEmployee의 객체이거나"
								+ " 자식 객체입니다.");
		if(emp instanceof PartTimeEmployee)
			System.out.println("emp는 ParTimeEmployee의 객체이거나"
								+ " 자식 객체입니다.");		
	}
	public static void main(String[] args) {
		// EmployeeManager 객체 생성
		EmployeeManager em = new EmployeeManager();
		// EmployeeManager의 run 메서드 실행
		em.run();
//		위에서 주석 처리된 메서드 호출 (주석 해제 후 실행하면 확인 가능)
//		testInstanceOf();
	}
}
