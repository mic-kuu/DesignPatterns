package DecoratorDP;

/**
 * Created by michal on 27.03.16.
 */
public class MainDecorator {
    public static void main (String[] args) {

        EnterpriseService baseAgent = new ServiceBaseAgent();
        baseAgent.run();

        System.out.println("\n-----\n");

        EnterpriseService extendedAgent = new ExtendEnterpriseSevice(new ServiceBaseAgent());
        extendedAgent.run();


    }
}
