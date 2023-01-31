import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;



public class RandomGuess {

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        
        
        
        out.println("Enter an int from 1 to 10:P");

        int inputNum = keyboard.nextInt();
        int randomNum = new Random().nextInt(10) + 1;

        if (inputNum == randomNum) {
            out.println("*********");
            out.println("You won");
            out.println("*********");
        } else {
            out.println("*********");
            out.println("You lose");
            out.print("The number was ");
            out.println(randomNum + "!");

        }
        out.println("Thank you for playing");
        keyboard.close();

    }
}
