package Ch18.socket03;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    private static final String SERVER_IP = "localhost";
    private static final int SERVER_PORT = 5001;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket();
            socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

            System.out.println("[서버에 연결되었습니다.]");

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();
            Scanner scanner = new Scanner(System.in);

            System.out.print("닉네임을 입력하세요: ");
            String nickname = scanner.nextLine();
            os.write(nickname.getBytes("UTF-8"));

            Thread receiverThread = new Thread(() -> {
                try {
                    byte[] buffer = new byte[1024];
                    int length;

                    while ((length = is.read(buffer)) != -1) {
                        String message = new String(buffer, 0, length, "UTF-8");
                        System.out.println(message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            receiverThread.start();

            System.out.println("채팅을 시작합니다. 종료를 원하시면 q를 입력하세요.");

            while (true) {
                String message = scanner.nextLine();
                os.write(message.getBytes("UTF-8"));
                os.flush();

                if ("q".equals(message)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}