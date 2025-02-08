class Cse extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread");
		}
	}
}

class ThreadMethods{
	public static void main(String[] args){
		System.out.println("Present executing Thread is: "+Thread.currentThread().getName());   //getting name of the thread
		Cse c = new Cse();  //Thread-0
		System.out.println("Allocated executing Thread is: "+c.getName());	
			
		Thread.currentThread().setName("chakri"); //Renaming Main Thread.
		System.out.println("Present executing Thread is: "+Thread.currentThread().getName());		
		//System.out.println(10/0); // checking whether thread is renamed or not by an error
		
		System.out.println("Present executing Thread Priority is: "+Thread.currentThread().getPriority());  //getting priority of the thread
 
 		System.out.println("Allocated executing Thread Priority is: "+c.getPriority());	//Inherited priority from parent
 		c.setPriority(8);
 		System.out.println("Allocated executing Thread Priority is: "+c.getPriority());	
			
		c.setName("Cherry");
		System.out.println("Allocating executing Thread name is: "+c.getName());				
	
	
		
	}


}


