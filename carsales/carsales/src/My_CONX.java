

import com.mysql.cj.jdbc.MysqlDataSource;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/*********************************************************
 * This class is used for making Connection to database 
 *********************************************************/
public class My_CONX {

    private static String servername = "local instance MySQL80";
    private static String username = "root";
    private static String dbname  = "cars_sales";
    private static Integer portnumber  = 3306;
    private static String password = "johnnytest";
    
    public static Connection getConnection()
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
              
        try {
                cnx = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/cars_sales", "root", "johnnytest");
        } catch (SQLException ex) {
            Logger.getLogger(" Get Connection -> " + My_CONX.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    
}
