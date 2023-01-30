package ENDSEM;

public class MTRunnable {
    public static void main(String[] args) {
        MTR1 m1 = new MTR1();
        Thread t1 = new Thread(m1);

        MTR2 m2 = new MTR2();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();

    }
}

class MTR1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("This is a thread: MTR1");
        }
        
    }
}

class MTR2 implements Runnable{
    public void run(){
        for (int i = 0; i < 200; i++) {
            System.out.println("This is Thread: MTR2");   
        }
    }
}