package AdapterDP;

/**
 * An example of the new and awesome printer
 */
public class SuperPrinter2000 implements NewAndBetterPrinterInterface {
    @Override
    public void printTestPage(int numberOfPages) {
        for (int i = 0; i < numberOfPages; i++) {
            System.out.println("Printing a test page...");
        }
    }

    @Override
    public void printPage(String inputPage) {
        System.out.println(inputPage);
    }

    @Override
    public void standbyMode() {
        System.out.println("Switching to standby mode...");
    }

    @Override
    public void connectToWifi() {
        System.out.println("You're now connected to the default wifi.");

    }
}
