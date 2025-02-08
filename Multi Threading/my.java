class Cse extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("Thread");
		}
	}
}

class my{
	public static void main(String[] args){
		Cse c = new Cse();
		c.start();   //thread createds
		for(int i=0;i<10;i++){
			System.out.println("Main");
		}
	
	
	}


}
