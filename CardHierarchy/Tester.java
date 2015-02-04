

public class Tester
{
    
    public Tester()
    {
       Card firstCard = new IDCard("Chris","8916");
       Card secondCard = new DriversLicense("Chris","4836739",2014);
       String firstCardTest = firstCard.format();
       String secondCardTest = secondCard.format();
       System.out.print(firstCardTest);
       System.out.print(secondCardTest);
       
       Billfold firstBillfold = new Billfold();
       firstBillfold.addCard(firstCard);
       firstBillfold.addCard(secondCard);
       int expired = firstBillfold.getExpiredCardCount();
       System.out.print("\n"+expired);
    }


}
