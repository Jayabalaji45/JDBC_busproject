package busBook.reserve;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BusDAO {
	

	public void display() throws SQLException {
		String query = "Select * from Bus";
		Connection con = SqlConnect.getconnect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		while (rs.next()) {
			System.out.print("Bus NO:" + rs.getInt(1) + " ");
			if (rs.getInt(2) == 0)
				System.out.print("Ac: No" + " ");
			else
				System.out.print("Ac: Yes " + " ");
			System.out.print("Capacity:" + rs.getInt(3) + " ");
			System.out.println();
		}

	}
	public int  getCapacity(int busNo) throws SQLException {
		
		String query = "select capacity from bus where id= "+ busNo;
		Connection con=SqlConnect.getconnect();
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		return rs.getInt(1);
		
	
	}
	
	}


	
