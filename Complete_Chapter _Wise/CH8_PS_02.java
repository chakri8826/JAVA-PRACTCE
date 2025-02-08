package src;

class cellphones{
    public void ring(){
        System.out.println("Ringing");
    }
    public void vibrate(){
        System.out.println("Vibrating");
    }
    public void callfriend(){
        System.out.println("Calling a friend");
    }

}

public class CH8_PS_02 {
    public static void main(String[] args){
        cellphones cp = new cellphones();
        cp.ring();
        cp.vibrate();
        cp.callfriend();
    }
}
