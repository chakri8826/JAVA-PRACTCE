package src;
class sphere{
    private int radius;
    public sphere(int radius){
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4*3.14*radius*radius;
    }
    public double volume(){
        return (4d/3d)*3.14*radius*radius*radius;
    }
}

public class CH9_PS_5 {
    public static void main(String[] args){
        sphere sp = new sphere(5);
//        sp.setRadius(4);
        System.out.println(sp.getRadius());
        System.out.println(sp.surfaceArea());
        System.out.println(sp.volume());
    }
}
