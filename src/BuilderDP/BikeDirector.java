package BuilderDP;

/**
 * Created by root on 15.03.16.
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
