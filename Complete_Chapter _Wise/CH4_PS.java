package src;
import java.util.Scanner;

public class CH4_PS {
    public static void main(String[] args) {
        //Question No 1
//        int a =10;
//        if (a=11){
//            System.out.println("Iam 11");
//        }
//        else {
//            System.out.println("Iam not 11");
//        }

        //Question No 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the marks of Sub1");
//        int sub1= sc.nextInt();
//        System.out.println("Enter the marks of Sub2");
//        int sub2= sc.nextInt();
//        System.out.println("Enter the marks of Sub3");
//        int sub3= sc.nextInt();
//
//        float total = ((sub1+sub2+sub3)/300f)*100;
//        System.out.println("Overall Percentage is "+total);
//        if (total>=40.0 && sub1>33 && sub2>33 && sub3>33){
//            System.out.println("Passes in the Exams");
//        }
//        else{
//            System.out.println("Failed in the Exams");
//        }

        //Question 3
//        Scanner sc = new Scanner(System.in);
//        float salary = sc.nextFloat();
//        float tax = 0;
//
//        if (salary<=2.5){
//            tax = tax + 0;
//        }
//
//        else if (salary>2.5 && salary<=5){
//            tax = tax + (0.05f * (salary - 2.5f));
//        }
//        else if(salary>5 && salary<=10){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (salary -5.0f);
//            System.out.println(tax);
//        }
//        else if(salary>10){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (10.0f - 5.0f);
//            tax = tax + 0.3f * (salary - 10.0f);
//            System.out.println(tax);
//        }
//        System.out.println("The total tax paid by the employee is: "+tax);

        //Question 4

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int day =sc.nextInt();
//
//        switch(day){
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//        }

        //Question 5

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the year to check whether it is a leap year or not: ");
//        int year = sc.nextInt();
//        if (year%4==0 && (year % 4==0 || year % 100!=0)){
//            System.out.println(year+" is a leap year");
//        }
//        else{
//            System.out.println(year+" is not a leap year");
//        }

        //Question 6

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a website: ");
        String website = sc.next();
        if (website.endsWith(".org")) {
            System.out.println("Organization website");
        }
        else if (website.endsWith(".com")) {
            System.out.println("Commercial Website");
        }
        else if (website.endsWith(".in")){
            System.out.println("Indian Website");
        }
    }
}









