import static java.lang.System.out;

public class EncrDecrV2 {
    
    public static void main(String args[]){
        int numofdol = 150, numofextra = 69, zerobithces = -151;
        String bitches = "How many bitches you've got = ", hmb, hmg;
        
        numofdol += 1;
        out.println(numofdol);

        numofdol +=zerobithces;
        hmb = bitches + numofdol;
        out.println( hmb);

        hmg = "How many guys you've gut = " + numofextra;
        hmg += numofdol;
        out.println(hmg);
    }
    
}
