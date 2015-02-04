import java.util.Scanner;

public class FillInQuestion extends Question
{
    
    //specified text: "The inventr of java is _James Gosling_ from Sun."
    //Convert the specified text into the tesxt to display and the answer
    // text: "The inventor of Java is _____ from Sun."
    // answer: "James Gosling"
    public FillInQuestion()
    {
        
    }
    
    public void setText(String questionText)
    {
        Scanner parser = new Scanner(questionText);
        parser.useDelimiter("_");
        String question = parser.next();
        String answer = parser.next();
        question+= "______"+parser.next();
        
        super.setText(question);
        super.setAnswer(answer);
    }
}