package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 
public class WriteExample {
    // 바이트 출력
    public static void main(String[] args) {
        try {
            // 파일에 데이터를 출력하기 위해 FileOutputStream 객체 생성
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            // 바이트 형식의 데이터 정의
            byte a = 10;
            byte b = 20;
            byte c = 30;

            // 파일에 바이트 데이터를 순차적으로 출력
            // write() 함수: 파일에 데이터를 출력하는 기능
            os.write(a);
            os.write(b);
            os.write(c);

            // 출력 스트림을 비우고 닫음
            os.flush();
            os.close();
        } catch (IOException e) {
            // IOException이 발생하면 예외 정보를 출력
            e.printStackTrace();
        }
    }
}