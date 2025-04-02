package vehicle;

import vehicle.Vehicle;

public class Truck extends Vehicle {
    private Double loading;
    public Truck(String initBrand, Integer initYear, Integer initPrice, Double initLoad){
        super(initBrand, initYear, initPrice);
        loading = initLoad;
    }

    @Override public String toString()
    {
        return (super.toString() + " | " + "Load: "
                + loading);
    }
}
