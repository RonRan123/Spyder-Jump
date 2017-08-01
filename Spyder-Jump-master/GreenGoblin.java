//Aastha Mistry 07/31/17
import javax.swing.*;
import java.awt.*;

   
public class GreenGoblin
{
   private double myX; //x and y coordinates of the Web
   private double myY;
   private double dx;
   
   //constructors
   public GreenGoblin()               // default constructor
   {
      myX = 100;
      myY = 100;
      dx = 1;
   }  
   public GreenGoblin(double x, double y)            
   {
      myX = x;
      myY = y;
      dx = 1;
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

   public double getdx()
   {
      return dx;
   }

   //instance methods
   public void move(double rightEdge, double bottomEdge)
   {
      setX(getX()+ dx);                  // move horizontally
        
      if(getX() >= rightEdge - 80)  //hit right edge   //changed this to 80
      {
         setX(rightEdge - 80);     //changed this to 80
         dx = dx * -1; 
      }
      
      if(getX() <= 0)  //hit left edge //changed this
      {
         setX(0);    //changed this
         dx = dx * -1;  
      }
   }
      
   public void draw(Graphics myBuffer)
   {   
      ImageIcon greenGoblin = new ImageIcon("images/GreenGoblin.png"); 
      myBuffer.drawImage(greenGoblin.getImage(), (int)getX(), (int)getY(),150, 150, null);
   }    
   
}