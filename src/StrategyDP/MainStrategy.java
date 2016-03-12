package StrategyDP;

/**
 * Created by root on 11.03.16.
 */
public class MainStrategy {
    public static void main (String[] args) {

        Enemy lastSamurai = new Ninja();
        Enemy whiteDeath = new Sniper();

        System.out.println(lastSamurai.getName() + ": " + lastSamurai.attack());
        System.out.println(whiteDeath.getName() + ": " + whiteDeath.attack());
    }
}
