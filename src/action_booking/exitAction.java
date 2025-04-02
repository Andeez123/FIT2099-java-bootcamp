package action_booking;

import action_booking.Action;
import action_booking.BookingSystem;

public class exitAction implements Action {


    @Override
    public String execute(BookingSystem bookingSystem, User user){
        user.setUserDone(true);
        return "Thank you for visiting the FIT2099 vehicle.Vehicle action_booking.Booking System!";
    }

    public String menuDescription(){
        return "Exit the system.";
    }

}
