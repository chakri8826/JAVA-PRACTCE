class Cse extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Child Thread");
		
			//Thread.yield();   // pause and play Main Thread
			try{
				Thread.sleep(3000);
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}
}

class ImpMethods{
	public static void main(String[] args) throws InterruptedException{
		Cse c = new Cse();
		c.start();   //thread created.
		
		//c.join(); // main thread will wait until c thread completion its execution, after that it starts executing.
		c.join(10000); //main thread will wait for 10 seconds.
		
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	
	
	}
}



