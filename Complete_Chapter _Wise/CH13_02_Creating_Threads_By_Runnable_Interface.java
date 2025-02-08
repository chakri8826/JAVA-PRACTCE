package src;
class MyRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Iam Thread1 from runnable1");
            i++;
        }
    }
}
class MyRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<500){
            System.out.println("Iam thread2 from runnable2");
            i++;
        }
    }
}
public class CH13_02_Creating_Threads_By_Runnable_Interface {
    public static void main(String[] args){
        MyRunnable1 bullet1 = new MyRunnable1();
        Thread gun1 = new Thread(bullet1);
        MyRunnable2 bullet2 = new MyRunnable2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
    }
}
