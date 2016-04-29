/**
 * Test sorting algorithms for decks of cards.
 */
public class Test {

    /**
     * Checks that the deck is sorted.
     */
    public static void checkSorted(Deck deck) {
        Card[] cards = deck.getCards();
        for (int i = 0; i < cards.length - 1; i++) {
            if (cards[i].compareTo(cards[i + 1]) >= 0) {
                System.out.println("Card #" + i + " not sorted!");
            }
        }
    }

    /**
     * Demonstrates how to call the sorting methods.
     */
    public static void main(String[] args) {
        Deck deck;

        System.out.println("Testing selection...");
        deck = new Deck();
        deck.shuffle();
        deck.selectionSort();
        checkSorted(deck);

        System.out.println("Testing mergesort...");
        deck = new Deck();
        deck.shuffle();
        deck = deck.mergeSort();
        checkSorted(deck);

        System.out.println("Testing insertion...");
        deck = new Deck();
        deck.shuffle();
        deck.insertionSort();
        checkSorted(deck);
    }

}
