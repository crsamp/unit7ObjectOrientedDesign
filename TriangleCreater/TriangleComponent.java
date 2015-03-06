import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

public class TriangleComponent extends JComponent
{

    private int x;
    private int y;
    private int count;
    private int xLocation1;
    private int yLocation1;
    private int xLocation2;
    private int yLocation2;
    private int xLocation3;
    private int yLocation3;
    public TriangleComponent(int x, int y)
    {
        this.x = x;
        this.y = y;
        count = 1;
        
        MouseListener listener = new MouseClick();
        this.addMouseListener(listener);
        
    }

    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        if(count == 2)
        {
            Ellipse2D circle = new Ellipse2D.Double(xLocation1,yLocation1,2.0,2.0);
            g2.draw(circle);
        }
        
        else if(count == 3)
        {
            Line2D lin1 = new Line2D.Float(xLocation1,yLocation1,xLocation2,yLocation2);
            g2.draw(lin1);
            
        }
        
        else if(count == 4)
        {
            Line2D lin2 = new Line2D.Float(xLocation2,yLocation2,xLocation3,yLocation3);
            Line2D lin3 = new Line2D.Float(xLocation1,yLocation1,xLocation3,yLocation3);
            Line2D lin1 = new Line2D.Float(xLocation1,yLocation1,xLocation2,yLocation2);
            g2.draw(lin1);
            g2.draw(lin2);
            g2.draw(lin3);
            
        }
        else
        {
            Line2D lin1 = new Line2D.Float(xLocation1,yLocation1,xLocation2,yLocation2);
            Line2D lin2 = new Line2D.Float(xLocation2,yLocation2,xLocation3,yLocation3);
            Line2D lin3 = new Line2D.Float(xLocation1,yLocation1,xLocation3,yLocation3);
            g2.draw(lin1);
            g2.draw(lin2);
            g2.draw(lin3);
        }
            
    }
    
    public class MouseClick implements MouseListener
    {
        public void mouseClicked(MouseEvent e)
        {
            
            if(count == 1)
            {
                xLocation1 = e.getX();
                yLocation1 = e.getY();
                count++;
                repaint();
            }
            else if(count ==2)
            {
                xLocation2 = e.getX();
                yLocation2 = e.getY();
                count++;
                repaint();
            }
            else if(count ==3)
            {
                xLocation3 = e.getX();
                yLocation3 = e.getY();
                count++;
                repaint();
            }
            else
            {
                xLocation1 = 0;
                yLocation1 = 0;
                xLocation2 = 0;
                yLocation2 = 0;
                xLocation3 = 0;
                yLocation3 = 0;
                repaint();
                count=1;
            }
        }
        
        public void mouseEntered(MouseEvent e)
        {
        }
        
        public void mouseExited(MouseEvent e)
        {
        }
        
        public void mousePressed(MouseEvent e)
        {
        }
        
        public void mouseReleased(MouseEvent e)
        {
        }
        
        
        
    }


}
