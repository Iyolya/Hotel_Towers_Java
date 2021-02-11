import java.util.ArrayList;

public class Bedroom extends Room {

    private int roomNumber;

    public Bedroom(ArrayList<Guest> guests, int roomNumber, RoomType roomType) {
        super(guests, roomType);
        this.roomNumber = roomNumber;
    }


}
