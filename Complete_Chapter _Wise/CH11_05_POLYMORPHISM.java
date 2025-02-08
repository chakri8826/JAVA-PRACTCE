package src;
interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning...");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording in 4k....");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
    void CallNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
//
}

class MySmartPhone2 extends MyCellPhone2 implements MyWifi2,MyCamera2{
    public void takeSnap(){
        System.out.println("Taking a Snap....");
    }
    public void recordVideo(){
        System.out.println("Taking a Snap....");
    }
    //    public void record4kVideo(){
//        System.out.println("Taking a Snap and Recording in 4k....");
//    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] networkList = {"Chakri","cheryy","chakradhar"};
        return networkList;
    }
    public void connectToNetwork(String network){
        System.out.println("Connecting to "+network);
    }
    public void sampleMeth(){
        System.out.println("Meth..");
    }
}
public class CH11_05_POLYMORPHISM {
    public static void main(String[] args){
        MyCamera2 cam1 = new MySmartPhone2(); //This is a smartPhone but please use it as camera only
//        cam1.getNetworks();    ----> Not Allowd.
//        cam1.sampleMeth();     ----> Not Allowd.

//        cam1.record4kVideo();
//        cam1.takeSnap();
        MySmartPhone2 sp = new MySmartPhone2();
//        sp.sampleMeth();
//        sp.CallNumber(12345);
//        sp.pickCall();
//        sp.takeSnap();
//        sp.connectToNetwork("chakri");
        String[] nl=sp.getNetworks();
        for(String item:nl){
            System.out.println(item);
        }

    }
}
