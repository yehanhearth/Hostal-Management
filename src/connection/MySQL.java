
package connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;



public class MySQL {
    private static  final String DATABASE="rms";
    private static final String  USERNAME="root";
    private static final String PASSWORD="yehanherath987";
    private static Connection  connection=null;
    
    
    static{
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/" +DATABASE,USERNAME,PASSWORD);           
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static ResultSet executeSearch(String query) throws SQLException{
        return connection.createStatement().executeQuery(query);
    }
    public static void executeIUD(String query){
        try {
            connection.createStatement().executeUpdate(query);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
