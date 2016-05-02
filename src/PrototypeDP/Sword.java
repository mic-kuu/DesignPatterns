package PrototypeDP;

/**
 * Created by root on 16.03.16.
 */
public class Sword implements Weapon {

    Sword(){
        System.out.println("Wepon is creared");
    }

    @Override
    public Weapon makeCopy() {
        System.out.println("Wepon is being cloned");
        Weapon weponCopy = null;

        try {
            weponCopy = (Weapon) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println();
            e.printStackTrace();
        }
        return weponCopy;
    }

    public String toString(){

        return "I am a mighty sword!";
    }
}
