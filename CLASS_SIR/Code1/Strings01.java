import java.lang.*;
import java.util.*;
import java.io.*;
class Strings01{
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string value: ");
		String s=br.readLine();
		
		System.out.println("Enter a char value: ");
		String s1=br.readLine();
		char c = s1.charAt(0);
		int count=0;
		int len=s.length();
		for(int i=0;i<len;i++){
			if(c==s.charAt(i)){
				count++;
			 //System.out.println(s.charAt(i);
			}
		}
		System.out.println ("Frequency of "+c+" in "+s+" is "+count);
		
		String rev="";
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println("Reverse is: "+rev);
		if(s.equals(rev))
			System.out.println("Palindrome..");
		else
			System.out.println("Not Palindrome");
}
}
