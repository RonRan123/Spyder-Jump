//Name:Ronith Ranjan     Date:07/31/2017
import java.awt.*;
public abstract class Platform
{
   private double myX,myY, myLength;
   private String name="";

   public Platform()
   {
      myX=0;
      myY=0;
      myLength=1;
   }
   public Platform(double x, double y, double length)
   {
      myX=x;
      myY=y;
      myLength=length;
   }
   public abstract void draw(Graphics myBuffer);
   public double getX() 
   { 
      return myX;
   }
   public double getY()      
   { 
      return myY;
   }
   public double getLength()
   {
      return myLength;
   }
// modifier methods
   public void setX(double x)
   {
      myX = x;
   } 
   public void setY(double y)
   {
      myY = y;
   }
   public void setLength(double length)
   {
      myLength = length;
   }
 //	 instance methods
   public void create(int rightEdge, int bottomEdge)
   {
      // moves location to random (x, y) within the edges
      myX = (Math.random()* (rightEdge-myLength));
   }

}