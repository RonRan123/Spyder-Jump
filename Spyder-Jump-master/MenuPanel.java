//Aastha Mistry 08/01/17

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel
{
   public MenuPanel()
   {
      setLayout(new BorderLayout());
      
      JPanel subpanel = new JPanel();
      subpanel.setLayout(new GridLayout(2,1));
      add(subpanel, BorderLayout.CENTER);
     
      JButton start = new JButton("Start");
      start.addActionListener(new sListener());
      subpanel.add(start);
      
      JButton how = new JButton("How to Play");
      how.addActionListener(new hListener());
      subpanel.add(how);
   }
/*
 private class sListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
          this.setVisible(false); //what is "this"
         new PlayPanel.setVisible(true);
         repaint();    
      }
   }
  
   private class hListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         this.setVisible(false);   //what is "this"
         new InstructionPanel.setVisible(true);
         repaint();
      }
   }
*/

   public void paintComponent (Graphics g)
   {
      ImageIcon menu = new ImageIcon("images/MainMenu.png"); 
      g.drawImage(menu.getImage(), 400, 400, null);
      
   }
   
}
