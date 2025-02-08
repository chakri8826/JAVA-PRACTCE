class FirstThread extends Thread{
	String msg;
	FirstThread(String s){
		this.msg=s;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("Msg from first Thread: "+msg+" "+i);
		}
	}
}

class SecondThread extends Thread{
	String msg;
	public void setMsg(String s){
		this.msg=s;
	}
	
	public void run(){
		for(int i=0;i<20;i++){
			System.out.println("Msg from Second Thread: "+msg+" "+i);
		}
	}
}

class ThreadDemo{
	public static void main(String args[]){
		FirstThread f1 = new FirstThread("Chakri");
		SecondThread s1 = new SecondThread();
		s1.setMsg("MEthod nundi ra");
		f1.setPriority(10);
		f1.start();
		s1.start();
		System.out.println("First Thread Priority: "+f1.getPriority());
		System.out.println("Second Thread Priority: "+s1.getPriority());	 
	}






}
