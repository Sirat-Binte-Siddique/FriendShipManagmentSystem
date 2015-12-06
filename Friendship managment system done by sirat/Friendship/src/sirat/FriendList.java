package sirat;
import java.sql.*;
import java.util.*;

public class FriendList 
{
    private Vector vector;
   
    public FriendList() 
    {
        super();
        vector = new Vector();
    }


    public Vector getTransactions () 
    {
        return vector;
    }

    public void getDatabasevalue() 
    {
        PreparedStatement s = null;
        Connection c = null;

        
        
        String sql = "SELECT * FROM new_friend";

        vector.removeAllElements();
        try {
            c = DBC.getConnection();
            s = c.prepareStatement(sql);   
            
            ResultSet r = s.executeQuery();
            while(r.next())
            {
                
               String n =  r.getString("name");
               String p =  r.getString("phone");      
             
               FriendListV ob = new FriendListV(n,p);
               vector.add(ob);
           }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
             s.close();
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
    }
    }
}

   



