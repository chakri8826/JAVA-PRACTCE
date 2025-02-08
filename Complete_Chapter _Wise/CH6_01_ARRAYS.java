package src;

public class CH6_01_ARRAYS {
    public static void main(String[] args){
        /*Classroom of 500 students -- you have to store these 500 students marks
        You have 2 options
        1.Create 500 variables
        2.use arrays(recommended)
        */
        //There are three main ways to create an array in java

        //1.Declaration and memory allocation
//        int[] marks = new int[5];

        //2.Declaration and then memory allocation
        //int[] marks;
        //marks=new int[5];
        //Initialization
//        marks[0]=100;
//        marks[1]=90;
//        marks[2]=70;
//        marks[3]=99;
//        marks[4]=80;
//      marks[5]=90;  --> throws an error

        //3.Declaration,memory allocation and initialization together
        int [] marks = {80,90,100,150,180};
        System.out.println(marks[4]);

    }
}
