package src;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

abstract class pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends pen{
    public void write(){
        System.out.println("Writing is a good habit");
    }
    public void refill(){
        System.out.println("refilling is necessary");
    }
    public void changenib(){
        System.out.println("Change the nib");
    }
}


class monkey{
    public void jump(){
        System.out.println("Iam Jumping...");
    }
    public void bite(){
        System.out.println("Biting is my hobby..");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements BasicAnimal{
    @Override
    public void eat(){
        System.out.println("Eating is necessary for survival");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping is necessary");
    }
    public void speak(){
        System.out.println("I can speak ");
    }
}


abstract class telePhone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();


}
class SmartTelephone extends telePhone{
    public void ring(){
        System.out.println("Ringing..");
    }
    public void lift(){
        System.out.println("Lifting..");
    }
    public void disconnect(){
        System.out.println("disconnecting..");
    }
    public void ST(){
        System.out.println("Iam SmartTelephone");
    }

}


interface tvRemote{
    void changechannel();
    void increaseVol();
}
interface smartTvRemote extends tvRemote{
    void netflix();
    void youtube();
}
class Tv implements smartTvRemote{
    public void changechannel(){
        System.out.println("Changing the channel....");
    }
    public void increaseVol(){
        System.out.println("Increasing the volume");
    }
    public void netflix(){
        System.out.println("Opening netflix");
    }
    public void youtube(){
        System.out.println("opening youtube..");
    }
}
public class CH11_PS {
    public static void main(String[] args){
        //Problem 1&2
//        FountainPen cp = new FountainPen();
//        cp.write();
//        cp.refill();
//        cp.changenib();

        //Problem3
//        Human h = new Human();
//        h.jump();
//        h.bite();
//        h.eat();
//        h.sleep();

        //Problem4
//        telePhone te = new SmartTelephone();
//        te.ring();
//        te.lift();
//        te.ST();   --> Throws Error....

        //Problem5
//        monkey m = new Human();
//        m.bite();
//        m.jump();
//        m.speak()    --> Cannot use because speak method because the reference is monkey which does not have speak method

        //Problem7
        Tv tv = new Tv();
        tv.changechannel();
        tv.increaseVol();
        tv.netflix();
        tv.youtube();


    }
}
