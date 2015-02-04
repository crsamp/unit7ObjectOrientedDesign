


public class Billfold
{
   
    private Card card1;
    private Card card2;
    
    
    public Billfold()
    {
        super();
    }

    public void addCard(Card card)
    {
        if(card1 == null)
        {
            card1 = card;
        }
        if(card2 == null)
        {
            card2 = card;
        }
    }
    
    public String formatCard()
    {
        String cardFormat = "";
        if (card1 != null)
        {
            cardFormat+="[ "+card1.format()+" | ";
        }
        if(card2!= null)
        {
            cardFormat+=card2.format()+" ]";
        }
        return cardFormat;        
    }
    
    public int getExpiredCardCount()
    {
        int count = 0;
        if(card1.isExpired() == true)
        {
            count++;
        }
        if(card2.isExpired() == true)
        {
            count++;
        }
        return count;
    }
}