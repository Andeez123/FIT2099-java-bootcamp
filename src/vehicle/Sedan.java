package vehicle;


public class Sedan extends Vehicle {

    private Integer range;
    private String EngineType;

    public Sedan(String initBrand, Integer initYear, Integer initPrice, Integer initRange, String initEngineType){
        super(initBrand, initYear, initPrice);
        range = initRange;
        EngineType = initEngineType;
    }

    @Override public String toString()
    {
        return (super.toString() + " | " + "Range: "

                + range + "km" + " | " + "Fuel Type: " + EngineType);

    }
}
