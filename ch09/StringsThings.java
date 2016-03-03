/**
 * Demonstates uses of Strings.
 */
public class StringsThings {

    /**
     * Reverses a string, returns a new String.
     */
    public static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            r = r + s.charAt(i);
        }
        return r;
    }

    public static void main(String[] args) {

        System.out.print("Roman alphabet: ");
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.print(c);
        }
        System.out.println();

        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
            System.out.print((char) i);
        }
        System.out.println();

        String fruit = "banana";

        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";
        if (name1.equals(name2)) {
            System.out.println("The names are the same.");
        }

        int diff = name1.compareTo(name2);
        if (diff == 0) {
            System.out.println("The names are the same.");
        } else if (diff < 0) {
            System.out.println("name1 comes before name2.");
        } else if (diff > 0) {
            System.out.println("name2 comes before name1.");
        }

        System.out.println(reverse(name1));
    }
}
