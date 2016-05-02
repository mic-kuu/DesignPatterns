package FactoryDP;

/**
 * Created by root on 13.03.16.
 */
public class BasicAccount extends Account {

    public BasicAccount() {
        setBallance(0);
        setIntrestRate(0.05);

    }

    public void showStatus() {
        System.out.format("\n%s\nACCOUNT TYPE: BASIC ACCOUNT\nBALLANCE: %f\n", LINE_SEPARATOR, getBallance());
    }
}
