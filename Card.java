public class Card
{
    private short rank, suit;
    private static String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs", "Joker"    };
    private static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    private static String[] jokers = {"Joker", "Joker"};
    private static String[] ranks2 = {"0", "0"};
    public static String rankAsString( int __rank ) {
        if (__rank != 0){
            return ranks[__rank];
        }//End of if statement
        return ranks2[__rank];
    }//End of rankAsString class

    Card(short suit, short rank)
    {
        this.rank=rank;
        this.suit=suit;
    }//End of Card Initializer

    public @Override String toString()
    {
        if(suit == 5){
            return "Joker";
        }//End of if statement that calls jokers
        if(rank == 0){
            return "Joker";
        }
        return ranks[rank] + " of " + suits[suit];
    }//End of toString method

    public short getRank() {
         return rank;
    }//End of getRank method

    public short getSuit() {
        return suit;
    }//End of getSuit method
}//End of Card
