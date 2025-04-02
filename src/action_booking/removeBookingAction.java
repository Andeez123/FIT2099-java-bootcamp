package action_booking;

import action_booking.Action;
import action_booking.Booking;
import action_booking.BookingSystem;

public class removeBookingAction implements Action {

    private Booking myBooking;

    public removeBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }
    @Override
    public String execute(BookingSystem bookingSystem, User user){
        user.removeBookings(myBooking);
        return myBooking + " is successfully removed to the action_booking.Booking System!";
    }

    @Override
    public String menuDescription(){
        return "Remove the following vehicle to the booking system: " + "\n" + myBooking;
    }
}
