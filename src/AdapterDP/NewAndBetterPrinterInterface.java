package AdapterDP;

/**
 * An interface of new kind of Printers
 * that print with laser and are able to connect to WiFi
 */
public interface NewAndBetterPrinterInterface {

    void printTestPage(int numberOfPages);
    void printPage(String inputPage);
    void standbyMode();
    void connectToWifi();

}
