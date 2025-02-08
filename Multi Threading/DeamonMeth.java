class Cse extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		}
		catch(Exception e){
			System.out.println("Interupt Occured");  
		}
	}
}

class DeamonMeth{
	public static void main(String[] args) throws Exception{
		/*System.out.println(Thread.currentThread().isDaemon());
		//Thread.currentThread().setDaemon(true);   //false we cannot make executing thread to daemon thread
		
		Cse c = new Cse();
		System.out.println(c.isDaemon());	  // false Inherited from parent so non daemon thread
		
		c.setDaemon(true); 
		System.out.println(c.isDaemon());	 //true
		*/
		
		Cse c = new Cse();
		c.setDaemon(true); 
		c.start();
		Thread.sleep(2000);
		System.out.println("End of main thread");  // This terminates all daemon threads when it is executed. 
		
		
		
	}




}
