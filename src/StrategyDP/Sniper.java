package StrategyDP;

/**
 *
 * Created by root on 11.03.16.
 */
public class Sniper extends Enemy{

    public Sniper() {

        super();

        setName("Sniper");
        setSpeed(5);
        setMaxHP(80);

        attackType = new UseGun();
    }
}
