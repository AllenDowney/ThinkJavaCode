/**
 * Search algorithms for arrays of cards.
 */
public class Search {

    /**
     * Make an array of 52 cards.
     */
    public static Card[] makeDeck() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[index] = new Card(rank, suit);
                index++;
            }
        }
        return cards;
    }

    /**
     * Displays the given deck of cards.
     */
    public static void printDeck(Card[] cards) {
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
    }

    /**
     * Sequential search.
     */
    public static int search(Card[] cards, Card target) {
        for (int i = 0; i < cards.length; i++) {
            if (cards[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Binary search (iterative version).
     */
    public static int binarySearch(Card[] cards, Card target) {
        int low = 0;
        int high = cards.length - 1;
        while (low <= high) {
            System.out.println(low + ", " + high);

            int mid = (low + high) / 2;                 // step 1
            int comp = cards[mid].compareTo(target);

            if (comp == 0) {                            // step 2
                return mid;
            } else if (comp < 0) {                      // step 3
                low = mid + 1;
            } else {                                    // step 4
                high = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Binary search (recursive version).
     */
    public static int binarySearch(Card[] cards, Card target,
                                   int low, int high) {
        System.out.println(low + ", " + high);

        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;                     // step 1
        int comp = cards[mid].compareTo(target);

        if (comp == 0) {                                // step 2
            return mid;
        } else if (comp < 0) {                          // step 3
            return binarySearch(cards, target, mid + 1, high);
        } else {                                        // step 4
            return binarySearch(cards, target, low, mid - 1);
        }
    }

    /**
     * Demonstrates how to call the search methods.
     */
    public static void main(String[] args) {
        Card[] cards = makeDeck();
        Card jack = new Card(11, 0);
        Card fake = new Card(15, 1);

        System.out.println("Sequential search");
        System.out.println(search(cards, jack));
        System.out.println();

        System.out.println("Binary search");
        System.out.println(binarySearch(cards, jack));
        System.out.println();

        System.out.println("Failed binary search");
        System.out.println(binarySearch(cards, fake));
        System.out.println();

        System.out.println("Recursive binary search");
        System.out.println(binarySearch(cards, jack, 0, 51));
        System.out.println();
    }

}
