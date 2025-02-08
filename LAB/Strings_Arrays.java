import java.util.*;
import java.lang.*;

class Strings_Arrays{
	public static String StringX(String s){
		char[] ca = s.toCharArray();
		for(int i=1;i<ca.length-1;i++){
			if(ca[i]=='x'){
				 ca[i]=' ';
			}
		
		}
		return new String(ca).replace(" ","");
	}
	 

	
	public int wordsCount(String[] s,int n){
		int count=0;
		for(int i=0;i<s.length;i++){
			if(s[i].length()==n){
				count++;
			}
		}
		return count;
	}

	public String[] wordsFront(String[] s,int n){
		String[] res=new String[n];
		for(int i=0;i<n;i++){
			res[i]=s[i];
		}
		
		return res;
	}

	public String[] mergeTwo(String[] arr1,String[] arr2,int n){
		String[] res=new String[n];
		int a=0,b=0;
		for(int i=0;i<n;i++){
			if(arr1[a].compareTo(arr2[b])<0){
				res[i]=arr1[a];
				a++;
			}
			else if(arr1[a].compareTo(arr2[b])>0){
				res[i]=arr2[b];
				b++;
			}
			else if(arr1[a].compareTo(arr2[b])==0){
				res[i]=arr2[b];
				a++;
				b++;
			
			}
		} 
		return res;
	}
	
	public boolean squirrelPlay(int n,boolean b){
		if(n>=60 && n<=90){
			return true;
		}
		else if(b && n>=60 && n<=100){
			return true;
		}
		else{
			return false;
		}
	
	}
	
	
	public boolean inOrderEqual(int a,int b,int c,boolean boo){
		if(boo){
			return (a<=b && b<=c);
		}
		else {
			return (a<b && b<c);
		}
	}
	
	
	public boolean  evenlySpaced(int a,int b,int c){
		int l=a;
		if(b>l){
			l=b;
		}
		if(c>l){
			l=c;
		}
		
		int s=a;
		if(b<s){
			s=b;
		}
		if(c<s){
			s=c;
		}
		
		int m=a;
		if(m==l||m==s){
			m=b;
		}
		if(m==l||m==s){
			m=c;
		}
		/*
		int small,medium,large;
		if (a <= b && a <= c) {
		    small = a;
		    if (b <= c) {
		        medium = b;
		        large = c;
		    } else {
		        medium = c;
		        large = b;
		    }
		}
		else if (b <= a && b <= c) {
		    small = b;
		    if (a <= c) {
		        medium = a;
		        large = c;
		    } else {
		        medium = c;
		        large = a;
		    }
		} 
		else {
		    small = c;
		    if (a <= b) {
		        medium = a;
		        large = b;
		    } else {
		        medium = b;
		        large = a;
		    }
        }
		*/
		
		
		return ((m-s) == (l-m));
	}
	
	
	public int strDist(String str,String sub){
		int i=0;
		if(str.contains(sub)){
			i = str.lastIndexOf(sub);
		}
		return i;
	}
	
		
	public int PowerN(int b,int e){
		if(e==1){
			return b;
		}
		else{
			return b*PowerN(b,e-1);
		}
	}
	
	public int BunnyEars(int n){
		if(n==0){
			return 0;
		}
		else{
			if(n%2==0){
				return 3+BunnyEars(n-1);
			}
			else{
				return 2+BunnyEars(n-1);
			}
		}
	
	
	}
	
	
	public int countPairs(String s){
		int n=s.length(),count=0;
		for(int i=0;i<n;i++){
			char ch=s.charAt(i);
			for(int j=i+1;j<n;j++){
				if(ch==s.charAt(j)){
					count++;
					break;
				}
			}
		}
		return count;
	}
	
	
	public int  maxMirror(int[] arr){
		int len=arr.length,count=0,max=0;
		for(int i=0;i<len;i++){
			count=0;
			for(int j=len-1;j>=0 && i+count<len;j--){
				if(arr[i+count]==arr[j]){
					count++;
				}
				else{
					if(count>max){
						max=count;
					}
					count=0;
				}
			}
			max=Math.max(count,max);
		}
		return max;
	}
	
	
	public int[] seriesUp(int n){
		int r = (n*(n+1))/2;
		int arr[]=new int[r];
		int ind=0;
		for(int i=0;i<n;i++){
			 for(int j=0;j<=i;j++){
					arr[ind++]=j+1;
			}
		}
		return arr;
	}
	
	
	public String helloName(String name){
		return "Hello "+name+"!";
	}	
	
	
	public String middleTwo(String s){
		int len=s.length();
		/*String mid="";
		int i=len/2;
		mid+=s.charAt(i-1);
		mid+=s.charAt(i);
		return mid;*/
		
		int mid=len/2;
		return s.substring(mid-1,mid+1);
		
		
	}
	
	
	public String withoutX2(String s){
		char[] ca = s.toCharArray();
		if(ca[0]=='x'){
			ca[0]=' ';
		}
		if(ca[1]=='x'){
			ca[1]=' ';
		}
		return new String(ca).replace(" ","");
		
		/*if(s.length()>=2){
			if(s.charAt(0)=='x' && s.charAt(1)=='x'){
				return s.substring(2);
			}
			else if(s.charAt(0)=='x'){
				return s.substring(1);
			}
			else if(s.charAt(1)=='x'){
				return s.charAt(0) + s.substring(2);
			}
		}
		else if(s.length()==1 && s.charAt(0)=='x'){
			return "";
		}
		return s;
		*/
	}
	
	
	
	public boolean bobThere(String s){
		for(int i=0;i<s.length()-2;i++){
			if(s.charAt(i)=='b' && s.charAt(i+2)=='b'){
				return true;
			}
		}
		return false;
	}
	
	public String repeatFront(String str,int n){
		/*String rf="";
		for(int i=n;i>=0;i--){
			for(int j=0;j<i;j++){
				rf+=str.charAt(j);
			}
		}
		return rf;*/
		
		StringBuilder sb = new StringBuilder();
		for(int i=n;i>=0;i--){
			sb.append(str.substring(0,i));
		
		}
		
		return sb.toString();
	}
	
	
	public String starOut(String s){
		char[] ca = s.toCharArray();
		for(int i=0;i<ca.length;i++){
			if(ca[i]=='*'){
				ca[i]=' ';
				ca[i-1]=' ';
				int j=i+1;
				while(ca[j]=='*'){
					ca[j]=' ';
					j++;
				}
				ca[j]=' ';
			}
		}
		
		return new String(ca).replace(" ","");
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
