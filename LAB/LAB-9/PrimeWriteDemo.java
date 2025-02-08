import java.util.*;
//import java.lang.*;
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
	boolean isPrime(int k){
		if(k==0 || k==1){
			return false;
		} 
		for(int i=2;i<k;i++){
			if(k%i==0){
				return false;
			}
		}
		return true;
	}
	public void run(){
		Random r = new Random();
		for(int i=0;i<100;){
			int ele=r.nextInt(100);
			if(isPrime(ele)){
				b.insert(ele);
				i++;
			}
			
			 
		}
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
			FileWriter fw=new FileWriter("PWD.txt");
			BufferedWriter bw=new BufferedWriter(fw);
			
			for(int i=0;i<100;i++){
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


class PrimeWriteDemo{
	public static void main(String[] args){
		Iw b = new Iw();
		Producer p = new Producer(b);
		Writer w = new Writer(b);
		p.start();
		w.start();	
	}
}

