
package sirat;
import java.sql.*;
import javax.swing.JOptionPane;
public class FriendInfo 
{
     Connection c = null;
     PreparedStatement st = null;
     ResultSet r = null;
    
    public void addFriend(String n,String a,String g,String l,String ed,String re,String p,String fa,String e,String co,String ci,String s) throws SQLException 
    {
       String sql = "INSERT INTO new_friend VALUES(?,?,?,?,?,?,?,?,?,?,?,?)"; 
       
       try
       {
      c = DBC.getConnection();
      st = c.prepareStatement(sql);
      
      st.setString(1,n);
      st.setString(2,a);
      st.setString(3,g);
      st.setString(4,l);
      st.setString(5,ed);
      st.setString(6,re);
      st.setString(7,p);
      st.setString(8,fa);
      st.setString(9,e);
      st.setString(10,co);
      st.setString(11,ci);
      st.setString(12,s);
      
      int j= st.executeUpdate();
      
      if(j>=1)
      {
          JOptionPane.showMessageDialog(null,n+"'s information has added!!");
      }
       }
       catch(Exception we)
       {
           JOptionPane.showMessageDialog(null,"There is same data!!"+we.getMessage());
           we.printStackTrace();
           st.close();
       }
    
}
    public void editFriend(String n,String a,String g,String l,String ed,String re,String p,String fa,String e,String co,String ci,String s) throws SQLException 
    {
       String sql = "UPDATE new_friend SET name=?,age=?,gender=?,language=?,education=?,religion=?,facebook=?,email=?,country=?,city=?,street=? WHERE phone=?"; 
       
       try
       {
      c = DBC.getConnection();
      st = c.prepareStatement(sql);
      
      st.setString(1,n);
      st.setString(2,a);
      st.setString(3,g);
      st.setString(4,l);
      st.setString(5,ed);
      st.setString(6,re);
      st.setString(7,fa);
      st.setString(8,e);
      st.setString(9,co);
      st.setString(10,ci);
      st.setString(11,s);
      st.setString(12,p);
      
      int i = st.executeUpdate();
      
      if(i>=1)
      {
          JOptionPane.showMessageDialog(null,"Data for "+p+" has updated!!");
      }
      
       }
       catch(Exception we)
       {
           JOptionPane.showMessageDialog(null,"Data for "+p+" didn't updated!!"+we.getMessage());
           we.printStackTrace();
           st.close();
       }
    
}
    
    public void deleteFriend(String p) throws SQLException
    {
      String sql = "DELETE FROM new_friend WHERE phone=?";
      
      try
      {
          c = DBC.getConnection();
          st = c.prepareStatement(sql);
          
          st.setString(1, p);
          
          int k = st.executeUpdate();
          
          if(k>=1)
          {
           JOptionPane.showMessageDialog(null,"Data for "+p+" has deleted!!");   
          }
      }
          catch(Exception ee)
          {
           JOptionPane.showMessageDialog(null,"Data for "+p+" didn't updated!!"+ee.getMessage());
           ee.printStackTrace();
           st.close();
          }   
      
    }
    
    String nam,age,gen,lan,edu,reli,pho,fac,eml,str,ci,con;
    public void searchFriend(String p) throws SQLException 
    {
       String sql = "SELECT * FROM new_friend  WHERE phone=?"; 
       
       try
       {
      c = DBC.getConnection();
      st = c.prepareStatement(sql);
      st.setString(1, p);
      
      r = st.executeQuery();
      while(r.next())
      { 
        nam = r.getString("name");
        age = r.getString("age");
        gen = r.getString("gender");
        lan = r.getString("language");
        edu = r.getString("education");
        reli = r.getString("religion");
        pho= r.getString("phone");
        fac = r.getString("facebook");
        eml= r.getString("email");
        con = r.getString("country");
        ci = r.getString("city");
        str = r.getString("street");
        JOptionPane.showMessageDialog(null,"Thie Information for  :  "+pho+"\n\nName"
                +"         : "+nam+ "\nAge             : "+age+"\n"
        + "Gender       : "+gen+"\nLanguage  : "+lan+ "\nEducation  : "+edu+"\nReligion      : "+reli+"\nPhone"
                + "         : "+pho+ "\nFacebook   : "+fac+"\n"
        + "Email           : "+eml+"\nCountry      : "+con+ "\nCity              : "+ci+"\nStreet          : "+str);
      }  
      
       st.executeUpdate();
      }
       catch(Exception we)
       {
           JOptionPane.showMessageDialog(null,"Please search again for "+p+"!!");
           we.printStackTrace();
           st.close();
       }
    
}
}