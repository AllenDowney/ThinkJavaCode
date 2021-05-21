import javax.naming.spi.DirStateFactory.Result;

public class Teste {
    /**
    * Tests whether x is a single digit integer.
    *
    * @param x the integer to test
    * @return true if x has one digit, false otherwise
    */

    public static boolean isSingleDigit
    (int x) {
    if (x > -10 && x < 10) {
        return true;
    } else {
        return false;
        }
    }

    public static int fatorial (int n) {
        if (n == 0) {
            return 1;
        } 
        int recurse = fatorial(n-1);
        int result = n * recurse;
        
        return result;
    }
    public static void main(String[] args) {
        System.out.println(!isSingleDigit(5));
        boolean bigFlag = !isSingleDigit(17);
        System.out.println(bigFlag);
        System.out.println(fatorial(3));
        System.out.println("boo!");
    }
}

