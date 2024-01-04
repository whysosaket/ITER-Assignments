import java.io.*;
import java.net.Socket;

public class Question1 {
    public static void main(String[] args) throws IOException {
        String serverHostname = "localhost";
        int port = 6789;

        try (Socket clientSocket = new Socket(serverHostname, port)) {
            DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String sentence = "Hello, server!";
            outToServer.writeBytes(sentence + '\n');
            String modifiedSentence = inFromServer.readLine();
            System.out.println("FROM SERVER: " + modifiedSentence);
        }
    }
}
