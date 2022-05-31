import java.awt.event.*;
import javax.swing.*;

public class LaunchPage implements ActionListener{
 
 JFrame frame = new JFrame(); 
 JButton myButton = new JButton("Login");
 
 JFrame frame2 = new JFrame();
 JButton myButton2 = new JButton("Reserve");
 
 JFrame frame3 = new JFrame();
 JButton myButton3 = new JButton("Receipt");
 
 LaunchPage(){
  
  myButton.setBounds(100,100,200,40); // (x,y,length,wide)
  myButton.setFocusable(false);
  myButton.addActionListener(this);
  
  myButton2.setBounds(100,150,200,40); 
  myButton2.setFocusable(false);
  myButton2.addActionListener(this);
  
  myButton3.setBounds(100,200,200,40); 
  myButton3.setFocusable(false);
  myButton3.addActionListener(this);
  
  frame.add(myButton); //LOGIN BUTTON
  frame.add(myButton2); //RESERVE BUTTON
  frame.add(myButton3); // RECEIPT BUTTON
  
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(420,420); //(x,y)
  frame.setLayout(null);
  frame.setVisible(true);
  
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  
  if(e.getSource()==myButton) { //if press LOGIN button, open up LOGIN window
   frame.dispose();
   Login myLogin = new Login(); 
  }
  
  if(e.getSource()==myButton2) { //if u RESERVE button. it will open up RESERVE window
   frame.dispose();
   Reserve myReserve = new Reserve(); 
  }
  
  if(e.getSource()==myButton3) { //if u RECEIPT button. it will open up RECEIPT window
   frame.dispose();
   Receipt myReceipt = new Receipt(); 
  }
 }
}