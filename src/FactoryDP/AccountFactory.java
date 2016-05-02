package FactoryDP;

/**
 * Created by root on 13.03.16.
 */
public class AccountFactory {

    static public final String BASIC_ACCOUNT = "BA";
    static public final String CREDIT_ACCOUNT = "CA";

    public Account makeAccount(String accountType) {


        if (accountType.equals(BASIC_ACCOUNT)){
            return new BasicAccount();
        } else if (accountType.equals(CREDIT_ACCOUNT)) {
            return new CreditAccount();
        } else {
            return null;
        }
    }

}
