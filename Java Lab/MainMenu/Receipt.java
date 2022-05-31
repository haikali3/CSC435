import java.awt.*;
import javax.swing.*;
public class Receipt {

 JFrame frame = new JFrame();
 JLabel label = new JLabel("RECEIPT");
 
 Receipt(){
  
  label.setBounds(350,20,1000,50);
  label.setFont(new Font(null,Font.PLAIN,25));
  
  frame.add(label);
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(1000,500);
  frame.setLayout(null);
  frame.setVisible(true);
 }
}