import java.io.*;
class MakeMyTrip {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter fw=new FileWriter("BookedTickets.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		BritishAirways b=new BritishAirways();
		EmiratesAirways e=new EmiratesAirways();
		AirAsiaAirways a=new AirAsiaAirways();
		int cont=0;
		System.out.println("************************ WELCOME *****************************");
		do{
		System.out.println("Enter 1:British AirWays 2:Emirates AirWays 3:AirAsia AirWays");
		System.out.print("Enter your choice:");
		int option=Integer.parseInt(br.readLine());
		switch(option)
		{
			case 1:
			b.getAllFlights();
			break;
			case 2:
			e.getAllFlights();
			break;
			case 3:
			a.getAllFlights();
			break;
		}
		System.out.print("Enter ID:");
		String id = br.readLine();
		System.out.print("Enter phone number:");
		String ph = br.readLine();
		System.out.print("Enter mail:");
		String mail = br.readLine();
		TicketBooking t = new TicketBooking(id, mail, ph);
		switch(option)
		{
			case 1:
			b.bookTicket(t);
			break;
			case 2:
			e.bookTicket(t);
			break;
			case 3:
			a.bookTicket(t);
			break;
		}
		System.out.print("\n Enter 1 to book another ticket 0 to stop");
		cont=Integer.parseInt(br.readLine());
	}while(cont!=0);
	System.out.println("********************* Thank you ****************");
	bw.close();
	}
	
}
