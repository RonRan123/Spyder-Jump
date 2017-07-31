//Name:Ronith Ranjan     Date:07/31/2017
import java.awt.*;
import javax.swing.*;
public class MovePlat extends Platform
{
   private double dy;

   public MovePlat(double x, double y, double length, double dy)
   {
      super(x, y, length);
      dy = Math.random() * 12 - 6;
   }
      
     //modifier methods 
   public void setdy(double y)
   {
      dy = y;
   }
      
      //accessor methods
   public double getdy()
   {
      return dy;
   }
      
     //instance methods
   public void move(double rightEdge, double bottomEdge)
   {
      setY(getY () + dy);
   }
   public void draw(Graphics myBuffer)
   {
      ImageIcon movePlat = new ImageIcon("images/MovePlat.png");
      myBuffer.drawImage(movePlat.getImage(),(int)getX(), (int)getY(),(int)getLength(), movePlat.getIconWidth(),null);
   }
}
