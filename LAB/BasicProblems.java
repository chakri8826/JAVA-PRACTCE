import java.util.*;
import java.lang.*;

class BasicProblems{
	Scanner sc = new Scanner(System.in);
	
	void primeOrNot(){
		System.out.println("Enter a number to check it is prime number or not");
		int n=sc.nextInt();
		int p=1;
		for(int i=2;i<n;i++){
		    if(n%i==0){
		        p=0;
		        break;
		    }
		}
		if(p==1){
		    System.out.println(n+" is a Prime Number..");
		}
		else{
		    System.out.println(n+" is not a Prime Number..");
		}
	}
	
	void leapYearOrNot(){
		System.out.println("Enter a year to check it is Leap year or not");
		int n=sc.nextInt();
		if((n%4==0) && ((n%400==0) || (n%100!=0))){
		    System.out.println("Leap Year");
		}
		else System.out.println("Not a leap year");
		
	}
	
	void sumOfDigits(){
		System.out.println("Enter a num to print its sum");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0){
		    int j = n%10;
		    sum+=j;
		    n/=10;
		}
		System.out.println(sum);
	}
	
	
	int reversingAGivenNum(){
		System.out.println("Enter a num to print in reverse order: ");
		int n=sc.nextInt();
		int rn=0;
		while(n!=0){
		    int j = n%10;
		    rn=rn*10+j;
		    n/=10;
        	}
        	return rn;
	}
	
	
	int factorialOfNum(){
		System.out.println("Enter a num to print its factorial: ");
		int n=sc.nextInt();
		int fact=1;
		//using while loop
		while(n!=0){
		    fact*=n;
		    n--;
		}
		/*
		using for loop
		for(int i=n;i!=0;i--){
		    fact*=i;
		}
		*/
		return fact;
	}
	
	void maxOf3Nums(){
		System.out.println("Enter num 1: ");
		int a=sc.nextInt();
		System.out.println("Enter num 2: ");
		int b=sc.nextInt();
		System.out.println("Enter num 3 ");
		int c=sc.nextInt();
		if((a>b) && (a>c)){
		    System.out.println(a + " is biggest");
		}
		else if(b>c){
		    System.out.println(b + " is biggest");
		}
		else{
		    System.out.println(c + " is biggest");
		}
	}
	
	
	void powerOfNum(){
		  System.out.println("Enter base: ");
		int b=sc.nextInt();
		System.out.println("Enter exponent: ");
		int e=sc.nextInt();
		int p=b;
		//Using for loop
		for(int i=1;i<e;i++){
		    p*=b;
		}
		/*
		Using While loop
		int i=1;
		while(i<e){
		    p*=b;
		    i++;
		}
		*/
		System.out.println(p);
	}
	
	
	void perfectOrNot(){
		System.out.println("Enter the number to check it perfect number or not: ");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++){
		    if(n%i==0){
		        sum+=i;
		    }
		}
		if(n==sum){
		    System.out.println("Perfect Number");
		}
		else{
		    System.out.println("Not a Perfect Number");
		}
	}
	
	
	void palindromeNumOrNot(){
		System.out.println("Enter the number to check it Palindrome number or not: ");
        	int n=sc.nextInt();
        	int temp2=n;
        	int reversed_num=0;
		while(n!=0){
		    int e=n%10;
		    reversed_num=reversed_num*10+e ;
		    n/=10;
		}
		if(temp2==reversed_num){
            		System.out.println("Palindrome number");
        	}
        	else{
            		System.out.println("Not Palindrome number");
        	}
	}
	
	
	void armstrongNumOrNot(){
		 System.out.println("Enter a number to check whether it is an armstrong number or not: ");
		int n=sc.nextInt();
		int temp=n;
		int temp1=n;
		int l=0;
		while(n!=0){
		    l+=1;
		    n/=10;
		}
		double sum=0;
		while(temp!=0){
		    int j=temp%10;
		    double p = Math.pow(j,l);
		    sum=sum+p;
		    temp=temp/10;
		}
		if((sum==temp1) || temp1==0||temp1==1)
		    System.out.println("Armstrong Number ");
	      

		else System.out.println("Not Armstrong Number ");
	}
	
	
	void charAscii(){
		for(char ch='A';ch<='Z';ch++){
		    System.out.println("Char value of "+ch+" is " +(int)ch);
		}
		for(char ch='a';ch<='z';ch++){
		    System.out.println("Char value of "+ch+" is "+(int)ch);
		}
		for(char n='0';n<='9';n++){
		    System.out.println("Char value of "+n+" is "+(int)n);
		}
	}
	
	
	void primesInRange(){
		System.out.println("Enter a range of number to print primes upto it: ");
		int n=sc.nextInt();
		for(int i=2;i<n;i++){
		    boolean prime=true;
		    for(int j=2;j<i;j++){
		        if(i%j==0){
		            prime=false;
		            break;
		        }
		    }
		    if(prime){
		        System.out.println(i);
		    }
		}
	}
	
	
	void fibInRange(){
		System.out.println("Enter a number to print FIBONACII SERIES  upto it: ");
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		int c=0;
		while((a+b)<n){
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
		}
	}
	
	
	
	void perfectInRange(){
		 System.out.println("Enter a number to print perfect numbers upto it: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
		    int sum=0;
		    for(int j=1;j<i;j++){
		        if(i%j==0){
		            sum+=j;
		        }
		    }
		    if(sum==i){
		        System.out.println(i);
		    }
		}
	}
	
	
	void gcd2Var(){
		System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		int gcd=0;
		for(int i=1;i<a || i<b;i++){
		    if(a%i==0 && b%i==0){
		        gcd=i;
		    }
		}
		System.out.println(gcd);
	}
	
	
	void lcm2Var(){
		 System.out.println("Enter a number: ");
		int a=sc.nextInt();
		System.out.println("Enter another number: ");
		int b=sc.nextInt();
		int nu=a*b;
		int gcd=1;
		for(int i=1;i<a&&i<b;i++){
		    if(a%i==0&&b%i==0){
		        gcd=i;
		    }
		}
		System.out.println(nu/gcd);
	}


	void mulOfSec(){
		 System.out.println("\nEnter a number: ");
		int a=sc.nextInt();
		System.out.println("\nEnter another number: ");
		int b=sc.nextInt();
		if(a%b==0){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
	}
	
	void armstrongInRange(){
		System.out.println("\nEnter a number to print armstrong numbers upto it: ");
		int b=sc.nextInt();
		for(int a=1;a<=b;a++){
		    int temp=a;
		    int temp1=a;
		    int temp2=a;
		    int l=0;
		    while(temp!=0){
		        l=l+1;
		        temp/=10;
		    }
		    int sum=0;
		    while(temp1!=0){
		        int j=temp1%10;
		        double res=Math.pow(j,l);
		        sum+=res;
		        temp1/=10;
		    }
		    if(temp2==sum){
		        System.out.println(a);
		    }
		}
	}	
	
	
	void perfectSqrInRange(){
		System.out.print("\nEnter a number to print perfect squares upto it: ");
		int a=sc.nextInt();
		int r=0;
		System.out.print("\nPerfect squares upto given range "+a+" is: ");
		for(int i=1;i*i<a;i++){
		    System.out.print(i*i+" ");
		}
	}
	
	
	
	void primeFactorsInRange(){
		System.out.print("\nEnter a number to print prime factors to it: ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++){
		    int p=1;
		    for(int j=2;j<i;j++){
		        if(i%j==0){
		            p=0;
		            break;
		        }
		    }
		    while(p==1 && n%i==0){
		            System.out.println(i);
		            n = n / i;
		    }
		}
	}
	
	
	void sameDigNums(){
		    System.out.print("\nEnter the range of number to print same digit numbers in it: ");
		    int n=sc.nextInt();
		    for(int i=10;i<=n;i++){
		    	int t=i;
		    	int dig=t%10;
		    	int p=1;
		    	while(t!=0){
		    	      int j=t%10;
		    	      if(j!=dig){
		    		 p=0;
		    		 break;
		    	      }
		    	      t/=10;
		      }
	   		if(p==1){
	   		    System.out.print(i+" ");
	   		}
		    
		    }
	}
	
	void ramanujanNums(){
		  System.out.print("\nEnter the range of number to print RAMANUJAN NUMBERS in it: ");
		int r=sc.nextInt();
		for(int i=1;i<=r;i++){
		    int n=i;
		    int sum=0;
		    while(n!=0){
		        int j=n%10;
		        sum+=j;
		        n=n/10;
		    }
		    int st=sum;
		    int rs=0;
		    while(st!=0){
		        int k=st%10;
		        rs=rs*10+k;
		        st=st/10;
		    }
		    if(i==(sum*rs)){
		        System.out.println(i);
		    }
		}
	}
	
	
	
	
	
	
}

