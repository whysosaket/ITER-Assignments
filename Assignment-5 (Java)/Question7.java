import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //  Write a program which read a name and date of birth (DOB) create a password which consist of the first two latter of the name and month from DOB.
        String name = sc.nextLine();
        String dob = sc.nextLine();
        String[] arr = dob.split("/");
        String password = name.substring(0, 2) + arr[1];
        System.out.println(password);
    }
}