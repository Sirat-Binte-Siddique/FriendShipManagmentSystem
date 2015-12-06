package sirat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SeFriend extends JInternalFrame 
{
 private JTextField phone = new JTextField(40);
 private JButton search = new JButton("Search");
 private JButton close = new JButton("Exit");
 public SeFriend()
 {
  super("Search Box");
  
  Container c = getContentPane();
  c.setLayout(new BorderLayout());
  
  JPanel p = new JPanel();
  p.setLayout(new GridLayout(1,2));
  
  p.add(new JLabel("Phone Number"));
  p.add(phone);
  
  c.add(p);
  
  JPanel p2 = new JPanel();
  
   search.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent eeee)
            {
                String po = phone.getText();
                
                try
                {
                    FriendInfo ob3 = new FriendInfo();
                    ob3.searchFriend(po);
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
   
  p2.add(search);
  p2.add(close);
  c.add("South",p2);
  
  setSize(450,100);
  setResizable(false);
  
  
 }
}
