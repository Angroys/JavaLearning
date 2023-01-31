import javax.swing.JOptionPane;

public class AuthenticatorV3 {

    public static void main(String args[]){
        String estigay = JOptionPane.showInputDialog(null, "Esti inteligent. 'Nu' e raspunsul");
        
        while(estigay == null 
              || estigay.equals("Da") 
              || estigay.equals("") 
              || !estigay.equals("Nu")
              )
              {
            estigay = JOptionPane.showInputDialog(null, "Hui, nu inteligent esti, pune raspunsul adevarat");

        }
    
    }
    
}
