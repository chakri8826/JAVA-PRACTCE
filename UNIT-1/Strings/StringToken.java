import java.lang.*;
import java.util.*;
public class StringToken{
	public static void main(String[] args){
		String s = "Hello gus how are you";
		StringTokenizer st = new StringTokenizer(s);
		System.out.println(st.countTokens());
		
		int count=0;
		while(st.hasMoreTokens()){
			st.nextToken();
			count++;
		
		}
		System.out.println("Count through loop: "+count);
	
	}
	
}

