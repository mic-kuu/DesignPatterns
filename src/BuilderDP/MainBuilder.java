package BuilderDP;

/**
 * The Main class for playing with the Builder Design Pattern
 */
public class MainBuilder {

    public static void main (String[] args){
        BikeBuilder bikeBuilder = new ExpensiveBikeBuilder();
        BikeDirector bikeDirector = new BikeDirector(bikeBuilder);

        bikeDirector.makeBike();

        Bike goodBike = bikeDirector.getBike();

        System.out.println("BIKE CREATED!");
        System.out.println("Bike wheels: " + goodBike.getWheels());
        System.out.println("Bike brakes: " + goodBike.getBrakes());
        System.out.println("Bike pedals: " + goodBike.getPedals());


    }



}
