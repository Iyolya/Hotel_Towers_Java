import java.util.ArrayList;

public abstract class Room {


    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(ArrayList<Guest> guests, RoomType roomType){
        this.guests = new ArrayList<Guest>();
        this.roomType = roomType;
    }


    public void addGuest(Guest guest){
        this.guests.add(guest);
    }

    public int getCapacity(){
        return this.roomType.getCapacity();
    }

    public int getGuest(){
    return this.guests.size();
    }

    public void removeGuest(Guest guest){
        this.guests.remove(guest);
    }
}