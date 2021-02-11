import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    
    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest guest;
    
    @Before 
    public void before(){
        ArrayList<Bedroom> bedrooms = new ArrayList<Bedroom>();
        ArrayList<ConferenceRoom> conferenceRooms = new ArrayList<ConferenceRoom>();
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guest = new Guest("Sophie");
        guests.add(guest);
        bedroom = new Bedroom(guests, 237, RoomType.TRIPLE);
        bedrooms.add(bedroom);
        conferenceRoom = new ConferenceRoom(guests, RoomType.CONFERENCE, "Business Meetings");
        hotel = new Hotel(bedrooms, conferenceRooms);
    }

    @Test
    public void canCheckInGuestToRoom(){
        hotel.checkInGuest(bedroom, guest);
        assertEquals(1, bedroom.getGuest());

    }
    @Test
    public void canCheckOutGuestFromRoom(){
        hotel.checkOutGuest(bedroom, guest);
        assertEquals(0, bedroom.getGuest());

    }
}
