package PrototypeDP;

/**
 * Created by root on 16.03.16.
 */
public class CloneFactory {

    public Weapon getClone(Weapon weaponPrototype){
        return  weaponPrototype.makeCopy();
    }
}
