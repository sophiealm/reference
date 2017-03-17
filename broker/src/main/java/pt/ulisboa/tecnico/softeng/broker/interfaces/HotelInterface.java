package pt.ulisboa.tecnico.softeng.broker.interfaces;

import org.joda.time.LocalDate;

import pt.ulisboa.tecnico.softeng.hotel.dataobjects.RoomBookingData;
import pt.ulisboa.tecnico.softeng.hotel.domain.Hotel;
import pt.ulisboa.tecnico.softeng.hotel.domain.Room;

public class HotelInterface {
	public static String reserveRoom(Room.Type type, LocalDate arrival, LocalDate departure) {
		return Hotel.reserveRoom(type, arrival, departure);
	}

	public static String cancelBooking(String roomConfirmation) {
		return Hotel.cancelBooking(roomConfirmation);
	}

	public static RoomBookingData getRoomBookingData(String roomConfirmation) {
		// TODO invoke remote
		return null;
	}
}
