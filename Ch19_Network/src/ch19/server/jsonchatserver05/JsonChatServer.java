package ch19.server.jsonchatserver05;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

/* 1) EchoServer
 *   - 서버소켓의 동작방식
 *   - 2개 이상의 소켓 필요(서버소켓(accpt), 통신소켓(send/recv))
 * 2) EchoMultiThreadServer
 * 	 - 병렬 처리를 위해 Client 1개당 Thread 1개를 배정
 * 3) JsonChatServer
 *   - 다양한 업무 처리를 위해서 Json 포맷 사용(패킷)
 *   - 채팅은 1사람한테 수신된 데이터를 다른 사람한테 전달해야 한다.
 *     그러므로 사용자 등록/관리가 필요하다. (HashTable=HashMap+동기화)
 * */
public class JsonChatServer {
	public static void main(String[] args) {
		final int PORT = 9000;
		Hashtable clientHt = new Hashtable(); // 접속자를 관리하는 테이블

		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			String mainThreadName = Thread.currentThread().getName();
			/* main thread는 계속 accept()처리를 담당한다 */
			while (true) {
				System.out.printf("[서버-%s] Client접속을 기다립니다...", mainThreadName);
				Socket socket = serverSocket.accept();

				/* worker thread는 Client와의 통신을 담당한다. */
				WorkerThread wt = new WorkerThread(socket, clientHt);
				wt.start();
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

/* [App 프로토콜 정의]
 * 1) 데이터는 '문자열' 데이터로 한다.
 * 2) '문자열'데이터는 json을 변환한 것으로 한다.
 * 3) json 명령 패킷 종류
 *    - {}내의 데이터를 값을 의미한다.
 *   3-1) id등록
 *     id:{id값}
 *   3-2) 사칙 연산
 *     id:{id값}
 *     op:{연산자}
 *     val1:{첫번째값}
 *     val2:{두번째값}
 *   3-3) 전체 채팅
 *     id:{id값}
 *     youid:all
 *     msg:{문자메시지}
 *   3-4) 1:1 채팅
 *     id:{id값}
 *     youid:{상대id}
 *     msg:{문자메시지}
 * */

class WorkerThread extends Thread {
	private Socket socket;
	private Hashtable ht;

	public WorkerThread(Socket socket, Hashtable ht) {
		this.socket = socket;
		this.ht = ht;
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
			
			String line;
			while(true) {
				line = br.readLine();
				if(line == null)
					break;
				/*json패킷을 해석해서 알맞은 처리를 한다.*/
				
			}
		} catch (Exception e) {
			System.out.printf("<서버-%s>%s\n", getName(), e.getMessage());
		}
	}
}











