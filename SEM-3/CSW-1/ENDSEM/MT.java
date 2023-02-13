package ENDSEM;

public class MT {
    public static void main(String[] args) {
        // Multi Threading using Threadable class class
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.start();
        t2.start();
    }


}

class MyThread1 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread1 is running");
            System.out.println("1111111");
        }
        
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        while(true){
            System.out.println("My thread2 is running");
            System.out.println("2222222");
        }
        
    }
}