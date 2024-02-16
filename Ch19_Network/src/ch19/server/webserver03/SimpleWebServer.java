package ch19.server.webserver03;

//필요한 입출력 및 네트워크 관련 기능을 사용하기 위한 Java 클래스들을 임포트합니다.
import java.io.BufferedReader;         // 문자 입력 스트림에서 문자를 읽기 위한 클래스
import java.io.FileReader;             // 파일에서 문자를 읽기 위한 클래스
import java.io.InputStream;            // 바이트 입력 스트림에서 바이트를 읽기 위한 클래스
import java.io.InputStreamReader;      // 바이트 입력 스트림에서 문자를 읽기 위한 클래스
import java.io.OutputStream;           // 바이트 출력 스트림에서 바이트를 쓰기 위한 클래스
import java.io.OutputStreamWriter;    // 바이트 출력 스트림에서 문자를 쓰기 위한 클래스
import java.io.PrintWriter;            // 텍스트 출력 스트림에서 문자를 쓰기 위한 클래스
import java.net.InetAddress;          // IP 주소를 나타내는 클래스
import java.net.ServerSocket;         // 서버 소켓을 나타내는 클래스
import java.net.Socket;               // 소켓을 나타내는 클래스

public class SimpleWebServer {
	public static void main(String[] args) {
		final int PORT = 80; // http는 디폴트로 80포트를 사용
		try {
			// 현재 서버 프로세스가 동작하는 환경의 ip 주소를 자동으로 할당
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			while (true) {
				System.out.printf("<서버-%s>브라우저 접속을 대기합니다...\n", mainThreadName);
				Socket socket = serverSocket.accept();
				System.out.printf("<서버-%s>새로운 쓰레드 시작합니다~\n", mainThreadName);
				HttpThread ht = new HttpThread(socket);
				ht.start();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

class HttpThread extends Thread {
	private Socket socket;

	public HttpThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		try {
			InetAddress inetAddr = socket.getInetAddress();
			System.out.printf("<서버-%s>%s로부터 접속했습니다.\n", getName(), inetAddr.getHostAddress());
			OutputStream out = socket.getOutputStream();
			InputStream in = socket.getInputStream();
			PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			/*브라우저가 요청한 파일 찾기*/
			String line = br.readLine();
			System.out.println("line=" + line);
			int start = line.indexOf(" ") + 2;
			int end = line.lastIndexOf("HTTP") - 1;
			System.out.println("start=" + start + ", end=" + end);
			String fileName = line.substring(start, end);
			System.out.println("fileName=" + fileName);
			if(fileName.equals(""))
				fileName = "index.html";
			System.out.printf("<서버-%s>사용자가 %s를 요청했습니다\n", getName(), fileName);
			
			/*요청한 파일을 읽어서 브라우저에 전달하기*/
			BufferedReader fileBr = new BufferedReader(new FileReader(fileName));
			String fileLine;
			while(true) {
				fileLine = fileBr.readLine();
				if(fileLine==null)
					break;
				pw.println(fileLine);
				pw.flush();
			}
			System.out.printf("<서버-%s>브라우저에 %s를 전송했습니다\n", getName(), fileName);
			
			fileBr.close();
			pw.close();
			br.close();
			
		} catch (Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
		}

	}
}
