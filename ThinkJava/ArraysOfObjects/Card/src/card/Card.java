package card;

/**
 * @author SamJay
 */
public class Card {

    //instance variables
    private final int rank;
    private final int suit;
    //class variables
    public static final String[] SUITS = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static final String[] RANKS = {null, "Ace", "2", "3", "4", "5", "6",
        "7", "8", "9", "10", "Jack", "Queen", "King"};
    
    //default constructor


    public Card(int rank, int suit) {
        this.rank = rank;
        this.suit = suit;

    }

    @Override
    public String toString() {
        String s = RANKS[this.rank] + " of " + SUITS[this.suit]
                +"\tRank:  "+RANKS[this.getRank()]+"\tSuit: "+SUITS[this.getSuit()];
        return s;
    }

    //compare to methods
    public boolean equals(Card that) {
        return this.rank == that.rank
                && this.suit == that.suit;
    }

    public int compareTo(Card that) {
        if (this.suit < that.suit) {
            return -1;
        }
        if (this.suit > that.suit) {
            return 1;
        }
        if (this.rank < that.rank) {
            return -1;
        }
        if (this.rank > that.rank) {
            return 1;
        }
        return 0;
    }

    //getters 
    public int getRank() {
        return this.rank;
    }

    public int getSuit() {
        return this.suit;
    }

    public static void printListOfCards() {
        Card[] cards = new Card[52];
        int index = 0;
        for (int suity = 0; suity <= 3; suity++) {
            for (int ranky = 1; ranky <= 13; ranky++) {
                cards[index] = new Card(ranky, suity);
                index++;
            }
        }
        int count=0;
        while(count<52){
            System.out.print("\t" + cards[count] + "\n");
            count++;
        }
        
    }

    public static void main(String[] args) {
//        Card card = new Card(3, 0);
//        Card that = new Card(4, 9);
//        System.out.println(card);
//        System.out.println(card.compareTo(that));
//        System.out.println(card.equals(that));
        printListOfCards();

    }

}
