package ch18.sec02.exam02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {
    // 바이트 배열 출력하기
    public static void main(String[] args) {
        try {
            // 파일에 데이터를 출력하기 위해 FileOutputStream 객체 생성
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            // 바이트 배열 형식의 데이터 정의
            byte[] array = {10,20,30};

            // 배열의 모든 바이트를 출력
            // write() 함수: 파일에 데이터를 출력하는 기능
            os.write(array);

            // 출력 스트림을 비우고 닫음
            os.flush();
            os.close();
        } catch (IOException e) {
            // IOException이 발생하면 예외 정보를 출력
            e.printStackTrace();
        }
    }
}