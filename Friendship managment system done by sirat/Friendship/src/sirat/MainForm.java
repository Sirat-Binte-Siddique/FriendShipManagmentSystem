package sirat;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class MainForm extends JFrame
{
 private JMenuBar mb;
 
 private JMenu home;
 private JMenu friends;
 private JMenu functions;
 
 private JMenuItem lfriend;  
 private JMenuItem addfriend;
 private JMenuItem edit;
 private JMenuItem delete;
 private JMenuItem search;
 
 private JInternalFrame jframei;
 private JInternalFrame jiframe;
 private JInternalFrame jiiframe;
 private JInternalFrame jiiiframe;
 private JInternalFrame jiiiiframe;//just a variable
 private JDesktopPane jdpane;
 

 public MainForm()
 {
    super("Friendship Management System");
    setSize(550,650);
/*     
    setLayout(new BorderLayout());
    JLabel background = new JLabel(new ImageIcon("H:\\Wall Paper\\Favourite Pic\\Hd wallpaper\\Abstract\\Abstract Geometrical Blue Background Vector Graphic.png"));
    add(background);
    background.setLayout(new FlowLayout());
    
 */    
     
     jdpane = new JDesktopPane();
     getContentPane().add(jdpane) ;
     
     mb = new JMenuBar();
     
    home = new JMenu("HOME");
    friends = new JMenu("FRIENDS");
    functions = new JMenu("FUNCTION");
    
    mb.add(home);
    mb.add(friends);
    mb.add(functions);
    
    lfriend = new JMenuItem("Friend list");
    addfriend = new JMenuItem("Add friends");
    edit = new JMenuItem("Edit");
    delete = new JMenuItem("Delete");
    search = new JMenuItem("Search");
    
    lfriend.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent e)
             {
              jframei = new FriendListTable();  
              jdpane.add(jframei);
              jframei.show();
             }   
            });
    
    addfriend.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent e)
             {
              jiframe = new NewFriend();  
              jdpane.add(jiframe);
              jiframe.show();
             }   
            });
    
     edit.addActionListener(new ActionListener()
            {
             public void actionPerformed(ActionEvent e)
             {
              jiiframe = new EdFriend();  
              jdpane.add(jiiframe);
              jiiframe.show();
             }   
            });
    
    delete.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            jiiiframe = new DeFriend();
            jdpane.add(jiiiframe);
            jiiiframe.show();
            
        }
    });
    
    
      search.addActionListener(new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            jiiiiframe = new SeFriend();
            jdpane.add(jiiiiframe);
            jiiiiframe.show();

        }
    });
   
    home.add(lfriend);
    friends.add(addfriend);
    functions.add(edit);
    functions.add(delete);
    functions.add(search);
    
    setVisible(true);
    
    setLocation(300, 50);
    setJMenuBar(mb);
    

 }
 
 public static void main(String [] args)
 {
   new MainForm();  
 }
 
}
