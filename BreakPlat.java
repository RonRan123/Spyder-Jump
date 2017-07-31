//Name:Ronith Ranjan     Date:07/31/2017
import java.awt.*;
import javax.swing.*;
public class BreakPlat extends Platform
{
   private ImageIcon breakPlat;
   private boolean broken = false;
   public BreakPlat(double x, double y, double length)
   {
      super(x, y, length);
   }
   
   public void draw(Graphics myBuffer)
   {
   breakPlat = new ImageIcon("images/BreakPlat.png");
   if(broken == false)
   {
      myBuffer.drawImage(breakPlat.getImage(),(int)getX(), (int)getY(),(int)getLength(), breakPlat.getIconWidth(),null);
      }
      
   }
   public void setBroken()
   {
   }
}