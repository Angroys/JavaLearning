public abstract class Test2 {
    public static void main(String args[]){
        for(int num = 0; num < 3; num ++)
            for (int row = 0; row < 5; row++) {
                for (int column = 0; column <= row; column++) { 
                    System.out.print("*");
                }
        System.out.println(); 
          }
    }
}
