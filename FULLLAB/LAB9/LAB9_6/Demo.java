public class Demo {
    public static void main(String[] args) {
        Number n = new Number();
        Producer p = new Producer(n);
        Consumer c = new Consumer(n);
        p.start();
        c.start();
    }
}