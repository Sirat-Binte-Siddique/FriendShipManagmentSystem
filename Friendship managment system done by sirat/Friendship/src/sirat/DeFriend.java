
package sirat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DeFriend extends JInternalFrame 
{
 private JTextField phone = new JTextField(40);
 private JButton delete = new JButton("Delete");
 private JButton close = new JButton("Exit");
 public DeFriend()
 {
  super("Delete Box", false, true, false, true);
  
  Container c = getContentPane();
  c.setLayout(new BorderLayout());
  
  JPanel p = new JPanel();
  p.setLayout(new GridLayout(1,2));
  
  p.add(new JLabel("Plaese Enter Your Friends Phone Number"));
  p.add(phone);
  
  c.add(p);
  
  JPanel p2 = new JPanel();
  
   delete.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent eee)
            {
                String po = phone.getText();
                
                try
                {
                    FriendInfo ob2 = new FriendInfo();
                    ob2.deleteFriend(po);
                }
                catch(Exception t)
                {
                    t.printStackTrace();
                }
            }
        });
  
   close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent eee)
            {
             System.exit(1);
            }
        });
   
  p2.add(delete);
  p2.add(close);
  c.add("South",p2);
  
  setSize(450,100);
  setResizable(false);
  
  
 }
}