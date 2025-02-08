package src;
class MyEmployees{
    private int id;
   private String name;
   public String getName(){
       return name;
   }
   public void setName(String n){
       this.name = n;
   }
   public int getId(){
       return id;
   }
   public void setId(int i){
       this.id = i;
   }
}

public class CH9_01 {
    public static void main(String[] args){
         MyEmployees my = new MyEmployees();
//         my.id = 999;
//         my.name = "Random";   --> Throws an error due to private access modifier

         my.setName("Kommu Chakradhar");
        System.out.println( my.getName());
        my.setId(888);
        System.out.println(my.getId());

    }
}
