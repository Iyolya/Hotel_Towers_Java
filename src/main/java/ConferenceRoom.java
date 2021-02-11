import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private String name;

    public ConferenceRoom(ArrayList<Guest> guests, RoomType roomType, String name ){
        super(guests, roomType);
        this.name = name;
    }
}
