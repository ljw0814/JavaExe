package Ch18.socket01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
// SoverSocket 서버, accept() 사용해 연결 요청을 수락하고 소켓 생성
// 연결이 수락되면
// Socket 객체 생성하여 통신을 담당
// 클라이언트와 서버 간의 통신 담당
// 특정호스트의 특정포트로 연결 시도함
// InputStream과 OutputStream을 통해 데이터를 주고받음


// 연결 요청
public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		try {
			System.out.println("1. 연결 요청하는 Socket생성");
			socket = new Socket();
						
			System.out.println("2. connect를 이용해 소켓 연결");
		
			// connect :(서버의 주소와 포트에)연결요청보냄. (클라이언 소켓이 -> 서버소캣에 연결)
			// InetSocketAddress : 소켓 주소를 나타탬, IP 주소와 포트 번호의 조합으로 소켓을 식별함.
			socket.connect(new InetSocketAddress("localhost",5001));;
			System.out.println("3. Socket 연결 성공!! ");
		}catch(Exception e) {
			e.printStackTrace();	
		};
		if(!socket.isClosed()) {// 소캣이 연결되어 있을 경우
			try {
				socket.close();
			}catch(IOException e2) {
				e2.printStackTrace();
			}
		}
	}
}
