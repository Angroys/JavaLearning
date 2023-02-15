import static java.lang.System.out;
import java.util.Scanner;

public class VerseSwitch{

    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        out.print("Whice verse ");
        int verse = keyboard.nextInt();

        switch (verse) { 
        case 1:
            out.println("I won't lie to you");
            break;

        case 2:    
            out.println("i know he's not right fot you");
            break;

        case 3:    
            out.println("And you can tell me if ");
            break;

        default:
            out.println("No such verse");
            break;
        }
        
        out.println("Ohmygod");
        keyboard.close();
        
    }

}