import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void before(){
        guest = new Guest("Mr. Bean");
    }

    @Test
    public void hasName(){
        assertEquals("Mr. Bean", guest.getName());
    }

    @Test
    public void canChangeName(){
        guest.setName("Bean");
        assertEquals("Bean", guest.getName());
    }
}
