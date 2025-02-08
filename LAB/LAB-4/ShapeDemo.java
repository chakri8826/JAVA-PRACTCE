class Shape{
	 public void numberOfSides(){
		System.out.println("Number of sides: ");
	}
}

class Trapezoid extends Shape{
	 public void numberOfSides(){
	 	super.numberOfSides();
		System.out.println("Trapezoid have 4 sides");
	}
}

class Triangle extends Shape{
	 
	public void numberOfSides(){
		super.numberOfSides();
		System.out.println("Triangle have 3 sides");
	}	

}


class Hexagon extends Shape{
	 
	public void numberOfSides(){
		super.numberOfSides();
		System.out.println("Hexagon have 6 sides");
	}
}

class ShapeDemo{
	public static void main(String[] args){
		Hexagon h = new Hexagon();
		h.numberOfSides();
	}
}





