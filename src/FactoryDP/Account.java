package FactoryDP;

import java.util.ArrayList;

/**
 * Created by root on 13.03.16.
 */
abstract class Account {

    public static final String LINE_SEPARATOR = "-----------";

    private String ownerName;
    private double ballance;
    private double intrestRate;
    private ArrayList<Double> transactionHistory;

    public void cashIn(double payment) {
        ballance += payment;
        transactionHistory.add(payment);
    }

    public void cashOut(double withdrawal) {
        ballance -= withdrawal;
        transactionHistory.add(-withdrawal);
    }

    public void addIntrests() {
        ballance *= intrestRate;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public void setBallance(double ballance) {
        this.ballance = ballance;
    }

    public double getBallance() {
        return ballance;
    }

    public abstract void showStatus();
}
