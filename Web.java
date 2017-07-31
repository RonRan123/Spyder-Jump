//Aastha Mistry 07/31/17

import java.awt.*;
   
public class Web
{
   private double myX; //x and y coordinates of the Web
   private double myY;
   private double myDiameter;
   private double myRadius;
   private double dy;
      
      //constructors
   public Web()               // default constructor
   {
      myX = 100;
      myY = 100;
      myDiameter = 15;
      myRadius = myDiameter/2;
      dy = 10;
   }
      
   public Web(double x, double y, double d)
   {
      myX = x;
      myY = x;
      myDiameter = d;
      myRadius = d/2;
      dy = 10;
   }
      //accessor methods
   public double getX() 
   { 
      return myX;
   }
   public double getY()      
   { 
      return myY;   
   }
   public double getDiameter() 
   { 
      return myDiameter;
   }
   public double getRadius() 
   { 
      return myRadius;
   }
   public void setdy(double y)
   {
      dy = y;
   }

      
      //modifier methods
   public void setX(double x)
   {
      myX = x;
   } 
   public void setY(double y)
   {
      myY = y;
   } 
   public void setDiameter(double d)
   {
      myDiameter = d;
      myRadius = d/2;
   }
   public void setRadius(double r)
   {
      myRadius = r;
      myDiameter = 2*r;
   }
   public double getdy()
   {
      return dy;
   }
   
      //instance methods
   public void move(double rightEdge, double bottomEdge)
   {   
      setY(getY() +dy);             // move vertically
      
      if(getY() >= bottomEdge - getRadius())  //hit bottom edge
      {
         setY(bottomEdge - getRadius());
         dy = dy * -1; 
      }
      
      if(getY() <= 0 + getRadius())  //hit top edge
      {
         setY(0 + getRadius());
         dy = dy * -1; 
      }          
   }
   
   public void draw(Graphics myBuffer)
   {  
      ImageIcon web = new ImageIcon("tj.jpg");  //change the jpg to the web
      myBuffer.drawImage(web.getImage(), (int)getX(), (int)getY(),50, 50, null);
   }
   
   
   
}