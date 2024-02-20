package busBook.reserve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnect {
	
	private static final String url ="jdbc:mysql://localhost:3306/Busreserve";
	private static final  String name = "root";
	private static final  String pass= "root1234+-/#";
	
	
      public static Connection getconnect() throws SQLException{
		return DriverManager.getConnection(url,name,pass);
	}

}
