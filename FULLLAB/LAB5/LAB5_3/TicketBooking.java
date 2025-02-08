class TicketBooking{
	String bid;
	String source;
	String destination;
	String mail;
	double price;
	boolean status;
	String phone;
	TicketBooking(String bid,String m,String pn){
		this.bid=bid;
		this.mail=m;
		this.phone=pn;
		this.status=false;
	}
	public String toString(){
		return "Id: "+bid+" Source: "+source+" Destination: "+destination+" Mail: "+mail+" Price: "+price+" Status: "+status+" Phone: "+phone;
	}
}
