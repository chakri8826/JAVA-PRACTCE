public class Buffer {
    Outpass o;
    boolean issued;

    public synchronized void push(Outpass o) 
    {
        if (issued) 
        {
            try 
            {
                wait();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        this.o = o;
        issued=true;
        notify();
    }

    public synchronized Outpass pop() {
        if(!issued)
        {
            try 
            {
                wait();
            } 
            catch (Exception e) 
            {
                System.out.println(e);
            }
        }
        issued=false;
        notify();
        return this.o;
    }

}