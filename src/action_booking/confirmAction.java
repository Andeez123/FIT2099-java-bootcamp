package action_booking;

import action_booking.Action;
import action_booking.BookingSystem;

public class confirmAction implements Action {
    @Override
    public String execute(BookingSystem bookingSystem, User user){
        float currentBal = user.getBalance();
        Integer total_price = user.getPrice();
        currentBal = currentBal - total_price;
        user.addBalance(currentBal);
        user.clearBookings();
        return "Bookings confirmed. A total price of " + total_price + " has been deducted from your balance. You have " + user.getBalance() + " remaining.";
    }

    @Override
    public String menuDescription(){
        return "Confirm bookings.";
    }
}
