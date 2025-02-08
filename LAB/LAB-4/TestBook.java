class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	public Book(String name,Author author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	public Book(String name,Author author,double price,int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	public String getName(){
		return name;
	}
	
	public Author getAuthor(){
		 return author;
	}
	public String getAuthorName(){
		return author.getName();
	}
	public String getAuthorEmail(){
		return author.getEmail();
	}
	public char getAuthorGender(){
		return author.getGender();
	}
	
	
	public void setPrice(double p){
		price=p;
	}
	public double getPrice(){
		return price;
	}	
	
	public void setQtyInStock(int qis){
		qtyInStock=qis;
	}
	public int getQtyInStock(){
		return qtyInStock;
	}
	
	public String toString(){
		return name+" by "+author.toString();
	}
	

}

class TestBook{
	public static void main(String[] args){
		Author anAuthor = new Author("rahul","Rahul@gandi.com",'m');
		Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);
		System.out.println(aBook);
		System.out.println(aBook.getAuthor().getName());
		System.out.println(aBook.getAuthor().getEmail());
		System.out.println(aBook.getAuthorName());
		System.out.println(aBook.getAuthorEmail());
		System.out.println(aBook.getAuthorGender());
		
		
		//GETTING ERROR AFTER DECLARING LIKE THIS
		//Author Book anotherBook = new Book("more Java for dummy",new Author("rahul","Rahul@gandi.com",'m'),29.95, 1000);
		//System.out.println(anotherBook);
		
		
	}



}



































