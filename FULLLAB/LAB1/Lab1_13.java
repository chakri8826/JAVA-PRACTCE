
//13. Write a java program for print the charactor ASCII values and read a
//different type of input from user using BufferedReader class
import java.io.*;

public class Lab1_13 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a Stirng to print its character ASCII values:");
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int ascii = (int) c;
			System.out.println("ASCII VALUE OF " + c + " is " + ascii);
		}
	}
}
