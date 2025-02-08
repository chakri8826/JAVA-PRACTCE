class StaticDemo{	
	static int a=5;
	static{
		a=20;
		System.out.println("Hello Static");
	}
	
	public static void main(String args[]){
		System.out.println("Hello Main...");
		System.out.println("A value: "+a);
		StaticWork sw1=new StaticWork();
		int z=StaticWork.x;
		System.out.println(z);
			StaticWork sw2=new StaticWork();
			  z=StaticWork.x;
		System.out.println(z);
		StaticWork sw3=new StaticWork();
		System.out.println(StaticWork.x);
	}
}
