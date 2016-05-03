package AdapterDP;

/**
 * An example of an printer class that we will want to adapt
 * to the new interface using the adapter design pattern
 */
public class OldNeedlePrinter {

    public void makeTest() {
        System.out.println("..........");
    }

    public void print(String input){

        System.out.println(convertPageToDots(input));
    }

    public void switchOFF(){
        System.out.println("The printer will now switch off");
    }

    //It's a dummy method, so don't bother it's pointlessness
    private String convertPageToDots(String input) {
        input = ".. ..   .. ... ..... .";
        return input;
    }

}
