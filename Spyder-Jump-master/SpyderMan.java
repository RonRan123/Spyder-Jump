//Ronith Ranjan 
import java.awt.*;
import javax.swing.ImageIcon;

public class SpyderMan
{
   private double myX, myY, dy, dx;
   private int myWidth=50, myHeight =50;
	// default constructor, sets all to zero
   public SpyderMan(double x, double y)
   {
      myX = x;
      myY = y;
      dx = 1;
      dy = -1.0D;
   }
	
  
   public void setdy(double y) {
      dy = y;
   }
   
   public void setdx(double x) {
      dx = x;
   }

  
   public double getdy() {
      return dy;
   }
   
   public double getdx() {
      return dx;
   }
   public double getX() 
   { 
      return myX;
   }
   public double getY()      
   { 
      return myY;
   }
   public double getWidth()
   {
   return myWidth;
   }
   public void setX(double x)
   {
      myX = x;
   } 
   public void setY(double y)
   {
      myY = y;
   }


   public void move(double rightEdge, double bottomEdge)
   {
      setY(getY() + dy);
       
         if (getX() >= rightEdge)
         {
            setX(getX()-rightEdge);
         }
         else if (getX() <= myWidth)
         {
            setX(myWidth);
         }
   
      setX(getX()+ dx);                  // move horizontally
        
      if(getX() >= rightEdge - 80)  //hit right edge
      {
         setX(rightEdge - 80);
         dx = dx * -1; 
      }
      
      if(getX() <= 0)  //hit left edge
      {
         setX(0);
         dx = dx * -1;  
      }
   
   }
   public void draw(Graphics myBuffer)
   {   
      ImageIcon SpyderMan = new ImageIcon("images/SpyderMan.png"); 
      myBuffer.drawImage(SpyderMan.getImage(), (int)getX(), (int)getY(),myWidth, myHeight, null);
   } 
   public boolean collide(Platform p, double bottomEdge)
   {
      if(dy < 0)
      {
         if(getX()>= p.getX() && getX() <= p.getX() + p.getLength())
         {
            if(getY()+ myHeight >= p.getY())
            {
               return true;
            }
         }
         if(getX() <= p.getX() && getX()+ myWidth >= p.getX())
         {
            if(getY()+ myHeight >= p.getY())
            {
               return true;
            }
         }
      }
      return false;
   }   
		
}