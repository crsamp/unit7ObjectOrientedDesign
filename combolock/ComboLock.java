

public class ComboLock
{
    private int firstNum = 0;
    private int secondNum = 0;
    private int thirdNum = 0;
    private int firstGuess = 0;
    private int secondGuess = 0;
    private int thirdGuess = 0;
    private int whichNum = 1;
    private int startPosition = 0;
    public ComboLock(int secret1, int secret2, int secret3)
    {
        firstNum = secret1;
        secondNum = secret2;
        thirdNum = secret3;
    }
    public void reset()
    {
        firstGuess = 0;
        secondGuess = 0;
        thirdGuess = 0;
    }
    public void turnLeft(int ticks)
    {
        boolean numberOfTicks = true;
        while(numberOfTicks)
        {
            if(ticks>39)
            {
                ticks= ticks-40;
            }
            if(ticks<39)
            {
                numberOfTicks = false;
            }
        }
        if(whichNum == 1)
        {
            firstGuess = ticks;
            whichNum++;
        }
        else if(whichNum == 2)
        {
            secondGuess = Math.abs(firstGuess-ticks);
            System.out.println(secondGuess);
            whichNum++;
        }
        else
        {
            thirdGuess = Math.abs(secondGuess-ticks);
        }
    }
    public void turnRight(int ticks)
    {
        boolean numberOfTicks = true;
        while(numberOfTicks)
        {
            if(ticks>39)
            {
                ticks= ticks-40;
            }
            if(ticks<39)
            {
                numberOfTicks = false;
            }
        }
        if(whichNum == 1)
        {
            firstGuess = 40-ticks;
            System.out.println(firstGuess);
            whichNum++;
        }
        else if(whichNum == 2)
        {
            secondGuess = Math.abs(firstGuess-ticks);
            whichNum++;
        }
        else
        {
            thirdGuess = Math.abs(secondGuess-ticks-4);
            System.out.println(thirdGuess);
            whichNum++;
        }
    }
    public void open()
    {
        if(firstNum == firstGuess)
        {
            System.out.println("First number is correct");
        }
        if(secondNum == secondGuess)
        {
            System.out.println("Second number is correct");
        }
        if(thirdNum == thirdGuess)
        {
            System.out.println("Third number is correct");
        }
    }
}
    
        
