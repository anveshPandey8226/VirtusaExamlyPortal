package test;




import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

import services.Booking;

public class TestBooking {
	Booking book = new Booking();

	@Test
	public void testBookingMethod() {
		assertEquals(6000, book.booking(2, 3000),0);
		assertEquals(1000, book.booking(1, 1000),0);
		try {
			book.booking(0, 5000);
			book.booking(5, 0);
			book.booking(0, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
