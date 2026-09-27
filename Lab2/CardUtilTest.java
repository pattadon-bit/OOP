package Lab2;
public class CardUtilTest {
    public static void main(String[] args) {
        Card card1 = new Card(Rank.ACE, Suit.SPADES);
        Card card2 = new Card(Rank.KING, Suit.HEARTS);

        System.out.println("Card 1 is highest card: " + CardUtil.isHighestCard(card1));
        System.out.println("Card 2 is highest card: " + CardUtil.isHighestCard(card2));
    }
}