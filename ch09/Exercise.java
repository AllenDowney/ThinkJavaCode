/**
 * Exercise on encapsulation and generalization.
 */
public class Exercise {

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
        }

        System.out.println(count);
    }

}
