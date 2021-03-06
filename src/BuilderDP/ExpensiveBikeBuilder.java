package BuilderDP;

/**
 * The implementation of an Expensive Bike
 */
public class ExpensiveBikeBuilder implements BikeBuilder {

    private Bike bike;

    ExpensiveBikeBuilder() {
        this.bike = new Bike();

    }


    @Override
    public void buildWheels() {
        bike.setWheels("Goodwheels");

    }

    @Override
    public void buildBrakes() {
        bike.setBrakes("GoodBreaks");
    }

    @Override
    public void buildPedals() {
        bike.setPedals("GoodPedals");

    }

    @Override
    public Bike getBike() {
        return bike;
    }
}
