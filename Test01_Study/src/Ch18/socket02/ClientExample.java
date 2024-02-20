package Ch18.socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
// SoverSocket 서버, accept() 사용해 연결 요청을 수락하고 소켓 생성
// 연결이 수락되면
// Socket 객체 생성하여 통신을 담당
// 클라이언트와 서버 간의 통신 담당
// 특정호스트의 특정포트로 연결 시도함
// InputStream과 OutputStream을 통해 데이터를 주고받음
// connect :(서버의 주소와 포트에)연결요청보냄. (클라이언 소켓이 -> 서버소캣에 연결)
// InetSocketAddress : 소켓 주소를 나타탬, IP 주소와 포트 번호의 조합으로 소켓을 식별함.


// 연결 요청
public class ClientExample {
	public static void main(String[] args) {
		/* Socket socket = new Socket(); 객체 생성 후 바로 초기화
		 * 하지 않는 이유 예외 발생할 수 있어 선언 후 초기값으로 null을 주고
		 * 나중에 명시적으로 생성하고 초기화 한다. 
		 * */
		Socket socket = null;
		
		try {
			socket = new Socket(); // 명시적 생성 후 초기화
			
			System.out.println("[ 연결 요청 ]");
			socket.connect(new InetSocketAddress("localhost",5001));
			System.out.println("[ 연결 성공 ]");
			
			byte[] bytes = null;
			String message = null;
			
			//OutputStream: 추상클래스이며 바이트기반 입출력, 상속받은 하위클래스를 통해 입출력 작업을 함
			//socket.getOutputStream: 해당 소켓과 연결된 출력 스트림을 반환, 이 출력스트림은 데이터를 전송함
			//getOutputStream() : 소켓에 대한 출력 스트림을 얻기 위한 메서드
			
			OutputStream os = socket.getOutputStream();// 출력스트림으로, 기능:데이터를 서버로 보내기
			//OutputStream은 출력 스트림을 나타내는 추상 클래스이며, 
			//getOutputStream()은 Socket에서 실제로 사용 가능한 출력 스트림을 얻기 위한 메서드
			
			message = "Hello Server";
			bytes = message.getBytes("UTF-8"); // 문자열을 UTF-8문자 인코딩을 사용해 바이트 배열로 변환
			os.write(bytes); // 출력스트림을 이용하여 바이트 배열을 서버로 전송
			os.flush(); // 출력스트림 버퍼를 비워서 모든 데이터를 서버로 전송
			System.out.println("[데이터 보내기 성공]" );

			
			InputStream is = socket.getInputStream();// 입력스트림 얻기
			bytes = new byte[100]; //배열을 생성해 서버로부터 받은 데이터를 저장할 용도
			int readByteCount = is.read(bytes);// 서버로부터 데이터를 읽어와 바이트 배열에 저장되며 읽은 바이트 수는 readByteCount에 저장함
			message = new String(bytes, 0, readByteCount, "UTF-8");// 바이트 배열에서 읽은 데이터를 문자열로 변환하며 0부터 readByteCount까지 바이트를 변환.
			System.out.println("[데이터 받기 성공]: " + message);
			
			
			os.close();
			is.close();
			} catch(Exception e) {
				e.printStackTrace();
			};
			if(!socket.isClosed()) {
				try {
					socket.close();
				}catch(IOException ie) {
					ie.printStackTrace();
				}
			}
	}
}
