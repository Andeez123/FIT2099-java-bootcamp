package action_booking;

import action_booking.Action;
import action_booking.BookingSystem;

public class displayBookingAction implements Action {

    @Override
    public String execute(BookingSystem bookingSystem, User user){
        String ret_string = user.displayBookedVehicles();
        return ret_string;
    }

    @Override
    public String menuDescription(){
        return "View bookings.";
    }
}
