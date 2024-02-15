package ch19.client.echoclient01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/* 클라이언트는 서버와 연결되어야 한다.
 * 1) IP, Port을 소켓객체 설정하고 연결을 한다.
 * 2) 연결 후에 서버<->클라이언트 자유롭게 통신한다.
 * 3) 다 마치면 스트림을 종료한다.
 * */
public class EchoClient {
	public static void main(String[] args) {
		final int PORT = 9000;
		
		try {						 //"127.0.0.1" 자신을 가리킴
			Socket socket = new Socket("192.168.0.50",PORT);
			BufferedReader keyboard = new BufferedReader(
						new InputStreamReader(System.in));
					OutputStream out = socket.getOutputStream();
					InputStream in = socket.getInputStream();
					PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
					BufferedReader br = new BufferedReader(new InputStreamReader(in));
		
					String line;
					while(true) {
						System.out.println("입력 >>");
						line = keyboard.readLine();
						if(line.equals("quit"))
							break;
						pw.println(line);
						pw.flush();
						
						line = br.readLine();
						System.out.println("서버로부터 echo 문자열: "+ line);
					}
					System.out.println("클라이언트 quit");
					pw.close();
					pw.flush();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
