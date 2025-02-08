class Books{
	private String authorName;
	private String title;
	private double price;
	private int noofPages;
	Books(String aN,String title,double price,int nop){
		this.authorName=aN;
		this.title=title;
		this.price=price;
		this.noofPages=nop;
	}
	public String toString(){
		return "Author Name: "+authorName+ "\nBook Title: "+title+ "\nBook Price: "+price +"\nNumber of pages: "+noofPages;
	}
}

class SoftwareBooks extends Books{
	String software;
	double version;
	SoftwareBooks(String aN,String title,double price,int nop,String software,double version){
		super(aN,title,price,nop);
		this.software=software;
		this.version=version;
	}
	
	public String toString(){
		String det = super.toString();
		return det+"\nsoftware Name: "+software+ "\nSoftware Version: "+version;
	}
}

class HardwareBooks extends Books{
	String hardwareCategory;
	String publisher;
	HardwareBooks(String aN,String title,double price,int nop,String hCategory,String publisher){
		super(aN,title,price,nop);
		this.hardwareCategory= hCategory;
		this.publisher=publisher;
	}
	public String toString(){
		String det = super.toString();
		return det+"\nHardware Category: "+hardwareCategory+ "\nHardware publisher: "+ publisher;
	}
	

}


class BooksDemo{
	public static void main(String[] args){
		SoftwareBooks sb = new SoftwareBooks("James Gosling","Complete Java Reference",1500,999,"Java Software",24.01);
		System.out.println("The Software Book details are: ");
		System.out.println(sb);
		
		HardwareBooks hb = new HardwareBooks("John L. Hennessy","Computer Architecture",2500,1088,"MotherBoard","Junior John");
		System.out.println("\nThe Hardware Book details are: ");
		System.out.println(hb);
		
		
		
	
	
	
	
	}





}






