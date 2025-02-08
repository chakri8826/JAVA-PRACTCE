public class Outpass {
    String id;
    String name;
    int maxLeaves;
    String reason;
    public Outpass(String n,String id,int l,String r)
    {
        this.id=id;
        this.name=n;
        this.maxLeaves=l;
        this.reason=r;
    }
    public String toString()
    {
        return " Name:"+name+" ID:"+id+" MaxLeaves:"+maxLeaves+" Reason:"+reason;
    }
}
