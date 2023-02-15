import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;


public class ReapetingGuess {

        public static void main(String args[]){
            Scanner keyboard = new Scanner(System.in);
            
            int nrGuesses = 0;
            int randomNr = new Random().nextInt(100) + 1;

            out.println("WELCOME TO THE GUESSING GAME");

            out.println("Enter a num from  1 to 100)");

            int inputNR = keyboard.nextInt();

            nrGuesses++;

            while (inputNR != randomNr){
                out.println();
                out.println("Try again, u suck");
                out.println("Enter a int from 1 to 10");
                inputNR = keyboard.nextInt();
                if (inputNR < randomNr){
                    out.println("Try a higher nr");
                }else{
                    out.println("Try a lower number");
                }
                nrGuesses++;

            }

            out.println("YOU WON THE GAME");
            out.println(nrGuesses + " guesses.");

            keyboard.close();

        }

    
}
