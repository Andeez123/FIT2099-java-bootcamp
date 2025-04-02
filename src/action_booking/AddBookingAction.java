package action_booking;

import action_booking.Action;

public class AddBookingAction implements Action {
    private Booking myBooking;
    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    @Override
    public String execute(BookingSystem bookingSystem, User user) {
        user.addBookings(myBooking);
        return myBooking + " is successfully added to the action_booking.Booking System!";

    }

    @Override
    public String menuDescription() {
        return "Add the following vehicle to the action_booking.Booking System: " + myBooking;
    }
}