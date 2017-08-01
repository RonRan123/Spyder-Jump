//Name:Ronith Ranjan     Date:07/31/2017
import java.awt.*;
import javax.swing.*;
public class MovePlat extends Platform
{
   private double mydy;

   public MovePlat(double x, double y, double length,double width, double dy)
   {
      super(x, y, length,width);
      mydy = dy;
   }
      
     //modifier methods 
   public void setdy(double y)
   {
      mydy = y;
   }
      
      //accessor methods
   public double getdy()
   {
      return mydy;
   }
      
     //instance methods
   public void move(int rightEdge, int bottomEdge)
   {
      setY(getY() - mydy);
      
      if(getY() >= bottomEdge - 10);
      {
      setY(bottomEdge - 10);
      mydy = mydy * -1;
      }
      
      if(getY() <=0)
      {
         setY(0 );
         mydy = mydy* -1;
      
      }
      
      
   }
   public void draw(Graphics myBuffer)
   {
      ImageIcon movePlat = new ImageIcon("images/MovePlat.png");
      myBuffer.drawImage(movePlat.getImage(),(int)getX(), (int)getY(),(int)getLength(),(int) getWidth(),null);
   }
}
