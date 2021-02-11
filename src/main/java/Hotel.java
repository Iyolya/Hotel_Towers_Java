import java.util.ArrayList;

public class Hotel {


    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel(ArrayList<Bedroom>bedrooms, ArrayList<ConferenceRoom>conferenceRooms){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
    }


    public void checkInGuest(Bedroom bedroom, Guest guest){
        bedroom.addGuest(guest);
    }

    public void checkOutGuest(Bedroom bedroom, Guest guest){
        bedroom.removeGuest(guest);
    }

}
