package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;
public class DBConnection {

	private static Connection con;
	public static Connection getConnection(){
		if(con == null){
		//Registering JDBC driver
            try {
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost/javaproject", "root","");
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
              
              return con;
		}
		return con;
	}

}
