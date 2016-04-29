import java.util.Arrays;

/**
 * Demonstrates uses of arrays.
 */
public class ArrayExamples {

    /**
     * Example code from Chapter 8.
     */
    public static void main(String[] args) {
        int size = 10;
        int[] counts = new int[4];
        double[] values = new double[size];

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;
        counts[3] -= 60;

        // traversal with a while loop
        int j = 0;
        while (j < 4) {
            System.out.println(counts[j]);
            j++;
        }

        // traversal with a for loop
        for (int i = 0; i < 4; i++) {
            System.out.println(counts[i]);
        }

        int[] array = {1, 2, 3, 4};
        printArray(array);

        // printing an array as an object
        System.out.println(array);

        // printing with Arrays class
        System.out.println(Arrays.toString(array));

        // copying an array
        double[] a = {1.0, 2.0, 3.0};
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        // copying with Arrays class
        double[] c = Arrays.copyOf(a, a.length);

        // traversal
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.pow(a[i], 2.0);
        }

        // search
        int index = search(a, 2.0);
        System.out.println("index = " + index);

        // reduce
        double total = sum(a);
        System.out.println("total = " + total);
    }

    /**
     * Prints the elements of an array.
     */
    public static void printArray(int[] array) {
        System.out.print("{" + array[0]);
        for (int i = 1; i < array.length; i++) {
            System.out.print(", " + array[i]);
        }
        System.out.println("}");
    }

    /**
     * Returns the index of the target in the array, or -1 if not found.
     */
    public static int search(double[] a, double target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the total of the elements in an array.
     */
    public static double sum(double[] a) {
        double total = 0.0;
        for (int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

}
