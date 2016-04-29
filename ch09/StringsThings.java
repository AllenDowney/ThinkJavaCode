/**
 * Demonstates uses of Strings.
 */
public class StringsThings {

    public static void main(String[] args) {

        // Characters

        String fruit = "banana";
        char letter0 = fruit.charAt(0);

        if (letter0 == 'a') {
            System.out.println('?');
        }

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

        // Strings are immutable

        String name = "Alan Turing";
        String upperName = name.toUpperCase();

        String text = "Computer Science is fun!";
        text = text.replace("Computer Science", "CS");

        // String traversal

        for (int i = 0; i < fruit.length(); i++) {
            char letter = fruit.charAt(i);
            System.out.println(letter);
        }

        for (char letter : fruit.toCharArray()) {
            System.out.println(letter);
        }

        int length = fruit.length();
        char last = fruit.charAt(length - 1);  // correct

        System.out.println(reverse(fruit));

        // Substrings

        System.out.println(fruit.substring(0));
        System.out.println(fruit.substring(2));
        System.out.println(fruit.substring(6));

        System.out.println(fruit.substring(0, 3));
        System.out.println(fruit.substring(2, 5));
        System.out.println(fruit.substring(6, 6));

        // The indexOf method

        int index = fruit.indexOf('a');
        int index2 = fruit.indexOf('a', 2);

        // String comparison

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

        // Wrapper classes

        String str = "12345";
        int num = Integer.parseInt(str);

        num = 12345;
        str = Integer.toString(num);
    }

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

}
