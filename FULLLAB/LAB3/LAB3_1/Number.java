public class Number {
    private double m;

    public Number(int m) {
        this.m = m;
    }

    public Number(float m) {
        this.m = m;
    }

    public Number(double m) {
        this.m = m;
    }

    public boolean isZero() {
        boolean logic = false;
        if (m == 0)
            logic = true;
        return logic;
    }

    public boolean isPositive() {
        boolean logic = false;
        if (m > 0)
            logic = true;
        return logic;
    }

    public boolean isNegative() {
        boolean logic = false;
        if (m < 0)
            logic = true;
        return logic;
    }

    public boolean isOdd() {
        boolean logic = false;
        if (m % 2 != 0)
            logic = true;
        return logic;
    }

    public boolean isEven() {
        boolean logic = false;
        if (m % 2 == 0)
            logic = true;
        return logic;
    }

    public boolean isPrime() {
        boolean logic = false;
        int count = 0;
        for (int i = 1; i < m; i++) {
            if (m % i == 0)
                count++;
        }
        if (count == 2)
            logic = true;
        return logic;
    }
    public boolean isAmstrong()
    {
        boolean logic=false;
        int n1,n2,count=0;
        double sum=0;
        n1=n2=(int)m;
        while(n1>0)
        {
            count++;
            n1=n1/10;
        }
        while(n2>0)
        {
            sum=sum+Math.pow(n2%10,count);
            n2=n2/10;
        }
        if(sum==m)
        logic=true;

        return logic;

    }
    public double getFactorial()
    {
        double factorial=1;
        for(int i=1;i<=m;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
    public double getSqr()
    {
        return m*m;
    }
    public double sumDigits()
    {
        double sum=0;
        int n=(int)m;
        while(n>0)
        {
            sum=sum+(n%10);
            n=n/10;
        }
        return sum;
    }
    public double getReverse()
    {
        double reverse=0;
        int n=(int)m;
        while(n>0)
        {
            reverse=reverse*10+(n%10);
            n=n/10;
        }
        return reverse;
    }
    public double getSqrt()
    {
        return Math.sqrt(m);
    }

}