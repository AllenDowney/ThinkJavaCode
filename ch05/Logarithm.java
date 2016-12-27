import java.util.Scanner;

public class Logarithm {

    public static void main(String[] args) {
        System.out.println("printLogarithm");
        printLogarithm(3.0);

        Scanner in = new Scanner(System.in);

        System.out.println("scandouble");
        scanDouble(in);

        System.out.println("scandouble2");
        scanDouble2(in);
    }

    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    public static void scanDouble(Scanner in) {
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void scanDouble2(Scanner in) {
        System.out.print("Enter a number: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }

}
