//Ronith Ranjan 
import java.awt.*;
import javax.swing.ImageIcon;

public class SpyderMan
{
   private double myX, myY, dy;

	// default constructor, sets all to zero
   public SpyderMan(double x, double y)
   {
      myX = x;
      myY = y;
      dy = (Math.random() * 12.0D - 6.0D);
   }
	
   public void setdx(double x)
   {
      dx = x;
   }
  
   public void setdy(double y) {
      dy = y;
   }
  

   public double getdx()
   {
      return dx;
   }
  
   public double getdy() {
      return dy;
   }
  
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX() + dx);
      setY(getY() + dy);
    
   
      if (getX() >= rightEdge - getRadius())
      {
         setX(rightEdge - getRadius());
         dx *= -1.0D;
      }
      else if (getX() <= getRadius())
      {
         setX(getRadius());
         dx *= -1.0D;
      }
    
   
      if (getY() >= bottomEdge - getRadius())
      {
         setY(bottomEdge - getRadius());
         dy *= -1.0D;
      }
      else if (getY() <= getRadius())
      {
         setY(getRadius());
         dy *= -1.0D;
      }
   }
		
}