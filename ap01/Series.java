/**
 * Example method from Chapter 6.
 */
public class Series {

    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        if (fibonacci(1) != 1) {
            System.err.println("fibonacci(1) is incorrect");
        }
        if (fibonacci(2) != 1) {
            System.err.println("fibonacci(2) is incorrect");
        }
        if (fibonacci(3) != 2) {
            System.err.println("fibonacci(3) is incorrect");
        }
    }

}
