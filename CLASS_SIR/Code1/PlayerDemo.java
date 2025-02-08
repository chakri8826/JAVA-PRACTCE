class PlayerDemo{
	public static void main(String args[]){
		Player p1=new Player("Chakri","Football",2,1.1f);
		
		p1.viewData();
		
		Player p2=new Player("Cherry","Cricker" );
		
		p2.setJno(100);
		 
		p2.setFee(22.2f);
		p2.viewData();
		
		Player p3=new Player();
		System.out.println("Constructor-3");
		p3.setName("Chakradhar");
		p3.setgName("Basket Ball");
		p3.setJno(7);
		p3.setFee(222.22f);
		p3.viewData();
		
		p3.setName("Almond");
		p3.setgName("Hacking");
		p3.setJno(8);
		p3.setFee(333.22f);
		p3.viewData();
	
		Player p4=new Player("Kabaddi",4,"Tiger",5.5f );
		System.out.println("Constructor-4");
		p4.viewData();
	
	
	
	}























}
