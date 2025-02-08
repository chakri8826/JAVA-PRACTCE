class Player{
	private String name;
	private String gName;
	private int jNo;
	private float fees;
	
	Player(String val,String val2,int val3,float val4){
		System.out.println("Constructor-1");
		name=val; gName=val2; jNo=val3; fees=val4;
	
	}
	
	Player(String game,int val3,String n,float val4){
		System.out.println("Constructor-2");
		name=n; gName=game; jNo=val3; fees=val4;
	
	}
	
	
	
	Player(String val,String val2){
		name=val; gName=val2;
	}
	
	Player(){
	
	}
	
	public void viewData(){
		System.out.print("Name: "+name+" game: "+gName+" Jersey Number: "+jNo+" Fees: "+fees+"\n");
	}
	
	public void setName(String val){
		name=val;
	}
	public void setgName(String val2){
		gName=val2;
	}
	
	public void setJno(int n){
		jNo=n;
	}
	
	public void setFee(float fee){
		fees=fee;
	
	}
	











}
