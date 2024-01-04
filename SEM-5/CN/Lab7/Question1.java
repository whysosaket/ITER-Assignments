import java.net.*;

public class Question1 {
    public static void main(String[] args) {
        String host = "facebook.com";
        int port = 80;

        try {
            Socket socket = new Socket(host, port);
            InetAddress localAddress = socket.getLocalAddress();
            int localPort = socket.getLocalPort();
            InetAddress remoteAddress = socket.getInetAddress();
            int remotePort = socket.getPort();
            System.out.println("Local Address: " + localAddress);
            System.out.println("Local Port: " + localPort);
            System.out.println("Remote Address: " + remoteAddress);
            System.out.println("Remote Port: " + remotePort);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
