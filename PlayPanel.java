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

             
   public PlayPanel()
   {
      myImage =  new BufferedImage(FRAME, FRAME, BufferedImage.TYPE_INT_RGB);
      myBuffer = myImage.getGraphics();
      myBuffer.setColor(BACKGROUND);
      myBuffer.fillRect(0, 0, FRAME,FRAME);
      myGoblin = new GreenGoblin(200, 100); //Need to generate random cordinates for goblin
    
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
            myWeb = new Web(200,480); //Pass the cordinates of spiderman
         
            
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
         //Stop the timer after 100 iterations 
         //so web disappears from the panel
         if(tickCount++ > 100)
         {
            
            tickCount = 0;
            //delete myWeb;
            myWeb = null;
         }
      }
   }
}