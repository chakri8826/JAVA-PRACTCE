public class BSNL{
    String Subscriber_Id;
    String SubscriberName;
    float balance;
    BSNL next;
    public String toString()
    {
        return "Subscriber Id:"+Subscriber_Id+" Subscriber Name:"+SubscriberName+" Balance:"+balance;
    }
    public BSNL(String Sid,String Sname,float b)
    {
        this.Subscriber_Id=Sid;
        this.SubscriberName=Sname;
        this.balance=b;
        this.next=null;
    }
}