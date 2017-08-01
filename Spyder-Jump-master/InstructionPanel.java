//Aastha Mistry 07/31/17

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstructionPanel extends JPanel
{

   public void paintComponent (Graphics g)
   {
      ImageIcon instructions = new ImageIcon("images/HowToPlay.png");  //replace jpg with the imported instruction jpg
      g.drawImage(instructions.getImage(), 400, 400, null);
      
      JPanel subpanel = new JPanel();
   
      subpanel.setLayout(new FlowLayout());
      add(subpanel, BorderLayout.SOUTH);
      
      JButton back = new JButton("Back");
      back.addActionListener(new backListener());
      subpanel.add(back);
   }
   
   private class backListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         this.setVisible(false);  //what is "this"
         new MenuPanel.setVisible(true);
         repaint();
      }
   }
 
}