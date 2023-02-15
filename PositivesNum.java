import static java.lang.System.out;
import java.util.Scanner;

public class PositivesNum {
    
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);

        out.println("Enter an int num");

        int number = keyboard.nextInt();

        while (number > 0){
            out.println("Print another number");
            number = keyboard.nextInt();


        }

        out.println("Srry your num was negative || 0");
    }
}
