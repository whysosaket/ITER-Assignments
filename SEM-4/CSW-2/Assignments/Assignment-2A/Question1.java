import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();        
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        
        // Display the list
        System.out.println(list);

        // Ask user to enter a number and search if the number is present in the list
        int n = sc.nextInt();
        if(list.contains(n)) {
            System.out.println("The number is present in the list");
        } else {
            System.out.println("The number is not present in the list");
        }

        // Remove element from a asked position
        int pos = sc.nextInt();
        list.remove(pos);
        System.out.println(list);

        // Check if the list is empty
        if(list.isEmpty()) {
            System.out.println("The list is empty");
        } else {
            System.out.println("The list is not empty");
        }
    }
}
