import java.util.*;
import java.lang.*;
class StaticInitializer{
	static int x=5;
	static{
		 x=69;
		 System.out.println("Hello World...");
	}
	public static void main(String args[])throws ClassNotFoundException{
		//StaticInitializer.x=69;
		//StaticInitializer st = new StaticInitializer();
		//st.x=69;
		System.out.println(x);
		System.out.println(x);
		//Class.forName(StaticInitializer);
	}

}




