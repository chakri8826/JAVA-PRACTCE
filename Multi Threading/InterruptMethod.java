class Cse extends Thread{
	public void run(){
		try{
			for(int i=0;i<10;i++){
				System.out.println("Child Thread");
				Thread.sleep(3000);
			}
		}
		catch(Exception e){
			System.out.println("Interupt Occured");  
		}
	}
}


class InterruptMethod{
	public static void main(String[] args) throws InterruptedException{
		Cse c = new Cse();
		c.start();   //thread created.
		c.interrupt();    // child Thread print ayyetappudu slow ga print 
				//avutundi apudu aa time lo interrupt execute ayyi catch block catch chestundi
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	}
}




