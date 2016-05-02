package FactoryDP;

/**
 * Created by root on 13.03.16.
 */
public class CreditAccount extends Account {

    private double additionalFee;

    public CreditAccount() {
        setBallance(50);
        setIntrestRate(0.05);
        setAdditionalFee(2.5);
    }

    public void setAdditionalFee(double additionalFee) {
        this.additionalFee = additionalFee;
    }

    @Override
    public void showStatus() {
        System.out.format("\n%s\nACCOUNT TYPE: CREDIT ACCOUNT\nBALLANCE: %f\n", LINE_SEPARATOR, getBallance());
    }
}
