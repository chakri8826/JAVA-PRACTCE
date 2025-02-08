package src;
class MyMainEmployee{
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
    public MyMainEmployee(){
        id = 6666;
        name = "Sundar Raja";
    }
    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }
    public MyMainEmployee(String myName){
        id = 456789;
        name = myName;
    }
}

public class CH9_02_Constructors {
    public static void main(String[] args) {
//        MyMainEmployee mme = new MyMainEmployee();
//        MyMainEmployee mme = new MyMainEmployee("Chakriramova",555);
        MyMainEmployee mme = new MyMainEmployee("hii");
        //mme.setName("K Chakradhar");
//        mme.setId(777);
        System.out.println(mme.getName());
        System.out.println(mme.getId());


    }
}
