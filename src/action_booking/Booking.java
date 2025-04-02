package action_booking;

import vehicle.Vehicle;

public class Booking {
    private Vehicle vehicle;

    public Booking(Vehicle _vehicle){
        vehicle = _vehicle;
    }
    public String toString(){
        return vehicle.toString();
    }

    public Integer getPrice(){
        return vehicle.getPrice();
    }
}
