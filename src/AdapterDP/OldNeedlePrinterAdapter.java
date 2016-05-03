package AdapterDP;

/**
 * The adapter for the old printer
 */
public class OldNeedlePrinterAdapter implements NewAndBetterPrinterInterface {

    OldNeedlePrinter oldNeedlePrinter;

    public OldNeedlePrinterAdapter(OldNeedlePrinter oldNeedlePrinter) {
        this.oldNeedlePrinter = oldNeedlePrinter;
    }

    @Override
    public void printTestPage(int numberOfPages) {
        for (int i = 0; i < numberOfPages ; i++) {
            oldNeedlePrinter.makeTest();
        }
    }

    @Override
    public void printPage(String inputPage) {
        oldNeedlePrinter.print(inputPage);
    }

    @Override
    public void standbyMode() {
        oldNeedlePrinter.switchOFF();
    }

    @Override
    public void connectToWifi() {
        System.out.println("SYSTEM INFO: THIS PRINTER DOES NOT HAVE WIFI SUPPORT");
    }
}
