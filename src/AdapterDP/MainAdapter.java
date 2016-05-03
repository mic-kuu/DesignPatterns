package AdapterDP;

import java.util.ArrayList;
import java.util.List;

/**
 * The main playground for the Adapter Design Pattern
 */
public class MainAdapter {

    public static void main(String[] args){
        SuperPrinter2000 newPrinter = new SuperPrinter2000();
        newPrinter.printPage("Hello world");
        newPrinter.printTestPage(2);
        newPrinter.connectToWifi();
        newPrinter.standbyMode();

        OldNeedlePrinter oldPrinter = new OldNeedlePrinter();
        OldNeedlePrinterAdapter oldPrinterAdater = new OldNeedlePrinterAdapter(oldPrinter);
        oldPrinterAdater.printPage("Hello world");
        oldPrinterAdater.printTestPage(2);
        oldPrinterAdater.connectToWifi();
        oldPrinterAdater.standbyMode();

        List<NewAndBetterPrinterInterface> printerList = new ArrayList<>();
        printerList.add(newPrinter);
        printerList.add(oldPrinterAdater);

        //That's the strength of this pattern
        for(NewAndBetterPrinterInterface printer : printerList){
            printer.printPage("I can loop, even through the old one!");
        }

    }


}
