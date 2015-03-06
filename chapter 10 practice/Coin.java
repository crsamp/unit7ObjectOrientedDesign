import java.util.ArrayList;
import java.util.Collections;

public class Coin implements Comparable
{
   private double value;
   private String name;
   
   public Coin(double value, String name)
   {
       this.value = value;
       this.name = name;
    }
    
   public int compareTo(Object otherObject)
   {
       Coin other = (Coin) otherObject;
       if(this.value<other.value)
       {
           return -1;
       }
       else if( this.value> other.value)
       {
           return +1;
       }
       else
       {
           return 0;
       }
   
   }

   public String toString()
   {
       return name + ": " + value;
   }
   
   public static void main(String[] args)
   {
       Coin quarter = new Coin(.25, "quarter");
       Coin dime = new Coin(.1,"dime");
       
       Comparable quarterObj = quarter;
       Comparable dimeObj = dime;
       
       if(dimeObj.compareTo(quarterObj)>0)
       {
           System.out.println("dime is more than the quarter");
       }
       else if(dimeObj.compareTo(quarterObj)<0)
       {
           System.out.println("quarter is more than the time.");
           
       }
       else
       {
           System.out.println("they have the same value");
       }
       
       ArrayList<Coin> list = new ArrayList<Coin>();
       list.add(quarter);
       list.add(dime);
       System.out.println(list);
       Collections.sort(list);
       System.out.println(list);
   }
}
    