package src;

import com.sun.security.jgss.GSSUtil;

public class CH5_PS {
    public static void main(String[] args){
        //Practise Problem 1
//        int n = 4;
//        for (int i =n; i!=0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Practise Problem 2
//        int n=4;
//        int sum =0;
//        int i=0;
//        while(i<n){
//            sum = sum+(2*i);
//            i++;
//        }
//        System.out.println("The sum of the numbers "+sum);

        //Practise problem 3

//        int n = 2;
//        for(int i=1; i<=10 ; i++){
//            System.out.printf("%d X %d = %d\n" , n, i, n*i );
//        }

        //Practise Problem 4
//        int n =4;
//        for (int i=10; i!=0; i--){
//            System.out.printf("%d X %d = %d\n",n , i,n*i);
//        }

        //Practise Problem 5

//        int n = 5;
//        int fact = 1;
//        for (int i=1; i<=n;i++){
//            fact = fact*i;
//        }
//        System.out.printf("The factorial of %d is %d",n,fact);

        //Practise Problem 6
//        int n = 5;
//        int fact = 1;
//        int i =1;
//        while(i<=n){
//            fact *= i;
//            i++;
//        }
//        System.out.println(fact);

        //Practise Problem 7
//        int n =4;
//        int i =n;
//        while(i!=0){
//            int j =0;
//            while(j<i){
//                System.out.print("*");
//                j++;
//            }
//            i--;
//            System.out.print("\n");
//        }


        //Practise Problem 9
//        int n =2;
//        int sum=0;
//        for(int i=1; i<=10;i++){
//            System.out.printf("%d X %d = %d\n",n,i,n*i);
//            sum = sum+(n*i);
//        }
//        System.out.printf("The sum of the numbes of mulitiplication of %d is %d",n,sum);


        //Practise Problem 10
        int n=4;
        int sum=0;
        for(int i=0;i<n;i++){
            sum = sum+(2*i);
        }
        System.out.println(sum);

    }
}
