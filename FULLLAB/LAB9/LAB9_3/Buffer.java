public class Buffer {
    Customer c;
    boolean present;
    public synchronized void push(Customer c)
    {
        if(present)
        {
            try{
                wait();
            }catch(Exception e){}
        }
        this.c=c;
        present =true;
        notify();
    }
    public synchronized Customer pop()
    {
        if(!present)
        {
            try{
                wait();
            }catch(Exception e){}
        }
        present=false;
        notify();
        return c;
    }    
}
