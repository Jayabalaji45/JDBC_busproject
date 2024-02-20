package busBook.reserve;
import java.util.Scanner;

public class BusReserve {

	public static void main(String[] args)  {

		BusDAO busdao = new BusDAO();
		try {
		busdao.display();

		System.out.println("Are You Want To Book a bus ticket");
		System.out.println("enter 1 to book or enter 2 for exist");

		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		if (val==1) {
			Booking booking = new Booking();
			if (booking.isAvaliable()){
				BookingDAO bookingdao = new BookingDAO();
				bookingdao.addBooking(booking);				
				System.out.println("Your Booking is Confirmed");

			} 
			else {
				System.out.println("Bus is full try another date or time");
			}

		} 
		else {
			System.out.println("ok,Bye");
		}
		scan.close();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}

}
