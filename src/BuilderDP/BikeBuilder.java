package BuilderDP;

/**
 * The interface for building a Bike
 */
public interface BikeBuilder {
    void buildWheels();
    void buildBrakes();
    void buildPedals();
    Bike getBike();
}
