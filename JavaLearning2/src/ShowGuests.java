import static java.lang.System.out;
import javax.swing.JOptionPane;


public class ShowGuests {

    public static void main(String[]args) {
        DummiesFrame frame = new DummiesFrame("Guests in Room");
        frame.addRow("Room Num");
        frame.go();


    }

    public static String calculate(int i){
        int guests[] = {1, 4, 2, 0, 2, 1, 4, 3, 0, 2};
        return  "The room num " + i + " has " + guests[i - 1];
    }


}
