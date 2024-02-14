package ch16.lambda01.ch09.sec07.exam03;

import ch16.lambda01.ch09.sec06.exam03.Button;

// 교재 익명객체 420p
public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener() {
			public void onClick() {
				System.out.println("Ok 버튼을 클릭했습니다");
			}
		});
		
		btnOk.click();
		
		Button btnCancel = new Button();
		
		btnCancel.setClickListener(new Button.ClickListener() {
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});
		
		btnCancel.click();
	}
}
