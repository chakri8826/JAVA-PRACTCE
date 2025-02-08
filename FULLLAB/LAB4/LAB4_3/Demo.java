public class Demo {
    public static void main(String[] args) {
        Grad g=new Grad("Revanth", "R200716", 98, 18, "Dmm");
        System.out.println("is passed :"+g.isPassed(g.grade));

        UnderGrad u=new UnderGrad("Ram", "R240724", 66, 14, "Dmm");
        System.out.println("is passed :"+u.isPassed(u.grade));
    }
    
}
