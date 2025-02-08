public class Revanth {
    int sum(int a, int b) {
        int s = a + b;
        return s;
    }

    boolean prime(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            return true;
        } else {
            return false;
        }
    }

    boolean leapYear(int year) {
        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum = sum + r;
            n = n / 10;
        }
        return sum;
    }

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n = n / 10;
        }
        return rev;
    }

    int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    int maxOfThreeNumbers(int a, int b, int c) {
        int max;
        max = (a > b && a > c) ? a : (b > c) ? b : c;
        return max;
    }

    int power(int a, int n) {
        int pow = 1;
        for (int i = 1; i <= n; i++) {
            pow = pow * a;
        }
        return pow;
    }

    boolean perfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
            }
        }
        if (sum == n) {
            return true;
        } else {
            return false;
        }
    }

    boolean palendrome(int n) {
        int rev = 0;
        int n1 = n, r;
        while (n1 > 0) {
            r = n1 % 10;
            rev = rev * 10 + r;
            n1 = n1 / 10;
        }
        if (n == rev) {
            return true;
        } else {
            return false;
        }
    }
    boolean armstrong(int n)
    {
        double strong = 0, count = 0,r;
        int n1 = n, n2 = n;
        while (n1 > 0) {
            n1 = n1 / 10;
            count++;
        }
        while (n2 > 0) {
            r = n2 % 10;
            strong = strong + Math.pow(r, count);
            n2 = n2 / 10;
        }
        if (n == strong) {
            return true;
        } else {
            return false;
        }
    }
    void printPrime(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int count=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }
            if(count ==2)
            {
                System.out.println(i);
            }
        }
    }
    void printFibonacci(int n)
    {
        int a = 0, b = 1, c;
        c = a + b;
        if (n >= 0) {
            System.out.println(a);
        }
        if (n >= 1) {
            System.out.println(b);
        }
        if (n >= 2) {
            for (; c <= n; c = a + b) {
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}
