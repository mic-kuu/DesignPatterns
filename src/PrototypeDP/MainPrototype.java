package PrototypeDP;

/**
 * Created by root on 16.03.16.
 */
public class MainPrototype {

    public static void main (String[] args){
        CloneFactory cloneFactory = new CloneFactory();

        Weapon theExcalibour = new Sword();

        Weapon clonedExcalibour = (Weapon) cloneFactory.getClone(theExcalibour);

        System.out.println(theExcalibour);
        System.out.println(clonedExcalibour);

        System.out.println(System.identityHashCode(theExcalibour));
        System.out.println(System.identityHashCode(clonedExcalibour));


    }



}
