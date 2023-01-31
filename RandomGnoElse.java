import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;
import java.util.Random;


public class RandomGnoElse{

    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(in);

        out.println("Give a number from 1 to 10");

        int inputNum = keyboard.nextInt();
        int randonNum = new Random().nextInt(10) + 1;

        if(inputNum == randonNum){
            out.println("You won");
            
        } 
        out.println("Thats was a very good guess, ur a smart guy :/");
        out.print("The random number was: ");
        out.println(randonNum + "!");

        keyboard.close();


    }
}