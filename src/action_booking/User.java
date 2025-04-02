package action_booking;

import action_booking.*;

import java.util.ArrayList;
import java.util.List;

public class User implements ActionCapable {

    private float Balance;
    private boolean isUserDone = false;
    private List<Booking> listOfBooking = new ArrayList<Booking>();

    public float getBalance(){
        return Balance;
    }

    public void addBalance(float _Balance){
        Balance = _Balance;
    }

    public Integer getPrice(){
        Integer price = 0;
        for(Booking booking: listOfBooking){
            price += booking.getPrice();
        }
        return price;
    }

    public boolean getUserDone(){
        return  isUserDone;
    }

    public void setUserDone(boolean _isUserDone){
        isUserDone = _isUserDone;
    }

    public void addBookings(Booking booking){
        listOfBooking.add(booking);
    }

    public void removeBookings(Booking booking){
        listOfBooking.remove(booking);
    }

    public void clearBookings(){
        this.listOfBooking.clear();
    }

    public List<Booking> getListOfBooking(){
        return listOfBooking;
    }

    public String displayBookedVehicles(){
        String ret_string = "";
        for (Booking bookings: listOfBooking){
            ret_string += bookings.toString();
        }
        return ret_string;
    }

    @Override
    public List<Action> allowableActions(){
        List<Action> actions = new ArrayList<>();
        actions.add(new AddBalanceAction());
        actions.add(new viewBalanceAction());
        actions.add(new displayBookingAction());
        actions.add(new confirmAction());
        actions.add(new exitAction());
        for(Booking booking : listOfBooking){
            actions.add(new removeBookingAction(booking));
        }
        return actions;
    }

}
