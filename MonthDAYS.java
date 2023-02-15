import static java.lang.System.*;
import java.util.Scanner;

public class MonthDAYS {
    
    public static void main(String args[]){

        Scanner keyboard = new Scanner(in);

        out.println("Enter a month to reveal its number of days");
        String month = keyboard.next();

        switch(month){
            case("January"):
                out.println("31 days");
                break;
            case("February"):
                out.println("28 days");
                break;
            case("March"):
                out.println("30 days");
                break;
            case("April"):
                out.println("31 days");
                break;   
            case("May"):
                out.println("30 days");
                break;
            case("June"):
                out.println("31 days");
                break;   
            case("July"):
                out.println("30 days");
                break;       
            case("August"):
                out.println("31 days");
                break;   
            case("September"):
                out.println("30 days");
                break;   
            case("October"):
                out.println("31 days");
                break;   
            case("November"):
                out.println("30 days");
                break;   
            case("December"):
                out.println("31 days");
                break;   

            default:
            out.println("Doesn't exist this month");
        }


    }
}
