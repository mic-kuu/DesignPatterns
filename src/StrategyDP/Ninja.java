package StrategyDP;


public class Ninja extends Enemy {

    public Ninja() {

        super();

        setName("Ninja");
        setSpeed(20);
        setMaxHP(100);

        attackType = new UseSword();
    }


}
