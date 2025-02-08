package src;

public class CH7_PS {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d =%d\n",n,i,n*i);
        }
    }
    static void stars(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //sum(n) = 1+2+3+....+n
    //sum(n) = 1+2+3+.... + n-1 + n
    //sum(n) = sum(n-1) + n
    //sum(3) = 3 + sum(2)
    //sum(3) = 3 + 2 +sum(1)
    //sum(3) = 3 + 2 + 1
    static int sum_of_n(int n){
        //Base Condition
        if(n==1){
            return 1;
        }
        else{
            return n + sum_of_n( n-1);
        }
    }

    static void reverse_stars(int n){
        for(int i=n;i!=0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    static int fib(int n){
//        if(n==1){
//            return 0;
//        }
//        else if(n==2){
//            return 1;
//        }
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }

    static float avg(int ...aveg){
       float  result = 0f;
        for(float i:aveg){
            result+=i;
        }
        int array_length = aveg.length;
        float c = (float) array_length;
        return result/c ;
    }

    static void four_recursion(int n){
        if(n>0){
            for(int i=0; i<n; i++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
            four_recursion(n-1);

        }
    }

    static void two_recursion(int n){
        if(n>0){
            two_recursion(n-1);
            for(int i=0; i<n; i++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    //four_recursion(3)
    //four_recursion(2) +  3 times star and new line
//    four_recursion(1) +  2 times star and new line  + 3 times star and new line
//    four_recursion(0) +  1 times star and new line  + 2 times star and new line  +  3 times star and new line

    static float Cel_fah(float c){
        return ((c * 9/5) + 32);
    }

    static int sum_of_n_rec(int n){
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args){
        //Problem 1
//        multiplication(2);

        //problem 2
//        stars(4);

        //Problem 3
//       int c= sum_of_n(5);
//        System.out.println(c);

        //Problem 4
//        reverse_stars(4);

        //Problem 5
//        fibonacci_series = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
//        int result = fib(3);
//        System.out.println(result);

        // Problem 6
//       int [] aveg = {1,2,3,4};
//        float n = avg(aveg);
//        System.out.println(n);


        // Problem 7
//        four_recursion(4);


        // Problem 8
//        two_recursion(4);


        //Problem 9
        float result = Cel_fah(86);
        System.out.println(result);

        //Problem 10
//        int result = sum_of_n_rec(5);
//        System.out.println(result);











    }
}
