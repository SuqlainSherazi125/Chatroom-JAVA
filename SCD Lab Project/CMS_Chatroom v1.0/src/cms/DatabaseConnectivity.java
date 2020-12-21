package cms;
import java.sql.*;

/* @author suqlain sherazi*/
/* @author BCSE-5C*/

class DatabaseConnectivity {
    
    public static Connection con = null;
    
    public Connection getInstance() 
    { 
         try{
            String driverName = "oracle.jdbc.driver.OracleDriver";
            String serverName ="localhost";
            String serverPort = "1521";
            String sid = "ORACLE";
            String url = "jdbc:oracle:thin:@"+serverName + ":" + serverPort + ":"+ sid;
            con = DriverManager.getConnection(url,"SYSTEM","725554");
            System.out.println("Successfully Connected to the database.");
    }
            catch(SQLException e){
            System.out.println("Could not connect "+ e.getMessage());
            }
    
    return con;
    }
}
    
    