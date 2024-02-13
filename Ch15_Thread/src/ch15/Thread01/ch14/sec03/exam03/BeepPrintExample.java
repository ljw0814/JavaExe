package ch15.Thread01.ch14.sec03.exam03;

import java.awt.Toolkit;
// 메인함수는
public class BeepPrintExample {
	public static void main(String[] args) {
		// main스레드(주인아저씨)가 work스레드(알바생)을 고용한다.		
		Thread thread = new Thread() {
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5;i++){
					toolkit.beep();
					try {Thread.sleep(500);}catch(Exception e) {}
					
				}
			}
		};
		thread.start();
		
		for(int i=0; i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}catch(Exception e) {}
		}
	}
}