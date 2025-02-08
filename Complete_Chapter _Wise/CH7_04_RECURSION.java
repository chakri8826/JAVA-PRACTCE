package src;

import com.sun.security.jgss.GSSUtil;

public class CH7_04_RECURSION {
//        factorial(0) = 1;
//        factorial(n) = n * n-1 * n-2....1
//        factorial(5) = 5*4*3*2*1
//        factorial(n) = n*factorial(n-1);
          static int factorial(int n){
              if (n==0 || n==1){
                  return 1;
              }
              else{
                  n=n*factorial(n-1);
              }
              return n;
          }
           static int factorial_iterative(int n){
               if (n==0 || n==1){
                   return 1;
               }
               else{
                   int fact = 1;
                   for(int i=n;i!=0;i--){
                       fact *= i;
                   }
                   return fact;
               }

           }

          public static void main(String[] args) {
              System.out.println("The value of factorial n is "+factorial(4));
              System.out.println("The value of factorial n is "+factorial_iterative(4));

    }
}
