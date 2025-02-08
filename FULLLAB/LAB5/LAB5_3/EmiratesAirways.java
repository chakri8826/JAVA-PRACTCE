import java.io.*;
import java.util.*;
class EmiratesAirways implements FlightOperations{
	 TicketBooking tcb;
	 FlightInfo flights[]=new FlightInfo[20];
	 int count=0;
	public void getAllFlights(){
		try{
		FileReader fr=new FileReader("Emirates.txt");
		BufferedReader br=new BufferedReader(fr);
		String line="";
		while((line=br.readLine())!=null){
			StringTokenizer st=new StringTokenizer(line);
			String id=st.nextToken();
			String s=st.nextToken();
			String d=st.nextToken();
			double price=Double.parseDouble(st.nextToken());
			int seats=Integer.parseInt(st.nextToken());
			 flights[count++]=new FlightInfo(id,s,d,price,seats);
		}
		br.close();
		fr.close();
	}catch(Exception e){}
		   for(int i=0;i<count;i++){
				System.out.println(flights[i]);
		   }
		
	}
	public void bookTicket(TicketBooking tcb){
		this.tcb=tcb;
		int find=0;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try {
			int index = 0, tickets;
			while (index < count) {
				if ((flights[index].fid).equals(tcb.bid)) {
					find = 1;
					System.out.print("Enter number of seats you want to book:");
					tickets = Integer.parseInt(br.readLine());
					if (tickets > flights[index].seats) {
						System.out.println("Given number of tickets not available");
						find=-1;
					} else {
						flights[index].seats = flights[index].seats - tickets;
						tcb.bid = flights[index].fid;
						tcb.source = flights[index].fs;
						tcb.destination = flights[index].fd;
						tcb.price = flights[index].price * tickets;
						tcb.status = true;
						break;
					}
					break;
				}
				index++;
			}
			if (find == 0) {
				System.out.println("Not matched with any flights");
			}
			else if(find==1 && find!=-1)
			System.out.println(tcb+"\n Your ticket is confirmed\n");

		} catch (Exception e) {
		}
		System.out.println("Available seats after change:");
		for (int i = 0; i < count; i++) {
			System.out.println(flights[i]);
		}
		
	}
}
