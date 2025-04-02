package action_booking;

public interface Action {
    String execute(BookingSystem bookingSystem, User user);

    String menuDescription();

}
