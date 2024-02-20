package busBook.reserve;

import java.sql.*;
import java.util.Date;

public class BookingDAO {
	

		
	public int getBookedCount(int busNo, Date date) throws SQLException {
		
		String query = "select count(passangerName) from booking where busNo=? and date=?";
		Connection con = SqlConnect.getconnect();
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, busNo);
		java.sql.Date sqldate = new java.sql.Date(date.getTime());
		ps.setDate(2, sqldate);

		ResultSet rs = ps.executeQuery();
		rs.next();
		return rs.getInt(1);

	}
	public void addBooking(Booking booking) throws SQLException {
		String query = "Insert into booking values (?,?,?)";
		Connection con = SqlConnect.getconnect();
		java.sql.Date sqldate = new java.sql.Date(booking.Pdate.getTime());
		PreparedStatement pst = con.prepareStatement(query);

		pst.setInt(1, booking.busNo);
		pst.setString(2, booking.passangerName);
		pst.setDate(3,sqldate);

		
		int row = pst.executeUpdate();
		System.out.println("No of row:" + " " + row);
		con.close();

	}

}
