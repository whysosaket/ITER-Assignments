import java.util.LinkedList;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();
        list.add(new Student("A", 20, 80.0));
        list.add(new Student("B", 21, 90.0));
        list.add(new Student("C", 22, 70.0));
        list.add(new Student("D", 23, 60.0));

        // Display the list
        System.out.println(list);

        // Ask user to enter a name and search if the name is present in the list
        String name = "A";
        for(Student s: list) {
            if(s.name.equals(name)) {
                System.out.println("The name is present in the list");
                break;
            }
        }

        // Remove an specified student from the list
        name = "B";
        for(Student s: list) {
            if(s.name.equals(name)) {
                list.remove(s);
                break;
            }
        }

        // Count the number of students in the list
        System.out.println(list.size());

    }
}

class Student{
    String name;
    int age;
    double marks;

    public Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
}