import java.util.Scanner;
import java.util.ArrayList;

public class Person implements Comparable<Person>
{
    private String name;
    public Person(String name)
    {
        this.name = name;
    }
    
    public int compareTo(Person otherPerson)
    {
        return this.name.compareTo(otherPerson.name);
        
        
    }

}