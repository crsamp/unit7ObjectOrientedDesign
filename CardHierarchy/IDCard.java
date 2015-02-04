
public class IDCard extends Card
{
    private String idNumber;
    public IDCard(String n, String id)
    {
        super(n);
        idNumber = id;
    }
    
    public String format()
    {
        String cardFormat = super.format();
        cardFormat +="\n ID number: "+idNumber;
        return cardFormat;  
    }
    
    public boolean isExpired()
    {
        return false;
    }
}