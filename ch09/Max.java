import java.util.Arrays;

/**
 * Demonstrates command-line arguments.
 */
public class Max {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

        int max = Integer.MIN_VALUE;
        for (String arg : args) {
            int value = Integer.parseInt(arg);
            if (value > max) {
                max = value;
            }
        }
    }
}
