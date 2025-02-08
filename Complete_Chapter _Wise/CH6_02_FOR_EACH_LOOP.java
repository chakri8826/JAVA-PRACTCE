package src;

public class CH6_02_FOR_EACH_LOOP {
    public static void main(String[] args){
//        float[] marks={98.5f,66.4f,80.8f,99.3f,100.2f};
//        String[] students={"Chakri","Harshitha","Uday"};
//        System.out.println(students.length);
//        System.out.println(students[1]);


        int [] marks={98,66,80,99,100};
//        System.out.println(marks.length);

//        Displaying the Array (Naive way)
//        System.out.println("printing using for loop");

//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

//         Displaying the Array(for loop)
        System.out.println("printing using for loop");
        for (int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }


//         Displaying the Array(for loop)
        System.out.println("printing using for loop in reverse order");
        for (int i=marks.length -1;i>=0;i--){
            System.out.println(marks[i]);
        }

//         Displaying the Array(for-each loop)
       System.out.println("printing using for-each loop");
        for(int element:marks){
            System.out.println(element);
        }


    }
}
