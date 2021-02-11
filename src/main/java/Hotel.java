import java.util.ArrayList;

public class Hotel {


    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    Booking booking;

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;

    public Hotel(ArrayList<Bedroom>bedrooms, ArrayList<ConferenceRoom>conferenceRooms, ArrayList<Booking> bookings){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
    }


    public void checkInGuest(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }

    public Booking bookRoom(Bedroom bedroom, int numberOfNights){
        return booking = new Booking(numberOfNights, bedroom);
    }


    public int getBooking(){
        return this.bookings.size();
    }

}
