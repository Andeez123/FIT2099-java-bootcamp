package vehicle;

import vehicle.Vehicle;

public class SUV extends Vehicle {

    private Integer seats;
    private String EngineType;

    public SUV(String initBrand, Integer initYear, Integer initPrice, Integer initSeats, String initEngineType){
        super(initBrand, initYear, initPrice);
        seats = initSeats;
        EngineType = initEngineType;
    }

    @Override public String toString()
    {
        return (super.toString() + " | " + "Number of Seats: "
                + seats + " | " + "Fuel Type: " + EngineType);
    }
}