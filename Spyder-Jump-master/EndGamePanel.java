//Ronith Ranjan 07/31/2017
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EndGamePanel extends JPanel
{
   public void paintComponent (Graphics g)
   {
      ImageIcon endGame = new ImageIcon("images/EndGame.png");  //replace jpg with the imported instruction jpg
      g.drawImage(endGame.getImage(), 400, 400, null);
      
      JPanel subpanel = new JPanel();
   
      subpanel.setLayout(new FlowLayout());
      add(subpanel, BorderLayout.SOUTH);
      
      JButton startOver = new JButton("Start Over");
      startOver.addActionListener(new startOverListener());
      subpanel.add(startOver);
   }
   
   private class startOverListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         this.setVisible(false);   //what is "this"
         new MenuPanel.setVisible(true);
         repaint();
      }
   }
   
   
   
}