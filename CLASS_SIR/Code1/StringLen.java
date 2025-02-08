import java.lang.*;
import java.util.*;
import java.io.*;
class StringLen{
	static int findMaxLen(String arr[]){
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++){
			int w=arr[i].length();
			 if(w>count){
			 	count=w;
			 }
		}
		return count;
		
	}
	
	static int findMinLen(String arr[]){
		int n=arr.length;
		int count=100;
		for(int i=0;i<n;i++){
			int w=arr[i].length();
			 if(w<count){
			 	count=w;
			 }
		}
		return count;
		
	}
	static String[] sortWords(String arr[]){
		int n=arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				int r=arr[j].compareTo(arr[j+1]);
				if(r>0){
					String temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	
	public static void main(String args[])throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter No.of words: ");
		int size=Integer.parseInt(br.readLine());
		String words[]=new String[size];
		for(int i=0;i<size;i++){
			System.out.println("Enter String Value: ");
			String val=br.readLine();
			words[i]=val;
		
		}
		System.out.println("----------------------Before Sorting------------------- ");
		for(int i=0;i<size;i++){
			System.out.println(words[i]);
		}
		
		String result[]=sortWords(words);
		
		System.out.println("----------------------After Sorting------------------- ");
		for(int i=0;i<size;i++){
			System.out.println(result[i]);
		}
		
		int maxLen=findMaxLen(words);
		System.out.println("Max length word from the array of the words is: "+maxLen);
		
		int minLen=findMinLen(words);
		System.out.println("Max length word from the array of the words is: "+minLen);

	}
	
	/*
	String findMaxLen(String arr[]){
		return 0;
	}
	String findMinLen(String arr[]){
		return 0;
	}
	String[] sortWords(String arr[]){
		return arr;
	}
	*/













}
