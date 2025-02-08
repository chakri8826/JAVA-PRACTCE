class Cse implements Runnable{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread");
		}
	}
}

class myRunnable{
	public static void main(String[] args){
		Cse c = new Cse();
		Thread t1 = new Thread(c);
		t1.start();   //thread createds
		for(int i=0;i<10;i++){
			System.out.println("Main");
		}
	
	
	}
}
