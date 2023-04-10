import java.util.TreeMap;

public class Question2 {
    public static void main(String[] args) {
        TreeMap<String, Address> map = new TreeMap<String, Address>();
        map.put("A", new Address(1, "Park", "Nahi Karna Chaiyea"));
        map.put("B", new Address(2, "Dark", "PosterBoy"));
        map.put("C", new Address(3, "Mark", "Lol"));

        // Display the map as key-value pairs
        System.out.println(map);

    }
}

class Address{
    int plotnumber;
    String at;
    String post;

    public Address(int plotnumber, String at, String post) {
        this.plotnumber = plotnumber;
        this.at = at;
        this.post = post;
    }

    @Override
    public String toString() {
        return "Address [at=" + at + ", plotnumber=" + plotnumber + ", post=" + post + "]";
    }
}