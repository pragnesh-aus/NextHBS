package bookinggui;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import bookinggui.Booking.NEXTRoomType;

public class Booking {
	// variable declaration

	private Date checkIn = new Date();
	private Date checkOut = new Date();
	private int numberOfGuests;
	private NEXTRoomType roomType;
	private Customer bookingCustomer;

	public static class NEXTRoomType {
		private final String roomName;

		public NEXTRoomType(String roomName) {
			this.roomName = roomName;
		}

		// get and set method
		public String getName() {
			return this.roomName;
		}
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public int getNumberOfGuests() {
		return numberOfGuests;
	}

	public NEXTRoomType getRoomType() {
		return roomType;
	}

	public Customer getBookingCustomer() {
		return bookingCustomer;
	}

	public static List<NEXTRoomType> getRoomTypes() {
		return getRoomTypes();
	}

	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}

	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}

	public void setNumberOfGuests(int numberOfGuests) {
		this.numberOfGuests = numberOfGuests;
	}

	public void setRoomType(NEXTRoomType roomType) {
		this.roomType = roomType;
	}

	public void setBookingCustomer(Customer bookingCustomer) {
		this.bookingCustomer = bookingCustomer;
	}

}
