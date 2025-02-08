class Cse extends Thread{
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println("Child Thread");
		}
	}
}

class SettingPriority{
	public static void main(String[] args){
		Cse c = new Cse();
		c.setPriority(1);         //main thread executes first and then Child Thread.
		c.start();   //thread created
		for(int i=0;i<5;i++){
			System.out.println("Main Thread");
		}
	
	
	}
}
