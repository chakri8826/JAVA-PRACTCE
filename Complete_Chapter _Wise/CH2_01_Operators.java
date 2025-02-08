package src;

public class CH2_01_Operators {
    public static void main(String[] args){
        //arthimetic operator
        int a =6;
        int b=a%4; //modulo operator..
//        4.8%1.1-- o.4 as a remainder
        System.out.println(b);

        // assignment operators
        int c=9;
        c+=3;
        System.out.println(c);

        //comparision operator
        System.out.println(66>62);

        // Logical Operators
        System.out.println(45>20 &&  45 >19);
        System.out.println(45>20 || 45 <19);


        System.out.println(2&3);  //Bitwise operators
        // 10
        // 11
        //--------
        // 10

    }
}
