import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Question2 {
    public static void main(String[] args) throws IOException {
        int port = 6789;
        try (ServerSocket welcomeSocket = new ServerSocket(port)) {
            System.out.println("Echo TCP Server is running on port " + port);
            while (true) {
                try (Socket connectionSocket = welcomeSocket.accept()) {
                    BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
                    DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
                    String clientSentence = inFromClient.readLine();
                    System.out.println("Received: " + clientSentence);
                    outToClient.writeBytes(clientSentence + '\n');
                }
            }
        }
    }
}
