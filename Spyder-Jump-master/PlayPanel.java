import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;

    
public class PlayPanel extends JPanel
{
   private static final int FRAME = 400;
   private static final Color BACKGROUND = new Color(204, 204, 204);
   
   private BufferedImage myImage;
   private Graphics myBuffer;
   private Web myWeb = null;
   private GreenGoblin myGoblin;
   private Timer t;
   private int tickCount = 0;
   private Platform regP, breakP;
   private MovePlat moveP;
   private SpyderMan spyder;

             
   public PlayPanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      myGoblin = new GreenGoblin(200, 100); //Need to generate random cordinates for goblin
      moveP = new MovePlat(150,FRAME/2,50,40,20);
      regP = new RegPlat(70,FRAME/2,50,30);
      breakP = new BreakPlat(0,FRAME/2,50,50);
    
      spyder = new SpyderMan(FRAME/2, FRAME/2);
    
      addKeyListener(new Key());
      setFocusable(true);
      t = new Timer(5, new Listener());
      t.start();
   }
       
   public void paintComponent(Graphics g)
   {
      g.drawImage(myImage, 0, 0, getWidth(), getHeight(), null);
   }
      
   private class Key extends KeyAdapter
   {
      public void keyPressed(KeyEvent e)
      {
      
         if(e.getKeyCode() == KeyEvent.VK_UP  )//UP
         {
            myWeb = new Web(spyder.getX(),spyder.getY()); //Pass the cordinates of spiderman
            
         }
         if(e.getKeyCode() == KeyEvent.VK_LEFT  )
         {
            spyder.setX(spyder.getX() - 10);
         }
         if(e.getKeyCode() == KeyEvent.VK_RIGHT  )
         {
            spyder.setX(spyder.getX() + 10);
         }
         System.out.println(spyder.getX() + " : " + spyder.getY());
         if (getX() >= FRAME)
         {
            spyder.setX(spyder.getX()-FRAME);
         }
         else if (spyder.getX() <= spyder.getWidth())
         {
            spyder.setX(spyder.getWidth());
         }
      
      }
   }
   private class Listener implements ActionListener
   {
         
          
      public void actionPerformed(ActionEvent e)
      {
         
         myBuffer.setColor(BACKGROUND);       //cover the 
         myBuffer.fillRect(0,0,FRAME,FRAME);  //old ball
         
         //myWeb instance created on UP key pressed
         if(myWeb != null)
         {
            myWeb.move(FRAME,FRAME);
            myWeb.draw(myBuffer);   
         }
         
         //Keep updating goblin in the play panel
         myGoblin.move(FRAME,FRAME);
         myGoblin.draw(myBuffer); 
         repaint();
         
         moveP.move(FRAME, FRAME);
         moveP.draw(myBuffer);
         
         regP.draw(myBuffer);
         
         breakP.draw(myBuffer);
         
         spyder.draw(myBuffer);
         
         repaint();
         
         //breakP.draw();
         
         
         //Stop the timer after 100 iterations 
         //so web disappears from the panel
         // if(tickCount++ > 100)
         // {
         //    
            // tickCount = 0;
         //    delete myWeb;
            // myWeb = null;
         // }
      }
   }
}