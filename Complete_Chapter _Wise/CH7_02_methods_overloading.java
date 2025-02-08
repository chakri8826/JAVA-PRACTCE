package src;

public class CH7_02_methods_overloading {
    static void foo(){
        System.out.println("Good Morning bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " broo!");
    }
    static void foo(int a,int b){
        System.out.println("Good Morning " + a + " broo!");
        System.out.println("Good Morning " + b + " broo!");
    }
    static void change(int a){
        a=90;
    }
    static void change2(int [] arr ){
        arr[0]=99;
    }
    static void telljoke(){
        System.out.println("I invented a new word \n plagiarism");
    }
    public static void main(String[] args){
//        telljoke();

        //Case1: Changing the integer
//        int x=45;
//        change(x);
//        System.out.println("The value of \"x\" after changing is: "+x);

        //Case2: Changing the Array
//        int [] marks={12,3,4,65,33};
//        change2(marks);
//        System.out.println("The value of \"marks[0]\" after changing is: "+marks[0]);


        //Method OverLoading
        foo();
        foo(1);
        foo(50,100);
        // Arguments are actual!



    }
}
