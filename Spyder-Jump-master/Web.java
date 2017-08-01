//Aastha Mistry 07/31/17
import javax.swing.*;
import java.awt.*;

   
public class Web
{
   private double myX; //x and y coordinates of the Web
   private double myY;
   private double dy;
      
      //constructors
   public Web()               // default constructor
   {
      myX = 100;
      myY = 100;
      dy = 5;       //speed of moving up
   }
      
   public Web(double x, double y)
   {
      myX = x;
      myY = x;
      dy = 5;     //speed of moving
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
   public double getdy()
   {
      return dy;
   }

   //modifier methods
   public void setdy(double y)
   {
      dy = y;
   }  
   public void setX(double x)
   {
      myX = x;
   } 
   public void setY(double y)
   {
      myY = y;
   } 
   
   //instance methods
   public void move(double rightEdge, double bottomEdge)
   {   
      setY(getY()-dy); // move vertically up so deduct dy      
   }
   
   public void draw(Graphics myBuffer)
   {  
      ImageIcon web = new ImageIcon("images/web.png");  //change the jpg to the web
      myBuffer.drawImage(web.getImage(), (int)getX(), (int)getY(),25, 25, null);
   }
   
}