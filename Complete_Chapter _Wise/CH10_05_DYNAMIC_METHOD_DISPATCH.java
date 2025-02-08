package src;
class Phone{
    public void shotTime(){
        System.out.println("Show is at 8 am");
    }
    public void On(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{
    public void Music(){
        System.out.println("Playing the music...");
    }
    @Override
    public void On(){
        System.out.println("Turning on Smart Phone...");
    }
}
public class CH10_05_DYNAMIC_METHOD_DISPATCH {
    public static void main(String[] args){
//        Phone obj = new Phone();
//        SmartPhone smart = new SmartPhone();


        Phone obj = new SmartPhone();
//        SmartPhone obj2 = new Phone();  // Not Allowed   because super class can be reference to a subclass
                                        // but subclass cannot be reference to a super class....

        obj.shotTime();
        obj.On();
//        obj.Music(); //Not Allowed
    }
}
