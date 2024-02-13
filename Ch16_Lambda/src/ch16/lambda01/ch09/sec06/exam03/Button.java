package ch16.lambda01.ch09.sec06.exam03;
// 교재 411p
public class Button {

	public static interface ClickListener{
		void onClick();
	}
	
	private ClickListener clickListenerk;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListenerk = clickListener;
	}
	
	public void click() {
		this.clickListenerk.onClick();
	}

}
