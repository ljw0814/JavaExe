package Ch18.socket03;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    private static final int PORT = 5001;
    private static final List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", PORT));

            System.out.println("[채팅 서버 시작]");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class ClientHandler implements Runnable {
        private final Socket socket;
        private final String nickname;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            this.nickname = receiveNickname();
        }

        private String receiveNickname() {
            try {
                InputStream is = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int length = is.read(buffer);
                String nickname = new String(buffer, 0, length, "UTF-8");
                System.out.println("[클라이언트 입장] " + nickname);
                broadcast(nickname + " 님이 입장하셨습니다.");
                return nickname;
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        public void run() {
            try {
                InputStream is = socket.getInputStream();
                byte[] buffer = new byte[1024];
                int length;

                while ((length = is.read(buffer)) != -1) {
                    String message = new String(buffer, 0, length, "UTF-8");
                    System.out.println("[받은 메시지] " + message);
                    if ("q".equals(message)) {
                        break;
                    }
                    broadcast(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("[클라이언트 퇴장] " + nickname);
                clients.remove(this);
                broadcast(nickname + " 님이 퇴장하셨습니다.");
            }
        }

        private void broadcast(String message) {
            for (ClientHandler client : clients) {
                try {
                    OutputStream os = client.socket.getOutputStream();
                    os.write((nickname + ": " + message).getBytes("UTF-8"));
                    os.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}