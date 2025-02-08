package src;
import java.util.Random;
import java.util.Scanner;
public class Exercise2_Rock_Paper_Scissor {
    public static void main(String[] args){
        int us=0;
        int co=0;
        int i=1;
        while(i<6) {
            Random random = new Random();
            int number = random.nextInt(0, 3);
            String c=new String();
            if (number==0){
                c ="r";
            }
            else if(number==1){
                c="p";
            }
            else if(number==2){
                c="s";
            }
            Scanner sc=new Scanner(System.in);
            System.out.print("Select the option (r->rock, p->paper, s->scissor): ");
            String u=sc.next();

            if(c.equals(u)){
                System.out.println("game is tied");
            }
            else if(u.equals("r") && c.equals("p")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("Computer won the match.");
                co+=1;
            }
            else if(u.equals("p") && c.equals("s")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("Computer won the match.");
                us+=1;
            }
            else if(u.equals("s") && c.equals("r")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("Computer won the match.");
                co+=1;
            }
            else if(c.equals("r") && u.equals("p")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("You won the match.");
                us+=1;
            }
            else if(c.equals("p") && u.equals("s")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("You won the match.");
                co+=1;
            }
            else if(c.equals("s") && u.equals("r")){
                System.out.format("You choose %s and computer choose %s\n",u,c);
                System.out.println("You won the match.");
                co+=1;
            }
            i++;

        }
        if(us>co){
            System.out.println("\n Finally you won the cup");
        }
        else if (us==co){
            System.out.println("\n Match series is tied play the game again");
        }
        else{
            System.out.println("\n Finally computer won the cup");
        }

    }
}

