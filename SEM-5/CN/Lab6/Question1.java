import java.net.*;
import java.util.*;

//WAP to show a simple Cookie Policy that blocks cookies from .gov domains, but allows others.
public class Question1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter URL: ");
        String uri = sc.nextLine();

        try {
            CookieManager manager = new CookieManager();
            CookieHandler.setDefault(manager);
            URL url = new URL(uri);
            URLConnection connection = (HttpURLConnection) url.openConnection();
            connection.getContent();

            manager.setCookiePolicy(new NoGovernmentCookies());
            List<HttpCookie> cookies = manager.getCookieStore().getCookies();
            for (HttpCookie cookie : cookies) {
                System.out.println("DOMAIN: "+cookie.getDomain());
                System.out.println(cookie);
            }
        } catch (Exception e) {
            System.out.println("Cookies are not allowed");
        }
    }

}

class NoGovernmentCookies implements CookiePolicy {
    @Override
    public boolean shouldAccept(URI uri, HttpCookie cookie) {
        System.out.println("Checking: " + uri.getHost() + " " + cookie);
        if (uri.getHost() != null && uri.getHost().toLowerCase().endsWith(".gov")) {
            System.out.println("Cookies are not allowed for " + uri.getHost());
            return false;
        }
        return true;
    }
}
