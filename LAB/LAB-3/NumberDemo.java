class Number{
	private double n;
	Number(int n){
		this.n=n;
	}
	
	public boolean isZero(){
		return n==0;
	}
	boolean isPositive(){
		return n>0;
	}
	boolean isNegative(){
		return n<0;
	}
	boolean isOdd(){
		return n%2!=0;
	}
	boolean isEven(){
		return n%2==0;
	}
	boolean isPrime(){
		for(int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			} 
		}
		return true;
	}
	boolean isArmstrong(){
		int temp=(int)n;
		int temp1=(int)n;
		int l=0,sum=0;
		while(temp!=0){
			l++;
			temp/=10;
		}
		while(temp1!=0){
			int d=temp1%10;
			double p=Math.pow(d,l);
			sum+=p;
			temp1/=10;
		}
		return sum==n;
	
	}
	
	 double getFactorial(){
	 	int m=(int)n;
	 	double fact=1;
	 	while(m!=0){
	 		fact*=m;
	 		m--;
	 	}
	 	return fact;
	}
	
	double getSqrt(){
		int m = (int)n;
		for(int i=1;i<m;i++){
			if(i*i==m){
				return (double)i;
			}
		}
		return Math.sqrt(m);
	}
	double getSqr(){
		return n*n;
	}
	double sumDigits(){
		int m=(int)n;
		int sum=0;
		while(m!=0){
			sum+=m%10;
			m/=10;
		
		}
		return (double)sum;	
	}
	
	double getReverse(){
		int rev=0;
		int m=(int)n;
		while(m!=0){
			 
			rev=rev*10+m%10;
			m/=10;
		}
		return (double)rev;
	}
	
}


class NumberDemo{
	public static void main(String[] args){
		Number num = new Number(1234);
		System.out.println("isZero: "+num.isZero());
		System.out.println("isPositive: "+num.isPositive());
		System.out.println("isNegative: "+num.isNegative());
		System.out.println("isOdd: "+num.isOdd());
		System.out.println("isEven: "+num.isEven());
		System.out.println("isPrime: "+num.isPrime());
		System.out.println("isArmstrong: "+num.isArmstrong());
		System.out.println("getFactorial: "+num.getFactorial());
		System.out.println("getSqrt: "+num.getSqrt());
		System.out.println("getSqr: "+num.getSqr());
		System.out.println("Sum of digits: "+num.sumDigits());
		System.out.println("Reversal of the number: "+num.getReverse());
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
