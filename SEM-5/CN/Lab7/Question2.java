import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class Question2 {
    public static void main(String[] args) {
        String serverHost = "time.nist.gov";
        int serverPort = 13;

        try {
            Socket socket = new Socket(serverHost, serverPort);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response;
            while ((response = reader.readLine()) != null) {
                System.out.println(response);
            }
            reader.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
