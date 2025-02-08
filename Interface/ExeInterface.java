interface Vehicle{
	void seatCapacity();
	void ac();
}

class Lorry implements Vehicle{
	public void seatCapacity(){
		System.out.println("No.of seats are 3 in lorry");
	}
	public void ac(){
		System.out.println("Ac is not required for lorries");
	}
}

class Car implements Vehicle{
	public void seatCapacity(){
		System.out.println("No.of seats are 8 in Car");
	}
	public void ac(){
		System.out.println("Ac is required for Car");
	}
}

abstract class Bus implements Vehicle{
	public void seatCapacity(){
		System.out.println("No.of seats are 44 in Bus");
	}
	public abstract void ac();
}
class NonAcBus extends Bus{
	public void ac(){
		System.out.println("AC is not required for NON-AC busses");
	}
	
}
class AcBus extends Bus{
	public void ac(){
		System.out.println("AC is required for AC busses");
	}

}
class ExeInterface{
	public static void main(String[] args){
		//Lorry l = new	Lorry();
		Vehicle l = new Lorry();
		l.seatCapacity();
		l.ac();
		
		Vehicle c = new Car();
		c.seatCapacity();
		c.ac();
		
		Vehicle n = new NonAcBus();
		n.seatCapacity();
		n.ac();
		
		Vehicle a = new AcBus();
		a.seatCapacity();
		a.ac();
	}


}


