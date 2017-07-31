//Aastha Mistry 07/31/17

import java.awt.*;
   
public class GreenGoblin
{
   private double myX; //x and y coordinates of the Web
   private double myY;
   private double myDiameter;
   private double myRadius;
   private double dx;
   
   //constructors
   public GreenGoblin()               // default constructor
   {
      myX = 100;
      myY = 100;
      myDiameter = 20;
      myRadius = myDiameter/2;
      dx = 10;
   }  
   public GreenGoblin(double x, double y, double d)            
   {
      myX = x;
      myY = y;
      myDiameter = d;
      myRadius = d/2;
      dx = 10;
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
   public void setdx(double x)
   {
      dx = x;
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
   public double getdx()
   {
      return dx;
   }

   //instance methods
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);                  // move horizontally
        
      if(getX() >= rightEdge - getRadius())  //hit right edge
      {
         setX(rightEdge - getRadius());
         dx = dx * -1; 
      }
      
      if(getX() <= 0 + getRadius())  //hit left edge
      {
         setX(0 + getRadius());
         dx = dx * -1;  
      }
   }
      
   public void draw(Graphics myBuffer)
   {   
      ImageIcon greenGoblin = new ImageIcon("tj.jpg"); // change the tj.jpg to the greenGoblin 
      myBuffer.drawImage(greenGoblin.getImage(), (int)getX(), (int)getY(),50, 50, null);
   }   
   
   
}