package ENDSEM;

public class MTC {
    public static void main(String[] args) {
        MTC1 t = new MTC1("Saket");
        System.out.println(t.getName());
        System.out.println(t.getId());
    }
}

class MTC1 extends Thread{
    MTC1(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thread is running!!");
    }
}