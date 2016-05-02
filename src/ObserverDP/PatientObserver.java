package ObserverDP;

/**
 * Created by root on 12.03.16.
 */
public class PatientObserver implements Observer {

    private int pulse;
    private double temperature;
    private double sugar;

    private static int observerIDtracker = 0;

    private int observerID;

    private Subject patientGrabber;

    public PatientObserver(Subject patientGrabber) {
        this.patientGrabber = patientGrabber;
        this.observerID = ++observerIDtracker;

        System.out.println("New observer registered: " + observerID);

        patientGrabber.register(this);
    }

    @Override
    public void update(int patientPulse, double patientTemperature, double patientSugarLvl) {
        pulse = patientPulse;
        temperature = patientTemperature;
        sugar = patientSugarLvl;

        printStats();
    }

    private void printStats() {
        System.out.format("Device no.%d\nPulse: %d [bpm]\n" +
                "Temperature: %.3f [C°]\nSugar: %.3f [mg/dL]\n\n",
                observerID, pulse, temperature, sugar);

    }

}
