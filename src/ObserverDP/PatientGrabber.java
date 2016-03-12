package ObserverDP;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by root on 12.03.16.
 */
public class PatientGrabber implements Subject {


    int pulse;
    double temperature;
    double sugar;

    private ArrayList<Observer> observers;
    private Random generator;

    public PatientGrabber() {

        observers = new ArrayList<>();
        generator = new Random();
    }

    @Override
    public void register(Observer o) {

        observers.add(o);

    }

    @Override
    public void unregister(Observer o) {

        int observerIndex = observers.indexOf(o);
        observers.remove(observerIndex);
    }

    @Override
    public void notifyObserver() {

        for (Observer observer : observers){
            observer.update(pulse, temperature, sugar);
        }

    }

    public void getTemperature() {
        temperature = generator.nextDouble()*4 + 35;
        notifyObserver();
    }

    public void getSugar() {
        sugar = generator.nextDouble() * 30 + 70;
        notifyObserver();
    }

    public void getPulse() {
        pulse = generator.nextInt(40) + 60;
        notifyObserver();
    }
}
