import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        ArrayList<Guest>guests = new ArrayList<Guest>();
        guest = new Guest("Martin");
        guests.add(guest);
        conferenceRoom = new ConferenceRoom(guests, RoomType.CONFERENCE, "Business Meetings");
    }

    @Test
    public void hasName(){
        assertEquals("Business Meetings", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(100, conferenceRoom.getCapacity());
    }
}
