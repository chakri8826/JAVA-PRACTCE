class Some extends Thread{
	int total=0;
	public void run(){
		synchronized(this){
			for(int i=0;i<=10;i++){
				total+=i;
			}
			this.notify();
		}
	
	}
}

class Inter1{
	public static void main(String[] args) throws Exception{
		Some s = new Some();
		s.start();
		//Thread.sleep(1000);      //Making main thread sleep is not recommended approach.
		
		//s.join();      here main thread needs to wait until child thread completed execution (main thread should wait for only some lines 		but not fo all the lines so main thread cannot wait for all lines we cannot use join() )
		synchronized(s){
			s.wait(); //
			System.out.println("The sum is: "+s.total);
		}
			
		
		
			
	}
	
}
