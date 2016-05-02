package BuilderDP;

/**
 * Created by root on 15.03.16.
 */
public class Bike implements BikePlan {

    private String wheels;
    private String brakes;
    private String pedals;

    public String getWheels() {
        return wheels;
    }

    public String getBrakes() {
        return brakes;
    }

    public String getPedals() {
        return pedals;
    }

    @Override
    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    @Override
    public void setBrakes(String brakes) {
        this.brakes = brakes;
    }

    @Override
    public void setPedals(String pedals) {
        this.pedals = pedals;
    }
}
