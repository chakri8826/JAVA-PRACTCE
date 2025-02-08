public class StudentBuffer {
    boolean present;
    Student s;
    public synchronized  void push(Student temp)
    {
        if(present)
        {
            try{
                wait();   
            }catch(Exception e){}
        }
        this.s=temp;
        present=true;
        notify();
    }
    public synchronized  Student pop()
    {
        if(!present)
        {
            try{
                wait();   
            }catch(Exception e){}
        }
        present=false;
        notify();
        return this.s;
    }
    
}
