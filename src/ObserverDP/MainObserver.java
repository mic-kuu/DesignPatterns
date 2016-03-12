package ObserverDP;

/**
 * Created by root on 12.03.16.
 */
public class MainObserver {
    public static void main (String[] args){

        PatientGrabber patientGrabber = new PatientGrabber();

        PatientObserver device1 = new PatientObserver(patientGrabber);
        PatientObserver device2 = new PatientObserver(patientGrabber);

        patientGrabber.getPulse();
        patientGrabber.getPulse();
        patientGrabber.getPulse();

    }
}
