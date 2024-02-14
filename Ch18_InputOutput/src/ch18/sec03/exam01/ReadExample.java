package ch18.sec03.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//test1.db에 저장한 내용 1byte씩 읽기
public class ReadExample {
	public static void main(String[] args) {
		try {
			//입력 스트림을 처리하기 위한 추상 클래스
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			
			while(true) {
				int data = is.read();// 1byte씩 읽기
				if(data == -1) break;// 파일 끝에 도달했을 경우,-1은 더이상 읽을 데이터가 없을때 
				System.out.println(data);
			}
			
			is.close();		
		} catch(FileNotFoundException e){//FileNotFoundException 파일 찾을수 없을 때 발생하는 예외 클래스임.
			e.printStackTrace();// 예외발생시 경로추적하여 출력하는 메서드
		} catch (IOException e) { // 입출력 동작 중 발생하는 예외 처리 클래스
			e.printStackTrace();
		}
	}
}
