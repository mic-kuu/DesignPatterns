package StrategyDP;

public class Enemy {
    private String name;
    private int maxHP;
    private int speed;

    public Attacks attackType;

    public String attack () {
        return attackType.attack();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
