import java.util.Arrays;
import java.util.Random;

/**
 * A deck of playing cards (of fixed size).
 */
public class Deck {

    // This is a class variable so we don't have to create
    // a new Random object every time we call randomInt.
    private static Random random = new Random();

    private Card[] cards;

    /**
     * Constructs a standard deck of 52 cards.
     */
    public Deck() {
        this.cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                this.cards[index] = new Card(rank, suit);
                index++;
            }
        }
    }

    /**
     * Constructs a deck of n cards (null).
     */
    public Deck(int n) {
        this.cards = new Card[n];
    }

    /**
     * Gets the internal cards array.
     */
    public Card[] getCards() {
        return this.cards;
    }

    /**
     * Returns a string representation of the deck.
     */
    public String toString() {
        return Arrays.toString(this.cards);
    }

    /**
     * Swaps the cards at indexes i and j.
     */
    public void swapCards(int i, int j) {
        Card temp = this.cards[i];
        this.cards[i] = this.cards[j];
        this.cards[j] = temp;
    }

    /**
     * Chooses a random number between low and high, including both.
     */
    public int randomInt(int low, int high) {
        int range = high - low + 1;
        return low + random.nextInt(range);
    }

    /**
     * Randomly permutes the array of cards.
     */
    public void shuffle() {
        for (int i = 0; i < this.cards.length - 1; i++) {
            int j = this.randomInt(i, this.cards.length - 1);
            this.swapCards(i, j);
        }
    }

    /**
     * Finds the index of the lowest card
     * between low and high inclusive.
     */
    public int indexLowest(int low, int high) {
        int index = low;
        Card minCard = this.cards[low];
        for (int i = low + 1; i <= high; i++) {
            Card card = this.cards[i];
            if (card.compareTo(minCard) < 0) {
                index = i;
                minCard = card;
            }
        }
        return index;
    }

    /**
     * Sorts the cards (in place) using selection sort.
     */
    public void selectionSort() {
        int high = this.cards.length - 1;
        for (int i = 0; i < this.cards.length; i++) {
            int j = this.indexLowest(i, high);
            this.swapCards(i, j);
        }
    }

    /**
     * Returns a subset of the cards in the deck.
     */
    public Deck subdeck(int low, int high) {
        Deck sub = new Deck(high - low + 1);
        for (int i = 0; i < sub.cards.length; i++) {
            sub.cards[i] = this.cards[low + i];
        }
        return sub;
    }

    /**
     * Combines two previously sorted subdecks.
     */
    public static Deck merge(Deck d1, Deck d2) {
        Card[] c1 = d1.cards;
        Card[] c2 = d2.cards;
        Deck result = new Deck(c1.length + c2.length);
        Card[] c3 = result.cards;
        int i = 0; // index in c1
        int j = 0; // index in c2

        // for each index in the result
        for (int k = 0; k < c3.length; k++) {
            int choice;

            // determine which card to merge next
            if (i >= c1.length) {
                choice = 2;  // c1 is empty
            } else if (j >= c2.length) {
                choice = 1;  // c2 is empty
            } else if (c1[i].compareTo(c2[j]) < 0) {
                choice = 1;  // c1 is lower
            } else {
                choice = 2;  // c2 is lower
            }

            // store the chosen card in the result
            if (choice == 1) {
                c3[k] = c1[i];
                i++;
            } else {
                c3[k] = c2[j];
                j++;
            }
        }
        return result;
    }

    /**
     * Returns a sorted copy of the deck using merge sort.
     */
    public Deck mergeSort() {

        // 0 or 1 cards, already sorted
        int len = this.cards.length;
        if (len < 2) {
            return this;
        }

        // cut the deck about in half
        int mid = len / 2;
        Deck d1 = this.subdeck(0, mid - 1);
        Deck d2 = this.subdeck(mid, len - 1);

        // sort each half and merge
        d1 = d1.mergeSort();
        d2 = d2.mergeSort();
        return merge(d1, d2);
    }

    /**
     * Reorders the cards (in place) using insertion sort.
     */
    public void insertionSort() {
        for (int i = 1; i < this.cards.length; i++) {
            Card card = this.cards[i];
            this.insert(card, i);
        }
    }

    /**
     * Helper method for insertion sort.
     */
    private void insert(Card card, int i) {
        int j = i;
        while (j > 0 && card.compareTo(this.cards[j - 1]) < 0) {
            this.cards[j] = this.cards[j - 1];
            j--;
        }
        this.cards[j] = card;
    }
}
