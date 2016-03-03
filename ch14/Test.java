/**
 * Test code for Deck and Hand.
 */
public class Test {

    /**
     * Test code.
     */
    public static void main(String[] args) {
        Deck deck = new Deck("Deck");
        deck.shuffle();
        System.out.println(deck);

        Hand hand = new Hand("Hand");
        deck.deal(hand, 5);
        hand.display();

        Hand drawPile = new Hand("Draw Pile");
        deck.dealAll(drawPile);
        System.out.println(drawPile.size());
    }
}
