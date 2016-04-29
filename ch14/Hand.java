/**
 * A hand of playing cards.
 */
public class Hand extends CardCollection {

    /**
     * Constructs an empty hand.
     */
    public Hand(String label) {
        super(label);
    }

    /**
     * Prints the label and cards.
     */
    public void display() {
        System.out.println(getLabel() + ": ");
        for (int i = 0; i < size(); i++) {
            System.out.println(getCard(i));
        }
        System.out.println();
    }

}
