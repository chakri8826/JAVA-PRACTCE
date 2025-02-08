package src;
import java.util.Scanner;

public class CH4_03_ElseIf {

    public static void main(String[] args) {
        String var = "chakri";
        switch (var){
            case "Harshi":
                System.out.println("You are going to become an adult");
                System.out.println("You are going to become an adult");
                break;
            case "amma":
                System.out.println("You are going to join a job");
                break;
            case "nanamma":
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Enjoy Your life");
        }
        System.out.println("HLLOOOOO");


        /*
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        age=sc.nextInt();

        if (age>56){
            System.out.println("You are experienced");
        }
        else if (age>46){
            System.out.println("You are semi experienced");
        }
        else if (age>36){
            System.out.println("You are semi semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }

         */
    }
}
