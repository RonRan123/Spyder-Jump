import javax.swing.JFrame;
    
public class DriverSpyder
{
   public static void main(String[] args)
   { 
      JFrame frame = new JFrame("Spyder Jump");
      frame.setSize(400, 700);
      frame.setLocation(100, 50);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new MenuPanel());
      frame.setVisible(true);
   }
}