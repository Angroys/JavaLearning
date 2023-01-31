public class Predction {
    public static void main(String args[]){
        int  i = 10;
        System.out.println(i++); 
        System.out.println(--i); 
        --i;
        i--;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i++    + ++i;
        System.out.println(i); 
        i = i++    + i++;
        System.out.println(i);
    }
}





/*
 * 11
 * 10
 * 8
 * 9
 * 8
 * 8
 * 9
 * 19
 * 38
 */