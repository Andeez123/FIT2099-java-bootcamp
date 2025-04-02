package vehicle;
import java.util.ArrayList;
import java.util.List;
import action_booking.ActionCapable;
import action_booking.Action;
import action_booking.AddBookingAction;
import action_booking.Booking;

public class Vehicle implements ActionCapable {
    private String brand;
    private Integer year;
    private Integer price;
    public Vehicle(String initBrand, Integer initYear, Integer initPrice){
        brand = initBrand;
        year = initYear;
        price = initPrice;
    }

    public String toString(){
        String s = String.format("Brand: %s", brand);
        String s2 = String.format("Year: %d", year);
        String s3 = String.format("Price: $%d ", price);

        String outString = "action_booking.Booking detail: " + s + " | " + s2 + " | "  + s3;
        return outString;
    }

    public Integer getPrice(){
        return price;
    }

    @Override
    public List<Action> allowableActions() {
        List<Action> actions = new ArrayList<>();
        Booking booking = new Booking(this);
        actions.add(new AddBookingAction(booking));
        return actions;
    }

}
