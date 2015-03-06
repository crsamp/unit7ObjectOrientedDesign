
import javax.swing.JFrame;

public class CircleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Circle creater");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CircleComponent component = new CircleComponent(500,500);
        frame.add(component);
        frame.setVisible(true);
    }
    
    
    
}