package action_booking;

import action_booking.Action;
import action_booking.ActionCapable;
import vehicle.SUV;
import vehicle.Sedan;
import vehicle.Truck;
import vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
//    public void printStatus() {
//        System.out.println("Welcome to FIT2099 action_booking.Booking System" + "\n");
//        createVehicles();
//        displayVehicles();
//        System.out.println("Thank you for visiting FIT2099 action_booking.Booking System!");
//    }
    Vehicle[] vehicles = {null, null, null, null, null, null};
    User user = new User();

    public void printStatus() {
        System.out.println("Welcome to FIT2099 action_booking.Booking System");
        createVehicles();
        consoleMenu();
    }


    public void createVehicles(){
        vehicles[0] = new Sedan("Nissan", 2024, 200, 600, "Combustion");
        vehicles[1] = new Sedan("Toyota", 2024, 300, 800, "Electric");
        vehicles[2] = new SUV("Ford", 2023, 500, 6, "Combustion");
        vehicles[3] = new SUV("Ford", 2023, 600, 7, "Electric");
        vehicles[4] = new Truck("Mercedes", 2025, 700, 2000.0);
        vehicles[5] = new Truck("Honda", 2024, 800, 1000.0);

    }


    public void consoleMenu() {
        while (!user.getUserDone()) {
            List<Action> actions = new ArrayList<>();
            List<ActionCapable> actionCapables = new ArrayList<>();
            actionCapables.add(user);
            actionCapables.addAll(List.of(vehicles));
            for (ActionCapable actionCapable : actionCapables) {
                actions.addAll(actionCapable.allowableActions());
            }

            System.out.println("#########################################");
            Action action = Menu.showMenu(actions);
            System.out.println(action.execute(this, user));
        }
    }

    public void displayVehicles(){
        for (int i = 0; i < vehicles.length; i++){
            System.out.println("action_booking.Booking Item: " + (i+1));
            System.out.println(vehicles[i] + "\n");
        }
    }
}
