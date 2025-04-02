package action_booking;

import action_booking.Action;

import java.util.Scanner;

public class AddBalanceAction implements Action {

    @Override
    public String execute(BookingSystem bookingSystem, User user) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to add to your current balance: ");
        float balance = Float.parseFloat(scanner.nextLine());
        user.addBalance(balance);
        return String.format("%.2f is added to the user balance!", balance);
    }

    @Override
    public String menuDescription() {
        return "Add balance.";
    }
}
