import java.util.*;
import java.lang.*;
import java.io.*;


class Iw{
	int data;
	boolean status;
	synchronized public void insert(int data){
		if(status){
			try{
				 wait();
			}
			catch(Exception e){
			
			}
		}
		this.data=data;
		System.out.println("Generated: "+data);
		status=true;
		notify();
	}
	
	synchronized public int dataFile(){
		if(!status){
			try{
				wait();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
		status=false;
		notify();
		System.out.println("Written: "+data);
		return data;
		
	}
}


class Producer extends Thread{
	Iw b;
	Producer(Iw b){
		this.b=b;
	}
	public void run(){
		Random r = new Random();
		for(int i=0;i<10;){
			int ele=r.nextInt(1000);
			if(ele%2==0){
				b.insert(ele);
				i++;
			}
			 
			 
		}
		 /*for (int i = 0; i < 10;) {
		    int num = r.nextInt(100);
		    if (num % 2 == 0) {
		        b.insert(num);
		        i++;
		    }
		}*/
	}	
}

                                        
class Writer extends Thread{
	Iw b;
	Writer(Iw b){
		this.b=b;
	}
	public void run(){
		 //fw =  null;
		 //bw = null;
		try{
			FileWriter fw=new FileWriter("EWD.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			for(int i=0;i<10;i++){
				int n=b.dataFile();
				bw.write(n+"\n");
				//System.out.println("Written: "+n);
			}
			bw.close();
			fw.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}


class EvenWriteDemo{
	public static void main(String[] args){
		Iw b = new Iw();
		Producer p = new Producer(b);
		Writer w = new Writer(b);
		p.start();
		w.start();	
	}
	



}

