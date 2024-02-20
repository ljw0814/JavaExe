package Ch18.socket01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
//SoverSocket 서버, accept() 사용해 연결 요청을 수락하고 소켓 생성
//연결이 수락되면
//Socket 객체 생성하여 통신을 담당
//클라이언트와 서버 간의 통신 담당
//특정호스트의 특정포트로 연결 시도함
public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null; // ServerSocket클래스 초기화
		// try while문 사용 이유: 
		// 서버가 클라이언트의 연결을 수락하고 대기상태로 유지하기 위함
		try {// 예외발생 위험 코드
			serverSocket = new ServerSocket();
			System.out.println("연결 기다림");
			
			// bind : 클라이언트의 요청을 받을 준비를 함
			serverSocket.bind(new InetSocketAddress("localhost",5001));
			System.out.println("연결 성공");
			
		while(true) {// 무한히 대기하기 위해 무한루프 사용
			
			// .accept() 클라이언트 연결 요청이 들어오기까지 기다림,
			Socket socket = serverSocket.accept();

			// 연결 시도 시 소켓 객체를 반환함
			// () 캐스팅 문법: 형변환
			// getRemoteSocketAddress() 메서드: Socket객체에서 원격 소켓 주소를 얻는 메서드
			// 서버측에서 상대편(클라이언트) 소켓의 원격주소를 얻을 때 사용
			// 반환 값은 SocketAddress타입(인스턴스)이나, InetSocketAddress의 인스턴스임.
			InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
			// 코드 로직
			// socket.getRe~~s(): 현재 소캣의 원격주소를 얻어옴, 반환 값 SocketAddress
			// (InetSocketAddress): 얻어온 주소를 InetSocketAddress타입으로 형변환
			// @ SocketAddress 인터페이스, InetSocketAddress는 SocketAddress를 구현한 클래스
			// isa변수에 원격 소켓 ip주소나 Port번호 저장 
			System.out.println("연결 수락함"+isa.getHostName());		
		}
		//(예외종류 예외변수)
	}catch(Exception e) {// 배열 인덱스 오류, 캐스트 오류, Null 참조 
		 e.printStackTrace();// 오류 내용	
	}
		if(!serverSocket.isClosed()) {// 소캣이 닫혀있지 않을 경우
			try {
				serverSocket.close();
			}catch(IOException e1) {// 파일 읽기, 쓰기, 네트워크 통신 등 입출력 작업 예외처리
				e1.printStackTrace();// 오류 내용	
			}
		}
	}
	
}
