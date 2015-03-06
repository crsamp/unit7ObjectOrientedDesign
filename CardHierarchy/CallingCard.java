

public class CallingCard extends Card
{
    private String cardNumber;
    public CallingCard(String n, String num)
    {
        super(n);
        cardNumber = num;
    }
    
    public String format()
    {
        String callingFormat = super.format();
        callingFormat+="\n Card Number: "+cardNumber;
        return callingFormat;
    }
    
    public boolean isExpired()
    {
        return false;
    }
    
    public boolean equals(Object otherObject)
    {
        if(this.getClass() == otherObject.getClass())
        {
            CallingCard other = (CallingCard) otherObject;
            return this.getName().equals(other.getName())
                && this.cardNumber.equals(other.cardNumber)
                && this.pin == other.pin;
        }
        return false;
    }
}
    