package src;

public class CH2_02_operator_precedence {
    public static void main(String[] args){
        // precedence and Associtivity
//        int a =6*5-34/2;
          /*
          Higheset precedence goes to * and /. Then they are evaluated on the basis of left
          to right associtivity
               =30 - 34/2
               =30 - 17
               =13
           */
//        int b =60/5-34*2;
        /*
              = 12 - 34*2
              = 12 - 68
              = -56
         */

//        System.out.println(a);
//        System.out.println(b);

        // Quick Quiz
        int x =6;
        int y = 1;
        int z = x*y/2;
        System.out.println(z);

        int a = 5;
        int b = 1;
        int c = 4;
        int k = (b*b -4*a*c)/(2*a);
        System.out.println(k);

    }
}
