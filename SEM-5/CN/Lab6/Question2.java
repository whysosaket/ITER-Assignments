import java.net.*;
import java.util.*;
import java.io.*;

public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String uri = sc.nextLine();

        try {
            URL url = new URL(uri);
            URLConnection connection = (HttpURLConnection) url.openConnection();
            connection.getContent();

            String encoding = connection.getContentEncoding();
            if (encoding == null) {
                encoding = "UTF-8";
            }

            InputStreamReader reader = new InputStreamReader(connection.getInputStream(), encoding);
            FileOutputStream file = new FileOutputStream("output.html");
            int ch;
            while ((ch = reader.read()) != -1) {
                file.write(ch);
            }
        } catch (Exception e) {
            System.out.println("Cookies are not allowed");
        }
    }

}
