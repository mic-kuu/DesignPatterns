package FactoryDP;

import java.util.Scanner;

/**
 * Created by root on 13.03.16.
 */
public class MainFactory {

    public static void main (String[] args) {

        AccountFactory factory = new AccountFactory();
        Account account = null;

        Scanner userInput = new Scanner(System.in);

        System.out.println("What kind of account do you want to create? (BA / CA)? : ");

        if (userInput.hasNextLine()) {
            String accountType = userInput.nextLine();
            account = factory.makeAccount(accountType);

            if (account != null) {
                account.showStatus();
            } else {
                System.out.println("Wrong account type");
            }
        }
    }
}
