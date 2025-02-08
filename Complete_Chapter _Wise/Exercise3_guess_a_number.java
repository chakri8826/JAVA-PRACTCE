package src;
import java.util.Random;
import java.util.Scanner;
class Game {
    int num;
    int user;
    int noOfGuesses;
    boolean b ;

    public Game() {
        Random random = new Random();
        int number = random.nextInt(1, 100);
         num = number;
    }
//    public int getNum() {
//        return num;
//    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number: ");
        int use = sc.nextInt();
        user = use;
    }

    public boolean isCorrectNumber(){
        if (num==user){
            System.out.println("You guessed it correctly.");
            b = true;
        }
        else {
            if(num>user){
                System.out.println("You guessed it wrong! Enter a bigger number");
                b = false;
            }
            else if(num<user){
                System.out.println("You guessed it wrong! Enter a smaller number");
                b = false;
            }
        }
        return b;

    }

    public int getnoOfGuesses(){
        System.out.print("Congratulaions you have Won the game!!!, and your score is ");
        return noOfGuesses;
    }
    public void setnoOfGuesses(int no_of_guesses){
        noOfGuesses = no_of_guesses ;
    }
}
    public class Exercise3_guess_a_number {
    /*
    create a class Game, which allows user to play "Guess the number" game once.
    Game should have the following methods:
    1. Constructor to generate a random number
    2. takeUserInput() to take input number from the user.
    3. isCorrectNumber() to detect whether the number entered by the user is true
    4. getter and setter  fo noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!
    */
    public static void main(String[] args) {
        Game game = new Game();
//        System.out.println(game.getNum());
        game.takeUserInput();
        int no_of_guesses = 1;
        while(!game.isCorrectNumber()){
            game.takeUserInput();
            no_of_guesses++;
        }
        game.setnoOfGuesses(no_of_guesses);
        System.out.println(game.getnoOfGuesses());
//        System.out.println("Congratulaions you have Won the game!!!, and your score is "+no_of_guesses);








    }
}
