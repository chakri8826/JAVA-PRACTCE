class test implements left,right{
	public void m(){
		System.out.println("void m method");
	}
	/*public int m(){
		return 1;
	}*/
	
	public void n(){
		System.out.println("n method");
	}
	
	public static void main(String[] args){
		System.out.println(right.x);
		test t = new test();
		t.n();
		
	}

}
