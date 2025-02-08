package src;
class Animal{
    String a;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Animal(){
        System.out.println("Iam a class animal");
    }
}
class dog extends Animal{
    public dog(){
        System.out.println("Iam a dog, and I am inside of dog class which is extended from Animal class");
    }
    public void bark(){
        System.out.println(" dog barks like Bow-Bow");
    }
}
public class CH10_QUICK_QUIZZ {
    public static void main(String[] args){
        dog d = new dog();
        d.setA("Lion");
        System.out.println(d.getA());
        d.bark();

    }
}
