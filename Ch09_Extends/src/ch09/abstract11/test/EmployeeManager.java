package ch09.abstract11.test;

import java.util.Scanner;

public class EmployeeManager {
	private final int EMP_NUM = 100;	// 100명 사원이 최대

	// Employee의 자식객체들을 저장
	private Employee[] empArr = new Employee[EMP_NUM];
	//Employee배열을 생성하고, 배열크기를 EMP_NUM(즉 최대 사원수)로 초기화함
	
	private int numOfEmp = 0;	// 저장된 사원객체 수, 다음 사원이 저장될 index
	private Scanner sc = new Scanner(System.in);
	
	private int viewMenu() {
		System.out.println("[ 사원 선택 ]");
		System.out.println("1. 정규직");
		System.out.println("2. 임시직");
		System.out.println("3. 일용직");
		System.out.println("4. 전체정보보기");
		System.out.println("5. 정규직 보기");
		System.out.println("6. 임시직 보기");
		System.out.println("7. 일용직 보기");
		System.out.println("8. 종료");
		System.out.println("번호 입력 >> ");
		int sel = sc.nextInt();

		return sel;
	}
	// 사용자로부터 입력받은 정보로 정규직 객체를 생성하는 메서드
	private RegularEmployee createRegularEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("보너스 >> ");
		int bonus = sc.nextInt();
		RegularEmployee emp = 
				new RegularEmployee(empno, name, yearSalary, bonus);
		return emp;
	}
	 // 사용자로부터 입력받은 정보로 임시직 객체를 생성하는 메서드
	private TempEmployee createTempEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("연봉 >> ");
		int yearSalary = sc.nextInt();
		System.out.print("계약기간 >> ");
		int hireYear = sc.nextInt();
		TempEmployee emp = 
				new TempEmployee(empno, name, yearSalary, hireYear);
		return emp;
	}
	// 사용자로부터 입력받은 정보로 일용직 객체를 생성하는 메서드
	private PartTimeEmployee createPartTimeEmployee() {
		System.out.print("사번 >> ");
		String empno = sc.next();
		System.out.print("이름 >> ");
		String name = sc.next();
		System.out.print("일당 >> ");
		int dailyPay = sc.nextInt();
		System.out.print("일한 일수 >> ");
		int workDay = sc.nextInt();
		PartTimeEmployee emp = 
				new PartTimeEmployee(empno, name, dailyPay, workDay);
		return emp;
	}
    // 생성된 객체를 배열에 저장하는 메서드
	private boolean saveEmployee(Employee emp) {
		boolean isSave = true;
		
		if(this.numOfEmp < EMP_NUM) {
			this.empArr[this.numOfEmp] = emp;
			this.numOfEmp++;
			isSave = true;
		}else {
			isSave = false;
		}
		
		return isSave;
	}
	// 저장된 모든 사원 정보를 출력하는 메서드
	private void viewAllEmployeeInfo() {
		for(int i=0;i<this.numOfEmp;i++) {
			this.empArr[i].showEmployeeInfo();
		}
	}
	// 저장된 정규직 사원 정보를 출력하는 메서드 
	private void viewRegEmp() {
		System.out.println("---[정규직 사원 정보 보기]---");
		for(int i=0;i<this.numOfEmp;i++) { // numOfEmp는 저장된 사원객체 수, 다음 사원이 저장될 index
			if(this.empArr[i] instanceof RegularEmployee) {//empArr는 자식객체, instanceof연산자로 객체가 하위 클래스인지 확인함,
				this.empArr[i].showEmployeeInfo();
			}
		
		}
	}
	// 프로그램 실행 메서드
	public void run() {
		boolean isRun = true;
		while(isRun) {
			int selNum = viewMenu();
			Employee emp = null;
			
			switch(selNum) {
			case EmpMenu.REG_EMP:
				emp = createRegularEmployee();
				break;
			case EmpMenu.TEMP_EMP:
				emp = createTempEmployee();
				break;
			case EmpMenu.PART_EMP:
				emp = createPartTimeEmployee();
				break;
			case EmpMenu.ALL_INFO:
				emp = null;
				viewAllEmployeeInfo();
				break;
			case EmpMenu.EXIT:
				emp = null;
				isRun = false;
				break;
			default:
				emp = null;
				System.out.println("해당 항목이 존재하지 않습니다.");
				break;
			}
			
			// emp객체가 존재한다면
			if(emp != null) {
				boolean isSave = saveEmployee(emp);
				if(!isSave)
					System.out.println("더 이상 저장 공간이 없습니다.");
			}
		}
		System.out.println("Program Exit...");
	}
}






