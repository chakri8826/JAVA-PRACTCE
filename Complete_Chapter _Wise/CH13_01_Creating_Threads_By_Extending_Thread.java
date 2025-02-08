package src;
class MyThread1 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("My Thread1 is running");
            System.out.println("Iam Happy");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i=0;
        while(i<2000){
            System.out.println("My Thread2 is running");
            System.out.println("Iam Sad");
            i++;
        }
    }
}
public class CH13_01_Creating_Threads_By_Extending_Thread {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();

    }
}

