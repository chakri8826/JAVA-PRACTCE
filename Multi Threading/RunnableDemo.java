class MyThread implements Runnable{
	int n;
	String name;
	MyThread(int a,String s){
		this.n=a;
		this.name=s;
	}
	public void run(){
		for(int i=0;i<n;i++){
			System.out.println("Thread Name: "+name+i);
		}
	}
}


class RunnableDemo{
	public static void main(String args[]){
		MyThread m1 =  new MyThread(10,"Chakri");
		MyThread m2 =  new MyThread(10,"Cherry");
		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);
		t1.start();
		t2.start();
		 
	}
}












