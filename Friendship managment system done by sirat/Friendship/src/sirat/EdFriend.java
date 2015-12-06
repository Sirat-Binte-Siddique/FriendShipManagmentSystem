
package sirat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class EdFriend extends JInternalFrame
{
    private JTextField name = new JTextField(40);
    private JTextField age = new JTextField(40);
    private JTextField gender = new JTextField(40);
    private JTextField language = new JTextField(40);
    private JTextField education = new JTextField(44);
    private JTextField religion  = new JTextField(40);
    private JTextField phone = new JTextField(44);
    private JTextField facebook = new JTextField(44);
    private JTextField email = new JTextField(44);
    private JTextField country = new JTextField(44);
    private JTextField city = new JTextField(44);
    private JTextField street = new JTextField(44);
   
    private JButton edit = new JButton("Edit");
    private JButton exit = new JButton("Exit");
   
    public EdFriend()
    {
        super("Edit Friends Info");
        
        Container c = getContentPane();// ContentPane works as a container DesktopPane is added here. ContentPane can not see.
        c.setLayout(new BorderLayout());//text field border.
        
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(12,2));
        
        p.add(new JLabel("Name"));
        p.add(name);
        p.add(new JLabel("Age"));
        p.add(age);
        p.add(new JLabel("Gender"));
        p.add(gender);
        p.add(new JLabel("Language"));
        p.add(language);
        p.add(new JLabel("Education"));
        p.add(education);
        p.add(new JLabel("Religion"));
        p.add(religion);
        p.add(new JLabel("phone"));
        p.add(phone);
        p.add(new JLabel("Facebook"));
        p.add(facebook);
        p.add(new JLabel("Email"));
        p.add(email);
        p.add(new JLabel("Country"));
        p.add(country);
        p.add(new JLabel("City"));
        p.add(city);
        p.add(new JLabel("Street"));
        p.add(street);
      
       
        
        JPanel p2 = new JPanel();
        
        edit.addActionListener(new ActionListener()
                {
                   public void actionPerformed(ActionEvent ee)
                   {
                     String na = name.getText();
                     String ag = age.getText();
                     String ge = gender.getText(); 
                     String ln = language.getText(); 
                     String edu = education.getText();
                     String re = religion.getText(); 
                     String po = phone.getText();
                     String fa = facebook.getText();
                     String em = email.getText();
                     String cun = country.getText();
                     String cit = city.getText();
                     String str = street.getText();  
                     
                     try
                     {
                         FriendInfo ob1 = new FriendInfo();
                         ob1.editFriend(na,ag,ge,ln,edu,re, po, fa,em, cun, cit, str);
                     }
                     catch(Exception r)
                     {    
                        JOptionPane.showMessageDialog(null,"There is an error in EdFriend.java!!"+r.getMessage());
                         r.printStackTrace();
                     }
                       
                   }
                });
        
        exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent eee)
            {
             System.exit(1);
            }
        });
        
       
        
        p2.add(edit);
        p2.add(exit);
        c.add(p);
        c.add("South",p2);
        
        setSize(450,520);
        setResizable(false);
        
    }
    
}
