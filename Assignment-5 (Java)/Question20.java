import java.util.Scanner;

public class Question20 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //   Write program to create a class Student having member variable name, rn, age. Add required set, get and constructer to Student class. Crate an array of student object and sort it according to rn in ascending order.
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < arr.length; i++) {
            String name = sc.next();
            int rn = sc.nextInt();
            int age = sc.nextInt();
            arr[i] = new Student(name, rn, age);
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].rn > arr[j].rn) {
                    Student temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " " + arr[i].rn + " " + arr[i].age);
        }

    }
}

class Student {
    String name;
    int rn;
    int age;
    public Student(String name, int rn, int age) {
        this.name = name;
        this.rn = rn;
        this.age = age;
    }
}