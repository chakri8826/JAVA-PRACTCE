public class Demo {
    public static void main(String[] args) {
        Buffer c=new Buffer();
        Receptionist r=new Receptionist(c);
        BookKeeper b=new BookKeeper(c);
        r.start();
        b.start();
    }
    
}
