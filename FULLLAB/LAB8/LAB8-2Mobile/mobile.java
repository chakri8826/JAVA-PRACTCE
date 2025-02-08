public class mobile {
    String company_Name;
    String model_Name;
    float price;
    mobile next;
    public mobile(String cName,String mName,float price)
    {
        this.company_Name=cName;
        this.model_Name=mName;
        this.price=price;
        this.next=null;
    }
    public String toString()
    {
        return "Company Name:"+company_Name+" Model name:"+model_Name+" Price:"+price;
    }
}

