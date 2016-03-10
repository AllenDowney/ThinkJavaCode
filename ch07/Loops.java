import java.util.Scanner;

public class Loops {

    public static void countdown(int n) {
        while (n > 0) {
            System.out.println(n);
            n = n - 1;
        }
        System.out.println("Blastoff!");
    }

    public static void sequence(int n) {
        while (n != 1) {
            System.out.println(n);
            if (n % 2 == 0) {         // n is even
                n = n / 2;
            } else {                  // n is odd
                n = n * 3 + 1;
            }
        }
    }

    public static double scanDouble() {
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                okay = true;
            } else {
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number");
            }
        } while (!okay);
        double x = in.nextDouble();
        return x;
    }

    public static double scanDouble2() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number: ");
            if (in.hasNextDouble()) {
                break;
            }
            String word = in.next();
            System.err.println(word + " is not a number");
        }
        double x = in.nextDouble();
        return x;
    }

    public static double addNumbers() {
        Scanner in = new Scanner(System.in);
        int x = -1;
        int sum = 0;
        while (x != 0) {
            x = in.nextInt();
            if (x <= 0) {
                continue;
            }
            System.out.println("Adding " + x);
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("countdown");
        countdown(3);

        System.out.println("sequence");
        sequence(10);
    }

}
