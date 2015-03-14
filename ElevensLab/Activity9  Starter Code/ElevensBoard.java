import java.util.List;
import java.util.ArrayList;

/**
 * The ElevensBoard class represents the board in a game of Elevens.
 */
public class ElevensBoard extends Board {

    /**
     * The size (number of cards) on the board.
     */
    private static final int BOARD_SIZE = 9;

    /**
     * The ranks of the cards for this game to be sent to the deck.
     */
    private static final String[] RANKS =
        {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};

    /**
     * The suits of the cards for this game to be sent to the deck.
     */
    private static final String[] SUITS =
        {"spades", "hearts", "diamonds", "clubs"};

    /**
     * The values of the cards for this game to be sent to the deck.
     */
    private static final int[] POINT_VALUES =
        {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0, 0, 0};

    /**
     * Flag used to control debugging print statements.
     */
    private static final boolean I_AM_DEBUGGING = false;

    /**
     * Creates a new <code>ElevensBoard</code> instance.
     */
    public ElevensBoard() {
        super(BOARD_SIZE, RANKS, SUITS, POINT_VALUES);
    }

    /**
     * Determines if the selected cards form a valid group for removal.
     * In Elevens, the legal groups are (1) a pair of non-face cards
     * whose values add to 11, and (2) a group of three cards consisting of
     * a jack, a queen, and a king in some order.
     * @param selectedCards the list of the indices of the selected cards.
     * @return true if the selected cards form a valid group for removal;
     *         false otherwise.
     */
    @Override
    public boolean isLegal(List<Integer> selectedCards) {
        int n = selectedCards.size();
        if (n <2)
        {
            return false;
        }
        else if (n == 2)
        {
            return this.containsPairSum11(selectedCards);
        }
        else if (n == 3)
        {
            return this.containsJQK(selectedCards);
        }
        else
        {
            return false;
        }
    }

    /**
     * Determine if there are any legal plays left on the board.
     * In Elevens, there is a legal play if the board contains
     * (1) a pair of non-face cards whose values add to 11, or (2) a group
     * of three cards consisting of a jack, a queen, and a king in some order.
     * @return true if there is a legal play left on the board;
     *         false otherwise.
     */
    @Override
    public boolean anotherPlayIsPossible() {
        List<Integer> cardsInPlay = new ArrayList<Integer>();
        cardsInPlay = this.cardIndexes();
        int count = 0;
        int numOfZeros = 0;
        for(int i = 1; i<cardsInPlay.size();i++)
        {

            List<Integer> selectedCards = new ArrayList<Integer>();
            List<Integer> selectedCards2 = new ArrayList<Integer>();
            selectedCards.add(i);
            selectedCards.add(i+1);

            if(this.isLegal(selectedCards) == true)
            {
                return true;
            }

            if(i == cardsInPlay.size()-1)
            {
                count++;
                if(count == 1)
                {
                    i = count+1;
                }
                else if(count == 2)
                {
                    i = count+1;
                }
                else if(count == 3)
                {
                    i = count+1;
                }
                else if(count == 4)
                {
                    i = count+1;
                }
                else if(count == 5)
                {
                    i = count+1;
                }
                else if(count == 6)
                {
                    i = count+1;
                }
                else if(count == 7)
                {
                    i = count+1;
                }
                else
                {
                    i = count+1;
                }

            }
            selectedCards2.add(i);
            selectedCards2.add(i+1);
            selectedCards2.add(i+2);
            if(this.isLegal(selectedCards2) == true)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Check for an 11-pair in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find an 11-pair.
     * @return true if the board entries in selectedCards
     *              contain an 11-pair; false otherwise.
     */
    private boolean containsPairSum11(List<Integer> selectedCards) {
        
        Card card1 = this.cardAt(selectedCards.get(0));
        Card card2 = this.cardAt(selectedCards.get(1));
        if(card1.pointValue()+card2.pointValue() == 11)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    /**
     * Check for a JQK in the selected cards.
     * @param selectedCards selects a subset of this board.  It is list
     *                      of indexes into this board that are searched
     *                      to find a JQK group.
     * @return true if the board entries in selectedCards
     *              include a jack, a queen, and a king; false otherwise.
     */
    private boolean containsJQK(List<Integer> selectedCards) {
        
        Card card1 = this.cardAt(selectedCards.get(0));
        Card card2 = this.cardAt(selectedCards.get(1));
        Card card3 = this.cardAt(selectedCards.get(2));
        String firstRank = card1.rank();
        String secondRank = card2.rank();
        String thirdRank = card3.rank();
        int jackCounter = 0;
        int queenCounter = 0;
        int kingCounter = 0;
        if(firstRank == "jack")
        {
            jackCounter++;
        }
        if(firstRank == "queen")
        {
            queenCounter++;
        }
        if(firstRank == "king")
        {
            kingCounter++;
        }
        if(secondRank == "jack")
        {
            jackCounter++;
        }
        if(secondRank == "queen")
        {
            queenCounter++;
        }
        if(secondRank == "king")
        {
            kingCounter++;
        }
        if(thirdRank == "jack")
        {
            jackCounter++;
        }
        if(thirdRank == "queen")
        {
            queenCounter++;
        }
        if(thirdRank == "king")
        {
            kingCounter++;
        }
        if(jackCounter == 1 && queenCounter == 1 && kingCounter == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
