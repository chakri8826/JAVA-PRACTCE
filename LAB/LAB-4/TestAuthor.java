class Author{
	private String name;
	private String email;
	private char gender;
	Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;	
	}
	public void setEmail(String email){
		this.email=email;
	}
	public String getEmail(){
		return email;
	}
	public String getName(){
		return name;
	}
	public char getGender(){
		return gender;
	}
	public String toString(){
		return name+" ("+gender+") at "+email;
	}
}
class TestAuthor{
	public static void main(String[] args){
			Author auth=new Author("rahul","Rahul@gandi.com",'m');
			System.out.println(auth);
	}
}



