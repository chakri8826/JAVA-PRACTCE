package src;
class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int v){
        this.a = v;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){
        super(c);
        System.out.println("Iam a Doclass Constructor..");
    }
}

public class CH10_03_THIS_SUPER {
    public static void main(String[] args){
//        Ekclass e = new Ekclass(5);
        Doclass d = new Doclass(44);
        System.out.println(d.getA());
    }
}
