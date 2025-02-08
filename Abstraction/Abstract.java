abstract class Animal{
	public abstract void sound();
}

class Dog extends Animal{
	public void sound(){
		System.out.println("Dog sound");
	}
	
}

class Cat extends Animal{
	public void sound(){
		System.out.println("Cat sound");
	}
	
}

class Abstract{
	public static void main(String[] args){
		//Animal a = new Animal();//Object creation for abstract class is not possible
		Animal a;
		a=new Dog();
		a.sound();
		a=new Cat();
		a.sound();
	}
}

