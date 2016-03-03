import java.util.Scanner;

/**
 * Examples from Chapter 5.
 */
public class Conditional {

    public static void main(String[] args) {
        String fruit1 = "Apple";
        String fruit2 = "Orange";
        System.out.println(fruit1.equals(fruit2));

        int x = 17;
        int n = 18;

        if (x > 0) {
            System.out.println("x is positive");
        }

        if (x % 2 == 0) {
            System.out.println("x is even");
        } else {
            System.out.println("x is odd");
        }

        if (x > 0) {
            System.out.println("x is positive");
        } else if (x < 0) {
            System.out.println("x is negative");
        } else {
            System.out.println("x is zero");
        }

        if (x == 0) {
            System.out.println("x is zero");
        } else {
            if (x > 0) {
                System.out.println("x is positive");
            } else {
                System.out.println("x is negative");
            }
        }
        boolean evenFlag = (n % 2 == 0);    // true if n is even
        boolean positiveFlag = (x > 0);     // true if x is positive

        if (evenFlag) {
            System.out.println("n was even when I checked it");
        }

        if (!evenFlag) {
            System.out.println("n was odd when I checked it");
        }

        System.out.println("printLogarithm");
        printLogarithm(3.0);

        System.out.println("countdown");
        countdown(3);

        System.out.println("countup");
        countup(3);

        System.out.println("newLine");
        newLine();

        System.out.println("nLines");
        nLines(3);

        System.out.println("threeLine");
        threeLine();

        System.out.println("displayBinary");
        displayBinary(23);
        System.out.println();

        System.out.println("scandouble");
        scanDouble();

        System.out.println("scandouble2");
        scanDouble2();
    }

    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void scanDouble2() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            return;
        }
        double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void newLine() {
        System.out.println();
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void nLines(int n) {
        if (n > 0) {
            System.out.println();
            nLines(n - 1);
        }
    }

    public static void forever(String s) {
        System.out.println(s);
        forever(s);
    }

    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static void displayBinary(int value) {
        if (value > 0) {
            displayBinary(value / 2);
            System.out.print(value % 2);
        }
    }
}
