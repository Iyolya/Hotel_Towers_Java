import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        ArrayList<Guest> guests = new ArrayList<Guest>();
        guest = new Guest("Sophie");
        guests.add(guest);
        bedroom = new Bedroom(guests, 237, RoomType.TRIPLE );

    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.getGuest());
    }

}
