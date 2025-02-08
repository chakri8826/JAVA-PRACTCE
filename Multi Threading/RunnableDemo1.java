class EvenThread implements Runnable{
	int n;
	EvenThread(int a){
		this.n=a;
		
	}
	public void run(){
		for(int i=0;i<n;i++){
			if(i%2==0){
				System.out.println("Even: "+i);
			}
		}
	}
}

class OddThread implements Runnable{
	int n;
	OddThread(int a){
		this.n=a;
		
	}
	public void run(){
		for(int i=0;i<n;i++){
			if(i%2!=0){
				System.out.println("Odd: "+i);
			}
		}
	}
}

class RunnableDemo1{
	public static void main(String args[]){
		EvenThread e1 = new EvenThread(100);
		OddThread o1 = new OddThread(100);
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(o1);
		t1.start();
		t2.start();
		System.out.println("When to Execute??");
		 
		 
	}






}




 
