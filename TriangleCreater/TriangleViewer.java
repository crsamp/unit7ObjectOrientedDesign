import javax.swing.JFrame;

public class TriangleViewer
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setSize(500,500);
        frame.setTitle("Triangle creater");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TriangleComponent component = new TriangleComponent(500,500);
        frame.add(component);
        frame.setVisible(true);
    }
    
    
    
}