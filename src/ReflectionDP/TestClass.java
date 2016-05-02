package ReflectionDP;

/**
 * Created by root on 25.03.16.
 */
public class TestClass {
    private String testField = "testField";

    private TestClass (int number) {
        System.out.println("I'm a number " + number);
    }

    private void testMethod () {
        System.out.println("I'm a test method, I don't really do anything");
    }
}
