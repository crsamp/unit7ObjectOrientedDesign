

public class ChoiceQuestion extends Question
{
    
    // text: "The primatry cololrs of light are:"
    // 1) red, blue, yellow
    // 2) red, blue, green
    // 3) purple, blue, yellow
    
    private int numberOfChoices;
    
    public ChoiceQuestion()
    {
        super();
       numberOfChoices = 0;
    }

   public void addCoice(String choice, boolean correct)
   {
       numberOfChoices++;
       
       super.addText("/n"+numberOfChoices+") "+choice);
       
       if(correct)
       {
           String choiceAnswer = "" + numberOfChoices;
           super.setAnswer(choiceAnswer);
       }
   }
   
   
}
