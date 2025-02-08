class Display{
	public static synchronized void show(String name){
		for(int i=0;i<5;i++){
			System.out.println("Hello");
			try{
				Thread.sleep(2000);
				
			}
			catch(Exception e){
				System.out.println(e);
				
			}
			System.out.println(name);
		}
	}

}

class Cse extends Thread{
	Display d;
	String name;
	Cse(Display d,String name){
		this.d=d;
		this.name=name;
	}
	public void run(){
		d.show(name);
	}
}

class Synchro{
	public static void main(String[] args){
		Display d = new Display();    // obj for display class
		Cse c = new Cse(d,"chakri");	//child thread instantiated
		c.start();       //child thread created  (we have 2 threads now main and c)
		
		//Display d1 = new Display();  // creating second obj of d1
		//Cse c1 = new Cse(d1,"Chakradar");
		
		Cse c1 = new Cse(d,"Chakradar");
		c1.start();        //child thread created  (we have 3 threads now main and c and c1)
		
		
	}
}
