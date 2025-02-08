package src;

import org.w3c.dom.ls.LSOutput;

class A{
    public int a;
    public int chakri(){
        return 10;
    }
    public void meth2(){
        System.out.println("Iam method 2 of class A");
    }
}

class B extends A{
    @Override
    public void meth2(){
        System.out.println("Iam method 2 of class B");
    }
    public void meth3(){
        System.out.println("Iam method 3 of class B");
    }


}

public class CH10_04_Method_Overriding {
    public static void main(String[] args){
//        A a = new A();
//        System.out.println(a.chakri());


//        B b = new B();
//        b.meth2();

    }
}
