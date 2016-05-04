package BuilderDP;

/**
 * The director class
 */
public class BikeDirector {
    private BikeBuilder bikeBuilder;

    public BikeDirector(BikeBuilder bikeBuilder){
        this.bikeBuilder = bikeBuilder;
    }

    public Bike getBike(){
        return this.bikeBuilder.getBike();
    }

    public void makeBike(){
        this.bikeBuilder.buildBrakes();
        this.bikeBuilder.buildPedals();
        this.bikeBuilder.buildWheels();
    }
}
