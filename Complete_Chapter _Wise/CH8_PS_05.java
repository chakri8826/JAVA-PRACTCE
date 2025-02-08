package src;
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}
public class CH8_PS_05 {
    public static void main(String[] args){
        Tommy game = new Tommy();
        game.hit();
        game.fire();
        game.run();
    }

}
