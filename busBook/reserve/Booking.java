package busBook.reserve;

import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	int busNo;
	String passangerName;
	Date Pdate;

	Booking(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Bus NO: ");
		 busNo = scan.nextInt();
		System.out.println("Enter passanger Name:");
		passangerName = scan.next();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scan.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		try {
			Pdate = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		scan.close();

	}

	public boolean isAvaliable() throws SQLException {
		BusDAO busdao = new BusDAO();
		int capacity = busdao.getCapacity(busNo);

		BookingDAO bookingdao = new BookingDAO();
		int booked = bookingdao.getBookedCount(busNo, Pdate);

		return booked < capacity;

	}

}
