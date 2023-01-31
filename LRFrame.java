import javax.swing.JFrame;

public class LRFrame {
    public static void main(String args[]){
        JFrame myFrame = new JFrame();
        String myTitle = "Normal Window";
        
        myFrame.setSize(300, 300);
        myFrame.setTitle(myTitle);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);
    }
}
