//Name:Ronith Ranjan     Date:07/12/20
import java.awt.*;
import javax.swing.*;
public class RegPlat extends Platform
{
public RegPlat(double x, double y, double length)
   {
      super(x, y, length);
   }
   public void draw(Graphics myBuffer)
   {
      ImageIcon regPlat = new ImageIcon("images/RegPlat.png");
      myBuffer.drawImage(regPlat.getImage(),(int)getX(), (int)getY(),(int)getLength(), regPlat.getIconWidth(),null);
   }
   }