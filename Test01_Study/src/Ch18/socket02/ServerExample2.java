package Ch18.socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

//SoverSocket 서버, accept() 사용해 연결 요청을 수락하고 소켓 생성
//연결이 수락되면
//Socket 객체 생성하여 통신을 담당
//클라이언트와 서버 간의 통신 담당
//특정호스트의 특정포트로 연결 시도함
public class ServerExample2 {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		// try while문 사용 이유: 
		// 서버가 클라이언트의 연결을 수락하고 대기상태로 유지하기 위함
		try {// 예외발생 위험 코드
			serverSocket = new ServerSocket();
			
			// bind : 클라이언트의 요청을 받을 준비를 함
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			
			while(true) {// 무한히 대기하기 위해 무한루프 사용
				System.out.println("[연결 기다림]");
				// .accept() 클라이언트 연결 요청이 들어오기까지 기다림,
				Socket socket = serverSocket.accept();
				
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				// 연결 시도 시 소켓 객체를 반환함
				// () 캐스팅 문법: 형변환
				// getRemoteSocketAddress() 메서드: Socket(이 연결된)객체에서 원격 소켓 주소(호스트)를 얻는 메서드
				// 서버측에서 상대편(클라이언트) 소켓의 원격주소를 얻을 때 사용
				// 반환 값은 SocketAddress타입(인스턴스)이나, InetSocketAddress의 인스턴스임.
	
	
				// 코드 로직
				// socket.getRe~~s(): 현재 소캣의 원격주소를 얻어옴, 반환 값 SocketAddress
				// (InetSocketAddress): 얻어온 주소를 InetSocketAddress타입으로 형변환
				// @ SocketAddress 인터페이스, InetSocketAddress는 SocketAddress를 구현한 클래스
				// isa변수에 원격 소켓 ip주소나 Port번호 저장 
				System.out.println("연결 수락함"+isa.getHostName());	
				
				byte[] bytes = null;
				String message = null;
				
				InputStream is = socket.getInputStream(); // 입력스트림
				bytes = new byte[100];
				int readByteCount = is.read(bytes); // 한번의 하나의 바이트만 읽어, 바이트 개수를 읽음	
				message = new String(bytes, 0, readByteCount, "UTF-8");
				System.out.println("[데이터 받기 성공]" + message);
				
				/* 읽어온 바이트 배열을 문자열로 변환함
				 * String 클래스의 생성자를 이용하여 바이트 배열을 문자열로 변환하는데, 
				 * 여기서 0은 시작 오프셋, readByteCount는 읽어온 바이트의 수, 
				 * "UTF-8"은 문자 인코딩을 나타냅니다.*/
				OutputStream os = socket.getOutputStream();
				message = "Hello Client";
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				System.out.println("[데이터 보내기 성공]");
				
				is.close();
				os.close();
				socket.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			if(!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				}catch(IOException ie) {
					ie.printStackTrace();
				}
		}	
	}
}
