package src;
interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void CallNumber(int phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting....");
    }
//
}

class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera{
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
}
public class CH11_03_Default_Methods {
    public static void main(String[] args){
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVideo();
//        ms.greet();  ----> Throws an error
        String[] ar = ms.getNetworks();
        for(String item:ar){
            System.out.println(item);
        }


    }
}
