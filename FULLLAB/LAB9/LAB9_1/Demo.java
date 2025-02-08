public class Demo {
    public static void main(String[] args) {
        StudentBuffer s=new StudentBuffer();
        Registrar r=new Registrar(s,3);
        Validator v=new Validator(s,3);
        r.start();
        v.start();
    }
    
}
 
