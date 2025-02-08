public class Laptop{
    String model_Name;
    String serial_No; 
    float price;  
    Laptop next;
    public Laptop(String mn,String sn,float price)
    {
        this.model_Name=mn;
        this.serial_No=sn;
        this.price=price;
        this.next=null;
    }
    public String toString()
    {
        return "ModelName:"+model_Name+" Serial No:"+serial_No+" Price:"+price;
    }
}