//Name:Ronith Ranjan     Date:07/31/2017
import java.awt.*;
public abstract class Platform
{
   private double myX,myY, myLength,myWidth;
   private String name="";

   public Platform()
   {
      myX=0;
      myY=0;
      myLength=1;
      myWidth = 1;
   }
   public Platform(double x, double y, double length,double width)
   {
      myX=x;
      myY=y;
      myLength=length;
      myWidth = width;
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
   public double getWidth()
   {
   return myWidth;
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
   public void setWidth(double width)
   {
   myWidth = width;
   }
 //	 instance methods
   public void create(int rightEdge, int bottomEdge)
   {
      // moves location to random (x, y) within the edges
      myX = (Math.random()* (rightEdge-myLength));
   }
   public boolean overlap(Platform obj)
   {
      if(getX()+getLength() >= obj.getX()  &&  getX() <= obj.getX()+obj.getLength())
         return true;
      return false;
   }
   public void randomPlat(double rightEdge, double bottomEdge)
   {
      myX = (int)(Math.random() * rightEdge);
      myY = (int)(Math.random() * bottomEdge);
   }
}