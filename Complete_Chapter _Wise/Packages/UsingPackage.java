import Chakri.trying.Chakri_try2;
class Using extends Chakri_try2{
            void  meth2(){
            System.out.println(x);
            System.out.println(y);
            // System.out.println(z);
            // System.out.println(a);   
        }
    }
public class UsingPackage {
    public static void main(String[] args){
        System.out.println("Iam class Chakri's main methodss");

        //--> Accessing from world i.e., importing from another program.
        // Chakri_try2 c = new Chakri_try2();
        // System.out.println(c.x);
        // System.out.println(c.y);
        // System.out.println(c.z);
        // System.out.println(c.a);
        

         //--> Accessing from subclass i.e., inheriting another class from previous class
        Using u = new Using();
        u.meth2();

    }
}


