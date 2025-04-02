package action_booking;

import action_booking.Action;
import action_booking.BookingSystem;
import action_booking.User;

public class viewBalanceAction implements Action {



    @Override
    public String execute(BookingSystem bookingSystem, User user){
        double amount = user.getBalance();
        String ret_string = "You have a balance of $" + amount;
        return ret_string;
    }

    @Override
    public String menuDescription(){
        return "View Balance.";
    }
}
