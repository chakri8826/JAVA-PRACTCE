package src;
interface Bicycle{
    int b = 45;
    void applyBreak(int decrement);
    void applySpeed(int increment);
}
interface HornHeroes{
    void blowSRK();
    void blowRT();
}
class AvonCycle implements Bicycle,HornHeroes{
    void blowHorn(){
        System.out.println("Ready.... Tananananananantantanatnaaaaa");
    }
    public void applyBreak(int decrement){
        System.out.println("Applying Break....");
    }
    public void applySpeed(int increment){
        System.out.println("Applying Spped Up....");
    }
    public void blowSRK(){
        System.out.println("SHAH RUKH KHAN bhai blow hornn....");
    }
    public void blowRT(){
        System.out.println("RAVITEJA anna mass hornn kottuuu......");
    }
}

public class CH11_02_Interfaces {
    public static void main(String[] args){
        AvonCycle cycle1 = new AvonCycle();
//        cycle1.applyBreak(2);

        //You can create properties in interfaces
        System.out.println(cycle1.b);

        //You cannot modify the properties in interfaces as they are final
//        cycle1.a = 99;
//        System.out.println(cycle1.a);
//        cycle1.blowSRK();
//        cycle1.blowRT();
    }
}
