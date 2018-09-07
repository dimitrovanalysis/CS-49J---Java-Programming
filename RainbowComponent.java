import java.awt.Graphics;
import java.awt.Graphics2D;


import javax.swing.JComponent;

public class RainbowComponent extends JComponent
{

   private static final long serialVersionUID = 1L;
   
   public void paintComponent(Graphics g)
   {  
      // Recover Graphics2D
      Graphics2D g2 = (Graphics2D) g;
      
      Rainbow rainbow = new Rainbow(0,0,20);
      rainbow.draw(g2);
      Rainbow rainbow1 = new Rainbow(100,180,10);
      rainbow1.draw(g2);
      Rainbow rainbow2 = new Rainbow(0,200,5);
      rainbow2.draw(g2);
   
   }
   
   

    
}
