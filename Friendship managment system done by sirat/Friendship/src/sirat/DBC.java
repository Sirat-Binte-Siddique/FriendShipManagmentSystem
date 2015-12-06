
package sirat;
import java.sql.*;
public class DBC 
{
        private static Statement s;
	private static Statement scrollable;
	private static Connection connection;
        

    static
    {
        try {

              connection =  DriverManager.getConnection("jdbc:mysql://localhost/fshipms", "root", "");
              s = connection.createStatement();
              scrollable=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
					
            }
        catch (Exception e) 
        {
            e.printStackTrace();
        }
     }
    
    public static Connection getConnection() 
    {
        return connection;
    }
    
    public static ResultSet setScrollableQuery( String  ssql ) throws SQLException
    {
		return scrollable.executeQuery( ssql );
    }
    
    public void close() throws SQLException
    {
                connection.close();
		s.close();
		scrollable.close();
		
    }
}
