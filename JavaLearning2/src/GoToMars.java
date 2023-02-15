import static java.lang.System.out;

public class GoToMars {

    public static void main(String[] args){
        out.println("main is running: ");

        EnglishSpeakingWorld e = new EnglishSpeakingWorld();

        out.println(e.mars);
        e.visitPensylvania();
    }
}
